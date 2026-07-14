/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jl {
    int field_o;
    private int field_i;
    ih field_h;
    private int field_g;
    private String[] field_b;
    private String field_m;
    static cn field_n;
    static int field_a;
    private int field_j;
    private int field_e;
    private int field_k;
    int field_d;
    static String field_l;
    int field_f;
    static int[] field_p;
    static String field_c;

    void a(int param0, ih param1, int param2, int param3) {
        int var5 = 107 / ((param3 - 47) / 60);
        ((jl) this).field_k = param2;
        ((jl) this).field_j = param0;
        ((jl) this).field_h = param1;
        this.a((byte) 102);
    }

    final int a(String[] param0, int param1) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (((jl) this).field_h != null) {
          if (param0 == null) {
            return 0;
          } else {
            if (param0.length == 0) {
              return 0;
            } else {
              var3 = 0;
              var4 = param0;
              var5 = param1;
              L0: while (true) {
                if (var4.length <= var5) {
                  return var3;
                } else {
                  var6 = var4[var5];
                  var7 = ((jl) this).field_h.b(var6);
                  if (var3 <= var7) {
                    var3 = var7;
                    var5++;
                    continue L0;
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    private final void a(byte param0) {
        int var2 = 640;
        if (param0 <= 39) {
            field_c = null;
        }
        ((jl) this).field_d = var2 / 2;
        ((jl) this).field_g = var2 / 2;
        ((jl) this).field_o = var2 * 3 / 4;
        ((jl) this).field_f = ((jl) this).c((byte) 111);
        ((jl) this).field_i = ((jl) this).field_f / 2;
        ((jl) this).field_e = ((jl) this).field_f + (((jl) this).field_i - -this.a(((jl) this).field_b, (byte) 113));
    }

    final static void b(int param0) {
        se.a((byte) 86, oc.d((byte) -91));
        if (param0 != 2) {
            jl.a(8);
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != -30082) {
            jl.a(113);
        }
        field_l = null;
        field_p = null;
        field_c = null;
    }

    final int b(int param0, int param1) {
        if (((jl) this).field_h == null) {
            return param0;
        }
        if (!(((jl) this).field_m != null)) {
            return param0;
        }
        if (!(((jl) this).field_m.length() != 0)) {
            return param0;
        }
        ((jl) this).field_h.c(((jl) this).field_m, ((jl) this).field_g, param0, ((jl) this).field_k, -1);
        if (param1 != 13947) {
            return 12;
        }
        return ((jl) this).field_f - -((jl) this).field_i;
    }

    final int a(boolean param0) {
        if (!param0) {
            ((jl) this).field_f = 117;
        }
        return ((jl) this).field_o;
    }

    private final void a(boolean param0, int param1) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String[] var17 = null;
        var16 = EscapeVector.field_A;
        if (((jl) this).field_h != null) {
          if (((jl) this).field_b == null) {
            return;
          } else {
            if (-1 != (((jl) this).field_b.length ^ -1)) {
              L0: {
                var17 = ((jl) this).field_b;
                if (param0) {
                  break L0;
                } else {
                  ((jl) this).a((byte) 91, 82);
                  break L0;
                }
              }
              var4 = 0;
              L1: while (true) {
                if (var17.length <= var4) {
                  return;
                } else {
                  var5 = var17[var4];
                  if (var5 != null) {
                    if (var5.length() != 0) {
                      var6 = 640;
                      var7 = (-((jl) this).field_o + var6) / 2;
                      var8 = param1 + -((jl) this).field_h.field_r;
                      var9 = ((jl) this).field_o;
                      var10 = ((jl) this).field_j;
                      var11 = -1;
                      var12 = 1;
                      var13 = 0;
                      var14 = ((jl) this).field_f;
                      var15 = ((jl) this).field_h.a(var5, var7, var8, var9, param1, var10, var11, var12, var13, var14);
                      param1 = param1 + var15 * ((jl) this).field_f;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1) {
        ((jl) this).field_d = ((jl) this).field_d + param1;
        ((jl) this).field_g = ((jl) this).field_g + param1;
        if (param0 > -64) {
            ((jl) this).field_f = 52;
        }
    }

    final int b(byte param0) {
        if (param0 != -90) {
            this.a((byte) -46);
        }
        return ((jl) this).field_e;
    }

    private final int a(String[] param0, byte param1) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (((jl) this).field_h != null) {
          if (param0 == null) {
            return 0;
          } else {
            if (param0.length == 0) {
              return 0;
            } else {
              L0: {
                if (param1 > 97) {
                  break L0;
                } else {
                  ((jl) this).field_e = 12;
                  break L0;
                }
              }
              var3 = 0;
              var4 = param0;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  return var3;
                } else {
                  var6 = var4[var5];
                  if (var6 != null) {
                    if (0 != var6.length()) {
                      var7 = ((jl) this).field_h.a(var6, ((jl) this).field_o);
                      var3 = var3 + var7 * ((jl) this).field_f;
                      var5++;
                      continue L1;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    final int c(byte param0) {
        if (param0 <= 98) {
            return -42;
        }
        int var2 = 0;
        if (((jl) this).field_h != null) {
            var2 = ((jl) this).field_h.field_r + ((jl) this).field_h.field_x;
        } else {
            var2 = 0;
        }
        return var2;
    }

    void a(int param0, int param1) {
        if (null == ((jl) this).field_h) {
            return;
        }
        int var3 = ((jl) this).field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + ((jl) this).b(param0, 13947);
        this.a(true, param0);
        if (param1 != 3) {
            ((jl) this).field_h = null;
        }
    }

    jl(String param0, String[] param1) {
        if (param0 != null) {
            ((jl) this).field_m = param0.toUpperCase();
        }
        ((jl) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 35;
        field_n = new cn();
        field_l = "Please try again in a few minutes.";
        field_p = new int[8192];
        field_c = "Restarting level";
    }
}
