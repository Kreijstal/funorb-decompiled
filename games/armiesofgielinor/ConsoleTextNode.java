/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleTextNode extends IntrusiveNode {
    static int[] field_n;
    String text;
    static RgbSprite[] field_k;
    static int field_m;
    static String field_o;
    static TutorialController[] field_p;

    public static void a(int param0) {
        field_p = null;
        field_k = null;
        field_o = null;
        if (param0 != -22823) {
          ConsoleTextNode.a(53);
          field_n = null;
          return;
        }
        field_n = null;
    }

    final static void pushRasterState(byte obfuscationGuard) {
        RasterState snapshot = (RasterState) (EventPresenter.rasterStatePool.popLast((byte) -121));
        if (snapshot == null) {
          snapshot = new RasterState();
        }
        if (obfuscationGuard == -56) {
          snapshot.capture(SoftwareRaster.clipBottom, SoftwareRaster.clipLeft, SoftwareRaster.clipRight, SoftwareRaster.pixels, SoftwareRaster.clipTop, SoftwareRaster.height, SoftwareRaster.width, -89);
          ParasiteEvent.rasterStateStack.addLast((byte) -119, (IntrusiveNode) (snapshot));
          return;
        }
    }

    final static void showAccountRegistration(boolean obfuscationGuard) {
        IsaacRandom.field_g = new AccountRegistrationForm();
        if (obfuscationGuard) {
          ConsoleTextNode.pushRasterState((byte) 79);
          lt.loginDialog.replaceContent(IsaacRandom.field_g, (byte) 78);
          return;
        }
        lt.loginDialog.replaceContent(IsaacRandom.field_g, (byte) 78);
    }

    ConsoleTextNode(String text) {
        try {
          this.text = text;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rq.<init>(" + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = GuestPlayConfirmationForm.a(-68);
        field_o = "Invalid password.";
        field_p = new TutorialController[29];
    }
}
