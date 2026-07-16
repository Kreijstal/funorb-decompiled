/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    private int field_e;
    private int field_f;
    static String field_d;
    private int field_g;
    float field_a;
    String field_b;
    static rg field_h;
    private qk[] field_c;

    final static int a(int param0, ih param1) {
        if (param0 != -1) {
            Object var3 = null;
            int discarded$0 = uc.a(88, (ih) null);
            return param1.field_r;
        }
        return param1.field_r;
    }

    final static int b(int param0) {
        if (param0 < 65) {
            return 2;
        }
        return 1;
    }

    private final void a(int param0, mf param1, int param2, String param3, String param4, String param5) {
        qk[] var7 = null;
        qk var7_ref = null;
        qk var8 = null;
        qk[] var9 = null;
        qk var10 = null;
        L0: {
          if (((uc) this).field_c.length <= ((uc) this).field_f) {
            var9 = new qk[2 * ((uc) this).field_f];
            var7 = var9;
            qg.a((Object[]) (Object) ((uc) this).field_c, 0, (Object[]) (Object) var9, 0, ((uc) this).field_f);
            ((uc) this).field_c = var9;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new qk();
        var10 = var8;
        var7_ref = var10;
        if (param2 != 1) {
          boolean discarded$6 = ((uc) this).a(20);
          var10.field_i = param5;
          var10.field_d = param4;
          var10.field_h = param1;
          var10.field_c = param3;
          var10.field_b = param0;
          int fieldTemp$7 = ((uc) this).field_f;
          ((uc) this).field_f = ((uc) this).field_f + 1;
          ((uc) this).field_c[fieldTemp$7] = var8;
          return;
        } else {
          var10.field_i = param5;
          var10.field_d = param4;
          var10.field_h = param1;
          var10.field_c = param3;
          var10.field_b = param0;
          int fieldTemp$8 = ((uc) this).field_f;
          ((uc) this).field_f = ((uc) this).field_f + 1;
          ((uc) this).field_c[fieldTemp$8] = var8;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -59) {
            return;
        }
        field_h = null;
        field_d = null;
    }

    final static boolean a(mf param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        var6 = param0.a(param2, (byte) -97, param3);
        var4 = var6;
        var5 = -6 / ((param1 - 6) / 55);
        if (var6 == null) {
          return false;
        } else {
          eb.a(var6, true);
          return true;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        qk var5 = null;
        var3 = EscapeVector.field_A;
        if (param0 == 7020) {
          L0: while (true) {
            if (((uc) this).field_f > ((uc) this).field_e) {
              var5 = ((uc) this).field_c[((uc) this).field_e];
              if (var5.field_h.b(0)) {
                L1: {
                  if (0 > var5.field_b) {
                    break L1;
                  } else {
                    if (var5.field_h.d(118, var5.field_b)) {
                      break L1;
                    } else {
                      this.a(var5.field_h.b(param0 + -3810, var5.field_b), -102, var5);
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var5.field_i) {
                    break L2;
                  } else {
                    if (!var5.field_h.a(0, var5.field_i)) {
                      this.a(var5.field_h.a(var5.field_i, 0), param0 + -7114, var5);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var5.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (null != var5.field_i) {
                      break L3;
                    } else {
                      if (var5.field_d == null) {
                        break L3;
                      } else {
                        if (!var5.field_h.a((byte) -119)) {
                          this.a(var5.field_h.a(-98), -17, var5);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((uc) this).field_e = ((uc) this).field_e + 1;
                continue L0;
              } else {
                this.a(0, -33, var5);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final void a(mf param0, String param1, String param2, String param3, int param4) {
        this.a(-1, param0, 1, param1, param2, param3);
        if (param4 == 14826) {
            return;
        }
        field_h = null;
    }

    private final void a(int param0, int param1, qk param2) {
        float var4 = 0.0f;
        var4 = (float)(((uc) this).field_e + 1) + (float)param0 / 100.0f;
        if (0 == param0) {
          ((uc) this).field_b = param2.field_c;
          if (param1 < -7) {
            ((uc) this).field_a = (float)((uc) this).field_g * var4 / (float)(((uc) this).field_f - -1);
            return;
          } else {
            boolean discarded$2 = ((uc) this).a(-63);
            ((uc) this).field_a = (float)((uc) this).field_g * var4 / (float)(((uc) this).field_f - -1);
            return;
          }
        } else {
          ((uc) this).field_b = param2.field_d + " - " + param0 + "%";
          if (param1 < -7) {
            ((uc) this).field_a = (float)((uc) this).field_g * var4 / (float)(((uc) this).field_f - -1);
            return;
          } else {
            boolean discarded$3 = ((uc) this).a(-63);
            ((uc) this).field_a = (float)((uc) this).field_g * var4 / (float)(((uc) this).field_f - -1);
            return;
          }
        }
    }

    final void a(String param0, byte param1, String param2, mf param3) {
        Object var6 = null;
        this.a(-1, param3, 1, param0, param2, (String) null);
        if (param1 <= -114) {
          return;
        } else {
          var6 = null;
          this.a(-32, (mf) null, 21, (String) null, (String) null, (String) null);
          return;
        }
    }

    uc(int param0) {
        ((uc) this).field_c = new qk[16];
        ((uc) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading music";
    }
}
