/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs extends ci {
    static cn field_p;
    private int field_r;
    private int[] field_q;
    private int[] field_o;
    private short[] field_m;
    private int[][] field_n;

    public static void c(int param0) {
        if (param0 >= -91) {
            field_p = null;
        }
        field_p = null;
    }

    private final int[] d(int param0, int param1) {
        if (param0 > param1) {
            return ((fs) this).field_o;
        }
        if (((fs) this).field_n.length <= param1) {
            return ((fs) this).field_q;
        }
        return ((fs) this).field_n[param1];
    }

    public fs() {
        super(1, true);
        ((fs) this).field_r = 0;
        ((fs) this).field_m = new short[257];
    }

    final static void a(byte param0, long param1, String param2) {
        wp.field_a = param2;
        int var4 = 93 / ((param0 - -33) / 53);
        bta.field_q = 2;
        CharSequence var5 = (CharSequence) (Object) param2;
        mn.field_n = jd.a(1, var5);
        ica.field_b = param1;
        bb.a(-21844);
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          var2 = ((fs) this).field_r;
          if (2 != var2) {
            if (1 == var2) {
              var2 = 0;
              L1: while (true) {
                if (257 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << -2038277884;
                  var3 = 1;
                  L2: while (true) {
                    L3: {
                      if (-1 + ((fs) this).field_n.length <= var3) {
                        break L3;
                      } else {
                        if (var4 < ((fs) this).field_n[var3][0]) {
                          break L3;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                    L4: {
                      var24 = ((fs) this).field_n[-1 + var3];
                      var35 = ((fs) this).field_n[var3];
                      var7 = (-var24[0] + var4 << -76075860) / (-var24[0] + var35[0]);
                      var8 = 4096 - lm.field_r[var7 >> -1557130555 & 255] >> 463104865;
                      var9 = -var8 + 4096;
                      var10 = var8 * var35[1] + var9 * var24[1] >> 947813388;
                      if (32767 > var10) {
                        break L4;
                      } else {
                        var10 = -32767;
                        break L4;
                      }
                    }
                    L5: {
                      if (-32769 > var10) {
                        break L5;
                      } else {
                        var10 = 32767;
                        break L5;
                      }
                    }
                    ((fs) this).field_m[var2] = (short)var10;
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              var2 = 0;
              L6: while (true) {
                if (257 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << 516201444;
                  var3 = 1;
                  L7: while (true) {
                    L8: {
                      if (var3 >= -1 + ((fs) this).field_n.length) {
                        break L8;
                      } else {
                        if (var4 >= ((fs) this).field_n[var3][0]) {
                          var3++;
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var26 = ((fs) this).field_n[var3 - 1];
                      var36 = ((fs) this).field_n[var3];
                      var7 = (var4 - var26[0] << 204886124) / (var36[0] - var26[0]);
                      var8 = -var7 + 4096;
                      var9 = var36[1] * var7 + var8 * var26[1] >> 2067492076;
                      if ((var9 ^ -1) >= 32767) {
                        var9 = -32767;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var9 >= 32768) {
                        var9 = 32767;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((fs) this).field_m[var2] = (short)var9;
                    var2++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var2 = 0;
            L11: while (true) {
              if (-258 >= (var2 ^ -1)) {
                break L0;
              } else {
                var4 = var2 << 782254020;
                var3 = 1;
                L12: while (true) {
                  L13: {
                    if (var3 >= -1 + ((fs) this).field_n.length) {
                      break L13;
                    } else {
                      if (((fs) this).field_n[var3][0] > var4) {
                        break L13;
                      } else {
                        var3++;
                        continue L12;
                      }
                    }
                  }
                  L14: {
                    var22 = ((fs) this).field_n[var3 - 1];
                    var34 = ((fs) this).field_n[var3];
                    var7 = this.d(0, -2 + var3)[1];
                    var8 = var22[1];
                    var9 = var34[1];
                    var10 = this.d(0, var3 + 1)[1];
                    var11 = (-var22[0] + var4 << 1398147340) / (var34[0] + -var22[0]);
                    var12 = var11 * var11 >> 260446764;
                    var13 = var8 + -var7 + (-var9 + var10);
                    var14 = -var13 + (var7 - var8);
                    var15 = var9 - var7;
                    var16 = var8;
                    var17 = var12 * (var11 * var13 >> -223934260) >> 2111480108;
                    var18 = var12 * var14 >> 1658844204;
                    var19 = var11 * var15 >> 1198129004;
                    var20 = var16 + (var19 + (var17 - -var18));
                    if (-32768 >= var20) {
                      var20 = -32767;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var20 >= 32768) {
                      var20 = 32767;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ((fs) this).field_m[var2] = (short)var20;
                  var2++;
                  continue L11;
                }
              }
            }
          }
        }
        L16: {
          if (param0 >= 104) {
            break L16;
          } else {
            ((fs) this).field_m = null;
            break L16;
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            return null;
        }
        int[] var8 = ((fs) this).field_i.a((byte) 50, param1);
        int[] var3 = var8;
        if (((fs) this).field_i.field_d) {
            var5 = ((fs) this).c(0, param0 ^ -33, param1);
            for (var6 = 0; var6 < ns.field_g; var6++) {
                var4 = var5[var6] >> -2005568540;
                if (0 > var4) {
                    var4 = 0;
                }
                if ((var4 ^ -1) < -257) {
                    var4 = 256;
                }
                var8[var6] = ((fs) this).field_m[var4];
            }
        }
        return var8;
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 < 21) {
            return -58;
        }
        return 7459 * param1 + param2;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            ((fs) this).field_n = null;
        }
        if (!(null != ((fs) this).field_n)) {
            ((fs) this).field_n = new int[][]{new int[2], new int[2]};
        }
        if (2 > ((fs) this).field_n.length) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (-3 == (((fs) this).field_r ^ -1)) {
            this.a(false);
        }
        tka.b((byte) 59);
        this.d((byte) 119);
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param2 == 0) {
            ((fs) this).field_r = param1.h(255);
            ((fs) this).field_n = new int[param1.h(255)][2];
            for (var4 = 0; ((fs) this).field_n.length > var4; var4++) {
                ((fs) this).field_n[var4][0] = param1.d(126);
                ((fs) this).field_n[var4][1] = param1.d(126);
            }
        }
        if (param0 != 107) {
            ((fs) this).field_r = -36;
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(ej.a(false, param0, param1))) {
            return false;
        }
        for (var2 = 0; var2 < param1.length(); var2++) {
            if (!ov.a(16, param1.charAt(var2))) {
                return false;
            }
        }
        return true;
    }

    private final void a(boolean param0) {
        int[] var13 = ((fs) this).field_n[0];
        int[] var11 = var13;
        int[] var9 = var11;
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var2 = var6;
        if (param0) {
            this.d((byte) -128);
        }
        int[] var14 = ((fs) this).field_n[1];
        int[] var4 = ((fs) this).field_n[((fs) this).field_n.length - 2];
        int[] var5 = ((fs) this).field_n[((fs) this).field_n.length - 1];
        ((fs) this).field_o = new int[]{var13[0] - var14[0] + var13[0], var13[1] - -var13[1] + -var14[1]};
        ((fs) this).field_q = new int[]{var4[0] - -var4[0] + -var5[0], var4[1] + var4[1] + -var5[1]};
    }

    static {
    }
}
