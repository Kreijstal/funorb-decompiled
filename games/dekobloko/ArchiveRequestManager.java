/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveRequestManager extends MixedSupport120 {
    byte[] byteArrayState0006;
    static char characterState0002;
    static String[] stringArrayState0013;
    static long longState0011;
    static String stringState0156;
    int integerState0207;
    MixedSupport073 mixedSupport073State0001;

    final byte[] computeByteArray0518(byte byteArgument1) {
        if (this.booleanState0173) {
          throw new RuntimeException();
        }
        if (byteArgument1 >= 65) {
          return this.byteArrayState0006;
        }
        this.computeInteger0516(true);
        return this.byteArrayState0006;
    }

    public static void performAction0517(boolean booleanArgument1) {
        stringArrayState0013 = null;
        stringState0156 = null;
        if (!booleanArgument1) {
          java.awt.Component componentLocal1 = (java.awt.Component) null;
          ArchiveRequestManager.computeFramebuffer0515(-15, (byte) 51, -90, (java.awt.Component) null);
        }
    }

    final static Framebuffer computeFramebuffer0515(int integerArgument1, byte byteArgument2, int integerArgument3, java.awt.Component componentArgument4) {
        try {
          Class classLocal1 = null;
          Throwable throwableLocal2 = null;
          RuntimeException runtimeExceptionLocal3 = null;
          Framebuffer framebufferLocal4 = null;
          SoftwareFramebuffer softwareFramebufferLocal5 = null;
          Framebuffer stackFramebufferLocal6 = null;
          Framebuffer stackFramebufferLocal7 = null;
          SoftwareFramebuffer stackSoftwareFramebufferLocal8 = null;
          RuntimeException stackRuntimeExceptionLocal9 = null;
          StringBuilder stackStringBuilderLocal10 = null;
          String stackStringLocal11 = null;
          Throwable caughtExceptionLocal12 = null;
          try {
            try {
              if (byteArgument2 < 5) {
                stackFramebufferLocal6 = (Framebuffer) null;
                return stackFramebufferLocal6;
              }
              classLocal1 = Class.forName("RenderingSupport014");
              framebufferLocal4 = (Framebuffer) (classLocal1.newInstance());
              framebufferLocal4.performAction0467(integerArgument3, (byte) 83, integerArgument1, componentArgument4);
              stackFramebufferLocal7 = framebufferLocal4;
              return stackFramebufferLocal7;
            } catch (java.lang.Throwable caughtParameterLocal13) {
              caughtExceptionLocal12 = caughtParameterLocal13;
              throwableLocal2 = caughtExceptionLocal12;
              softwareFramebufferLocal5 = new SoftwareFramebuffer();
              ((Framebuffer) ((Object) softwareFramebufferLocal5)).performAction0467(integerArgument3, (byte) 83, integerArgument1, componentArgument4);
              stackSoftwareFramebufferLocal8 = softwareFramebufferLocal5;
              return (Framebuffer) ((Object) stackSoftwareFramebufferLocal8);
            }
          } catch (java.lang.RuntimeException caughtParameterLocal14) {
            caughtExceptionLocal12 = caughtParameterLocal14;
            runtimeExceptionLocal3 = (RuntimeException) (Object) caughtExceptionLocal12;
            stackRuntimeExceptionLocal9 = runtimeExceptionLocal3;
            stackStringBuilderLocal10 = new StringBuilder().append("el.E(").append(integerArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',');
            if (componentArgument4 == null) {
              stackStringLocal11 = "null";
            } else {
              stackStringLocal11 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal15) {
          throw uncheckedExceptionLocal15;
        } catch (Throwable checkedExceptionLocal16) {
          throw new RuntimeException(checkedExceptionLocal16);
        }
    }

    ArchiveRequestManager() {
    }

    final int computeInteger0516(boolean booleanArgument1) {
        if (this.booleanState0173) {
          return 0;
        }
        if (booleanArgument1) {
          stringState0156 = (String) null;
          return 100;
        }
        return 100;
    }

    static {
        stringState0156 = "The invitation has been withdrawn.";
    }
}
