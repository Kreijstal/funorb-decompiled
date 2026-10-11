/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ama extends k {
    static String field_m;
    static kv[] field_o;
    private vo[] field_n;
    static String field_l;
    static String field_k;

    public ama() {
        super(0, true);
    }

    final int[] a(int param0, int param1) {
        int[] var4 = this.field_j.a(param0, -1);
        int[] var3 = var4;
        if (param1 != 0) {
          ama.e((byte) 27);
        }
        if (this.field_j.field_m) {
          this.a((byte) 126, this.field_j.a(false));
        }
        return var4;
    }

    final int[][] a(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = BachelorFridge.field_y;
        int[][] var3 = this.field_h.a(param1, -858);
        if (param0) {
          return (int[][]) null;
        }
        if (this.field_h.field_b) {
          var4 = hh.field_d;
          var5 = bi.field_g;
          var29 = new int[var5][var4];
          var30 = this.field_h.b(-108);
          this.a((byte) 106, var29);
          for (var8 = 0; var8 < bi.field_g; var8++) {
            var32 = var29[var8];
            var31 = var30[var8];
            var11 = var31[0];
            var12 = var31[1];
            var13 = var31[2];
            for (var14 = 0; hh.field_d > var14; var14++) {
              var15 = var32[var14];
              var13[var14] = dda.a(var15, 255) << 4;
              var12[var14] = dda.a(65280, var15) >> 4;
              var11[var14] = dda.a(var15 >> 12, 4080);
            }
          }
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        boolean stackIn_21_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          if (param2 == 0) {
            this.field_n = new vo[param1.b(param0 + 16712006)];
            for (var4_int = 0; var4_int < this.field_n.length; var4_int++) {
              var5 = param1.b(16711935);
              var6 = var5;
              if (0 != var6) {
                if (var6 != 1) {
                  if (var6 == 2) {
                    this.field_n[var4_int] = (vo) ((Object) ig.a(0, param1));
                  } else {
                    if (var6 == 3) {
                      this.field_n[var4_int] = (vo) ((Object) afa.a(param1, -128));
                    }
                  }
                } else {
                  this.field_n[var4_int] = (vo) ((Object) ch.a(false, param1));
                }
              } else {
                this.field_n[var4_int] = (vo) ((Object) pka.a(param1, false));
              }
            }
          } else {
            if (1 == param2) {
              stackIn_21_1 = (param1.b(16711935) == 1);
              this.field_f = stackIn_21_1;
            }
          }
          if (param0 != -71) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("ama.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_l = null;
        if (param0 > -107) {
          return;
        }
        field_m = null;
        field_k = null;
    }

    private final void a(byte param0, int[][] param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        vo var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = BachelorFridge.field_y;
        try {
          var3_int = hh.field_d;
          var4 = bi.field_g;
          tma.a(param1, -5);
          bm.a(it.field_r, 0, wp.field_r, -14702, 0);
          if (this.field_n != null) {
            for (var5 = 0; var5 < this.field_n.length; var5++) {
              var6 = this.field_n[var5];
              var7 = var6.field_a;
              var8 = var6.field_f;
              if (var7 < 0) {
                if (0 <= var8) {
                  var6.a(var3_int, -25222, var4);
                }
              } else {
                if (var8 >= 0) {
                  var6.a((byte) -80, var4, var3_int);
                } else {
                  var6.b(var3_int, 76, var4);
                }
              }
            }
          }
          if (param0 < 72) {
            field_l = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ama.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_m = "Set up new unrated game";
        field_l = "Unable to add friend - system busy";
        field_k = "Message game";
    }
}
