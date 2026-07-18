/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_b;
    static String field_d;
    static String field_c;
    static jp[] field_a;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = 62 / ((param1 - -48) / 54);
            var14 = new char[param0];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var5 = var11;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (~param0 >= ~var7) {
                stackOut_16_0 = new String(var14, 0, var6);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                var8 = param2[param3 - -var7] & 255;
                if (var8 == 0) {
                  var7++;
                  var7++;
                  continue L1;
                } else {
                  L2: {
                    if (var8 < 128) {
                      break L2;
                    } else {
                      if (var8 < 160) {
                        L3: {
                          var9 = ai.field_r[-128 + var8];
                          if (var9 == 0) {
                            var9 = 63;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8 = var9;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  int incrementValue$55 = var6;
                  var6++;
                  var5[incrementValue$55] = (char)var8;
                  var7++;
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("df.G(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    public static void a() {
        field_c = null;
        int var1 = 56;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        return vi.c((byte) 109);
    }

    final static Boolean a(int param0) {
        Boolean var1 = af.field_r;
        af.field_r = null;
        return var1;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = param2 >>> 31;
        return (param2 - -var3) / param0 + -var3;
    }

    final static void a(e param0) {
        try {
            na.field_Q.a((nm) (Object) param0, (byte) 3);
            ud.a(4, param0, (byte) 119);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "df.D(" + (param0 != null ? "{...}" : "null") + ',' + 4 + ',' + -161 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        tq.field_f.field_l = 0;
        tq.field_f.a(-112, 12);
        tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
        tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
        tq.field_f.a(-104, param2);
        tq.field_f.a(50, param3);
        tq.field_f.b((byte) 124, param0);
        tq.field_f.a(vn.field_F, to.field_g, 19775);
        k.field_h.e(-13413, 18);
        int fieldTemp$0 = k.field_h.field_l + 1;
        k.field_h.field_l = k.field_h.field_l + 1;
        int var4 = fieldTemp$0;
        k.field_h.a(tq.field_f.field_k, -1, 0, tq.field_f.field_l);
        k.field_h.d((byte) 125, k.field_h.field_l - var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_d = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = "Unable to add name - system busy";
    }
}
