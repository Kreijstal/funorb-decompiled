/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_b;
    static String field_d;
    static String field_c;
    static jp[] field_a;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var4 = 0;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        var4 = 62 / ((param1 - -48) / 54);
        var12 = new char[param0];
        var11 = var12;
        var5 = var11;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (param0 <= var7) {
            return new String(var12, 0, var6);
          } else {
            var8 = param2[param3 - -var7] & 255;
            if (-1 != var8) {
              L1: {
                if (-129 > var8) {
                  break L1;
                } else {
                  if ((var8 ^ -1) > -161) {
                    L2: {
                      var9 = ai.field_r[-128 + var8];
                      if (var9 == 0) {
                        var9 = 63;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var8 = var9;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var6++;
              var5[var6] = (char)var8;
              var7++;
              var7++;
              continue L0;
            } else {
              var7++;
              var7++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 112 / ((param0 - -36) / 63);
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -27790) {
            df.a((byte) 15);
            return vi.c((byte) 109);
        }
        return vi.c((byte) 109);
    }

    final static Boolean a(int param0) {
        Boolean var1 = af.field_r;
        af.field_r = null;
        if (param0 != 0) {
            return null;
        }
        return var1;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        var3 = param2 >>> -1624543745;
        if (param1 != 15) {
          field_c = null;
          return (param2 - -var3) / param0 + -var3;
        } else {
          return (param2 - -var3) / param0 + -var3;
        }
    }

    final static void a(e param0, int param1, int param2) {
        if (param2 != -161) {
          field_b = null;
          na.field_Q.a((nm) (Object) param0, (byte) 3);
          ud.a(param1, param0, (byte) 119);
          return;
        } else {
          na.field_Q.a((nm) (Object) param0, (byte) 3);
          ud.a(param1, param0, (byte) 119);
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        if (param1 != 103) {
          field_c = null;
          tq.field_f.field_l = 0;
          tq.field_f.a(-112, 12);
          tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
          tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
          tq.field_f.a(-104, param2);
          tq.field_f.a(50, param3);
          tq.field_f.b((byte) 124, param0);
          tq.field_f.a(vn.field_F, to.field_g, param1 + 19672);
          k.field_h.e(param1 ^ -13316, 18);
          k.field_h.field_l = k.field_h.field_l + 1;
          var4 = k.field_h.field_l + 1;
          k.field_h.a(tq.field_f.field_k, -1, 0, tq.field_f.field_l);
          k.field_h.d((byte) 125, k.field_h.field_l - var4);
          return;
        } else {
          tq.field_f.field_l = 0;
          tq.field_f.a(-112, 12);
          tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
          tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
          tq.field_f.a(-104, param2);
          tq.field_f.a(50, param3);
          tq.field_f.b((byte) 124, param0);
          tq.field_f.a(vn.field_F, to.field_g, param1 + 19672);
          k.field_h.e(param1 ^ -13316, 18);
          k.field_h.field_l = k.field_h.field_l + 1;
          var4 = k.field_h.field_l + 1;
          k.field_h.a(tq.field_f.field_k, -1, 0, tq.field_f.field_l);
          k.field_h.d((byte) 125, k.field_h.field_l - var4);
          return;
        }
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
