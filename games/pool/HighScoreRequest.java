/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighScoreRequest extends IntrusiveNode {
    static ServerListLauncher field_l;
    int field_v;
    String[][] field_m;
    long[][] field_q;
    static int[] field_s;
    static String invaliduserorpass;
    static int field_o;
    int field_r;
    static int field_t;
    int field_A;
    boolean field_u;
    int[][] field_z;
    static int field_x;
    static Sprite field_y;
    static int[] field_p;
    static int[] field_w;

    final static LoginTextValue c(int param0) {
        String var1 = CollisionContact.a(false);
        if (var1 != null &&
          var1.indexOf('@') >= 0) {
          var1 = "";
        }
        if (param0 == 8388) {
          return new LoginTextValue(CollisionContact.a(false), NetworkArchiveRequest.h(0));
        }
        HighScoreRequest.a(115, true);
        return new LoginTextValue(CollisionContact.a(false), NetworkArchiveRequest.h(0));
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        HighScoreSubmission var4 = null;
        HighScoreRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          var4 = (HighScoreSubmission) (GradientPaletteSupport.field_i.last((byte) 81));
          while (var4 != null) {
            WidgetContainer.a(!param1, var4, param0);
            var4 = (HighScoreSubmission) (GradientPaletteSupport.field_i.previous((byte) -5));
          }
          if (!param1) {
            HighScoreRequest.releaseStatics(104);
          }
          var5 = (HighScoreRequest) (StateIconLabel.field_Lb.last((byte) -49));
          while (var5 != null) {
            AlternateLongAndTextLoginPayload.a(var5, param0, (byte) -126);
            var5 = (HighScoreRequest) (StateIconLabel.field_Lb.previous((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "eh.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > 69) {
          field_p = null;
          field_s = null;
          invaliduserorpass = null;
          field_w = null;
          field_y = null;
          field_l = null;
          return;
        }
        BitmapFont var2 = (BitmapFont) null;
        HighScoreRequest.a(-96, 113, (Sprite[]) null, (BitmapFont) null, -106, (Sprite[]) null, 56, -114, -28, 47, (Sprite[]) null, -80, -127, (BitmapFont) null, -116, -112, -82, 45, -61, -51);
        field_p = null;
        field_s = null;
        invaliduserorpass = null;
        field_w = null;
        field_y = null;
        field_l = null;
    }

    final static void a(int param0, int param1, Sprite[] param2, BitmapFont param3, int param4, Sprite[] param5, int param6, int param7, int param8, int param9, Sprite[] param10, int param11, int param12, BitmapFont param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          if (param8 != 19539) {
            return;
          }
          Camera.a(param15, param1, param9, param14, param13, param7, param11, param18, param17, param6, new NineSliceFrame(param2), param12, param19, new NineSliceFrame(param5), param3, param0, param8 ^ 19537, param16, param4, new NineSliceFrame(param10));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("eh.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    HighScoreRequest() {
    }

    static {
        field_l = new ServerListLauncher();
        field_s = new int[12];
        field_o = 2;
        field_p = new int[12];
        field_x = 0;
        invaliduserorpass = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
