package tester;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.vxwo.springboot.experience.web.handler.FrequencyControlFailureHandler;

@Component
public class CustomFrequencyControlFailureHandler implements FrequencyControlFailureHandler {

    @Override
    public void handleFrequencyControlConcurrencyFailure(HttpServletRequest request,
            HttpServletResponse response, String method, String matchPath)
            throws ServletException, IOException {
        response.getWriter().write(ReturnCode.FAILED);
    }

    @Override
    public void handleFrequencyControlFixedIntervalFailure(HttpServletRequest request,
            HttpServletResponse response, String method, String tag, String matchPath)
            throws ServletException, IOException {
        response.getWriter().write(ReturnCode.FAILED);
    }

}
