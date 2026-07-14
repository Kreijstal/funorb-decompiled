/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static String[] field_c;
    static lh field_t;
    static volatile int field_j;
    private String field_p;
    int field_i;
    String field_h;
    static ue field_g;
    static int[] field_n;
    static String field_d;
    static String field_f;
    private int field_o;
    private long field_s;
    int[] field_a;
    int field_q;
    private boolean field_k;
    static String field_e;
    int field_b;
    static int[] field_m;
    static int field_r;
    static int[] field_l;

    final static byte[] a(int param0, byte[] param1, ia param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        var4 = param2.e(8, param0);
        if (-1 != (var4 ^ -1)) {
          L0: {
            if (param3) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param1 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param2.e(8, 3);
            var6 = (byte)param2.e(8, 8);
            if (0 >= var5) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (byte)(var6 + param2.e(8, var5));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        ia var1 = d.field_b;
        if (param0 != 10) {
            return;
        }
        while (ma.a(0)) {
            var1.d((byte) 84, 8);
            var1.field_g = var1.field_g + 1;
            var2 = var1.field_g + 1;
            rh.a(var1, (byte) -68);
            d.field_b.b(var1.field_g - var2, 31700);
        }
    }

    final static ig a(String param0, int param1, int param2) {
        if (param2 != 0) {
            field_r = -91;
        }
        ig var3 = new ig(false);
        var3.field_e = param1;
        var3.field_d = param0;
        return var3;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_n = null;
        field_c = null;
        field_l = null;
        if (param0 > -8) {
            fb.a(122);
        }
        field_f = null;
        field_t = null;
        field_m = null;
        field_e = null;
    }

    final static int a(String param0, byte param1, boolean param2) {
        if (param1 != 26) {
            return -38;
        }
        if (!param2) {
            return rh.field_h.a(param0);
        }
        return ai.field_h.a(param0);
    }

    final static String a(String param0, int param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        StringBuilder var7 = null;
        int var8 = 0;
        String var8_ref = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        var3 = param0.length();
        var4 = var3;
        var5 = -64 % ((49 - param1) / 61);
        var6 = 0;
        L0: while (true) {
          var7_int = param0.indexOf("<%", var6);
          if (0 > var7_int) {
            var7 = new StringBuilder(var4);
            var6 = 0;
            var8 = 0;
            L1: while (true) {
              var9 = param0.indexOf("<%", var6);
              if ((var9 ^ -1) > -1) {
                StringBuilder discarded$3 = var7.append(param0.substring(var8));
                return var7.toString();
              } else {
                var6 = var9 + 2;
                L2: while (true) {
                  L3: {
                    if (var6 >= var3) {
                      break L3;
                    } else {
                      if (!wc.a(48, param0.charAt(var6))) {
                        break L3;
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                  var10 = param0.substring(2 + var9, var6);
                  if (!ba.a(6, (CharSequence) (Object) var10)) {
                    continue L1;
                  } else {
                    if (var6 >= var3) {
                      continue L1;
                    } else {
                      if (param0.charAt(var6) != 62) {
                        continue L1;
                      } else {
                        var6++;
                        var11 = pd.a((CharSequence) (Object) var10, 10);
                        StringBuilder discarded$4 = var7.append(param0.substring(var8, var9));
                        var8 = var6;
                        StringBuilder discarded$5 = var7.append(param2[var11]);
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var6 = var7_int - -2;
            L4: while (true) {
              L5: {
                if (var3 <= var6) {
                  break L5;
                } else {
                  if (!wc.a(48, param0.charAt(var6))) {
                    break L5;
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
              var8_ref = param0.substring(var7_int - -2, var6);
              if (ba.a(6, (CharSequence) (Object) var8_ref)) {
                if (var3 <= var6) {
                  continue L0;
                } else {
                  if (62 == param0.charAt(var6)) {
                    var6++;
                    var9 = pd.a((CharSequence) (Object) var8_ref, 10);
                    var4 = var4 + (-var6 + var7_int + param2[var9].length());
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        }
    }

    final int b(int param0) {
        L0: {
          if (((fb) this).field_k) {
            break L0;
          } else {
            L1: {
              if (-3 != (((fb) this).field_q ^ -1)) {
                break L1;
              } else {
                if (((fb) this).field_o <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (param0 < -124) {
                break L2;
              } else {
                field_e = null;
                break L2;
              }
            }
            if (((fb) this).field_s != va.field_j) {
              if ((bd.field_f ^ -1) != -3) {
                return 0;
              } else {
                if (di.a((byte) 107, ((fb) this).field_p)) {
                  return 1;
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    fb(boolean param0) {
        ((fb) this).field_o = lj.field_i;
        ((fb) this).field_k = cf.field_r;
        ((fb) this).field_p = field_e;
        ((fb) this).field_q = pf.field_e;
        if (param0) {
            ((fb) this).field_a = se.field_o;
        } else {
            ((fb) this).field_a = null;
        }
        ((fb) this).field_s = ne.field_d;
        ((fb) this).field_h = vd.field_e;
        ((fb) this).field_b = tk.field_e;
        ((fb) this).field_i = wc.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = "Use this alternative as your account name";
        field_n = new int[256];
        field_j = 0;
        field_f = "Click";
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -257) {
            field_m = new int[8192];
            field_r = 9;
            field_l = new int[12];
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_n[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1 ^ -1) == -2) {
                  var0 = -306674912 ^ var0 >>> 2020474305;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
