/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends le {
    static ij field_j;
    private ev[] field_i;

    final static void b(int param0, int param1) {
        int var3 = VoidHunters.field_G;
        ik var4 = (ik) (Object) mhb.field_o.d(0);
        while (var4 != null) {
            aeb.a(param0, -21584, var4);
            var4 = (ik) (Object) mhb.field_o.a((byte) 8);
        }
        br var5 = (br) (Object) ca.field_p.d(param1);
        while (var5 != null) {
            eva.a(var5, -60, param0);
            var5 = (br) (Object) ca.field_p.a((byte) 112);
        }
    }

    final int[][] a(int param0, int param1) {
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
        int var16 = VoidHunters.field_G;
        int[][] var3 = ((md) this).field_d.a(param1, (byte) -92);
        if (((md) this).field_d.field_g) {
            var4 = hob.field_d;
            var5 = noa.field_o;
            var29 = new int[var5][var4];
            var30 = ((md) this).field_d.b(param0 + -134);
            this.a(true, var29);
            for (var8 = 0; noa.field_o > var8; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; var14 < hob.field_d; var14++) {
                    var15 = var32[var14];
                    var13[var14] = dla.a(255, var15) << 442637892;
                    var12[var14] = dla.a(var15, 65280) >> 2007573700;
                    var11[var14] = dla.a(16711680, var15) >> 1935175276;
                }
            }
        }
        if (param0 != 255) {
            return null;
        }
        return var3;
    }

    final int[] a(int param0, boolean param1) {
        if (!param1) {
            ((md) this).field_i = null;
        }
        int[] var4 = ((md) this).field_f.a((byte) 121, param0);
        int[] var3 = var4;
        if (((md) this).field_f.field_e) {
            this.a(param1, ((md) this).field_f.b(123));
        }
        return var4;
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        var7 = VoidHunters.field_G;
        if (param1 <= -60) {
          L0: {
            if (param0 != 0) {
              if (param0 == 1) {
                L1: {
                  stackOut_18_0 = this;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (param2.e((byte) -115) != 1) {
                    stackOut_20_0 = this;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L1;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L1;
                  }
                }
                ((md) this).field_g = stackIn_21_1 != 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              ((md) this).field_i = new ev[param2.e((byte) -105)];
              var4 = 0;
              L2: while (true) {
                if (var4 >= ((md) this).field_i.length) {
                  break L0;
                } else {
                  var5 = param2.e((byte) -104);
                  var6 = var5;
                  if (-1 == (var6 ^ -1)) {
                    ((md) this).field_i[var4] = (ev) (Object) frb.a(param2, (byte) 118);
                    var4++;
                    continue L2;
                  } else {
                    if (1 != var6) {
                      if (var6 == 2) {
                        ((md) this).field_i[var4] = (ev) (Object) ika.a(32, param2);
                        var4++;
                        continue L2;
                      } else {
                        if (3 == var6) {
                          ((md) this).field_i[var4] = (ev) (Object) uea.a(param2, -87);
                          var4++;
                          continue L2;
                        } else {
                          var4++;
                          continue L2;
                        }
                      }
                    } else {
                      ((md) this).field_i[var4] = (ev) (Object) pmb.a(126, param2);
                      var4++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public md() {
        super(0, true);
    }

    private final void a(boolean param0, int[][] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ev var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var3 = hob.field_d;
          var4 = noa.field_o;
          tt.a(param1, -98);
          pk.a(wf.field_d, 0, param0, 0, gbb.field_q);
          if (((md) this).field_i == null) {
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((md) this).field_i.length) {
                break L0;
              } else {
                var6 = ((md) this).field_i[var5];
                var7 = var6.field_e;
                var8 = var6.field_d;
                if (0 <= var7) {
                  if (-1 > var8) {
                    var6.b((byte) -112, var3, var4);
                    var5++;
                    continue L1;
                  } else {
                    var6.a(var4, (byte) 110, var3);
                    var5++;
                    continue L1;
                  }
                } else {
                  if (-1 >= var8) {
                    var6.a((byte) -99, var4, var3);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            md.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ij();
    }
}
