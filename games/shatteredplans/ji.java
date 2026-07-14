/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ji extends f implements ki {
    static ns field_G;
    static ub field_I;
    static String field_F;
    private ja field_H;
    static bi[] field_E;
    static int[][] field_D;

    abstract int d(boolean param0);

    public static void g(byte param0) {
        field_E = null;
        field_G = null;
        field_F = null;
        field_I = null;
        int var1 = 50 / ((param0 - 71) / 37);
        field_D = null;
    }

    ji(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int f(byte param0);

    public final gk a(byte param0) {
        if (param0 < 58) {
            field_I = null;
        }
        return (gk) (Object) ((ji) this).field_H;
    }

    void a(ja param0, int param1) {
        ((ji) this).field_H = param0;
        ((ji) this).field_H.field_m = (ji) this;
        if (param1 > -47) {
            Object var4 = null;
            ji.a((String[]) null, 46);
        }
    }

    abstract boolean k(int param0);

    abstract int l(int param0);

    final static int a(int param0) {
        if (param0 > -115) {
            return -24;
        }
        return kl.field_t;
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!tc.a(param0.charAt(var2), 2)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!tc.a(param0.charAt(-1 + var3), 2)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (-2 >= (var4 ^ -1)) {
                if ((var4 ^ -1) >= -13) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    var6 = var2;
                    if (param1) {
                      break L4;
                    } else {
                      int discarded$2 = ji.a(22);
                      break L4;
                    }
                  }
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (ne.a(0, (char) var7)) {
                        var8 = os.a((char) var7, -31024);
                        if (var8 != 0) {
                          StringBuilder discarded$3 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(String[] args, int param1) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = -1;
        var3 = 0;
        if (param1 == 62) {
          L0: while (true) {
            if (var3 >= args.length) {
              return;
            } else {
              L1: {
                var4 = args[var3];
                if (0 != (var2 ^ -1)) {
                  args[var3] = re.a("<col=<%0>>", nc.a(param1, 4397), new String[1]) + var4;
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = ua.a(var4, "<col=", 0);
              var6 = ua.a(var4, "</col>", param1 + -62);
              if (var5 <= var6) {
                if (var6 != -1) {
                  var2 = -1;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var7 = var4.indexOf('>', var5);
                if (var7 != -1) {
                  var8 = var4.substring(5 + var5, var7);
                  var2 = wm.a((CharSequence) (Object) var8, 16, (byte) 11);
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static kj a(int param0, String param1) {
        if (param0 != -7416) {
            int discarded$0 = ji.a(7);
        }
        if (ue.field_a == fj.field_s) {
            return null;
        }
        if (rh.field_g == fj.field_s) {
            if (param1.equals((Object) (Object) gp.field_b)) {
                fj.field_s = oj.field_Fb;
                return ij.field_a;
            }
        }
        gp.field_b = param1;
        ij.field_a = null;
        fj.field_s = ue.field_a;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Please try changing the following settings:  ";
    }
}
