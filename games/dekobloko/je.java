/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_c;
    static ak field_f;
    static cd field_b;
    private int field_d;
    private int field_e;
    private int[][] field_a;

    final static qm a(int param0, int param1) {
        qm[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qm[] var6 = null;
        var5 = client.field_A ? 1 : 0;
        var3 = -128 / ((param0 - -53) / 58);
        var6 = vj.e(-23521);
        var2 = var6;
        var4 = 0;
        L0: while (true) {
          if (var4 < var6.length) {
            if (var6[var4].field_d == param1) {
              return var6[var4];
            } else {
              var4++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var11 = client.field_A ? 1 : 0;
          if (null == ((je) this).field_a) {
            break L0;
          } else {
            var3 = (int)((long)((je) this).field_e * (long)param1.length / (long)((je) this).field_d) + 14;
            var20 = new int[var3];
            var18 = var20;
            var16 = var18;
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1.length) {
                param1 = new byte[var3];
                var12 = 0;
                var7 = var12;
                L2: while (true) {
                  if (var12 >= var3) {
                    break L0;
                  } else {
                    var8 = var20[var12] - -32768 >> -1922369712;
                    if (var8 >= -128) {
                      if (-128 > (var8 ^ -1)) {
                        param1[var12] = (byte)127;
                        var12++;
                        continue L2;
                      } else {
                        param1[var12] = (byte)var8;
                        var12++;
                        continue L2;
                      }
                    } else {
                      param1[var12] = (byte)-128;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                var8 = param1[var7];
                var19 = ((je) this).field_a[var6];
                var10 = 0;
                L3: while (true) {
                  if (14 <= var10) {
                    var6 = var6 + ((je) this).field_e;
                    var10 = var6 / ((je) this).field_d;
                    var5 = var5 + var10;
                    var6 = var6 - var10 * ((je) this).field_d;
                    var7++;
                    continue L1;
                  } else {
                    var4[var10 + var5] = var4[var10 + var5] + var8 * var19[var10];
                    var10++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L4: {
          if (param0 == 14) {
            break L4;
          } else {
            field_f = null;
            break L4;
          }
        }
        return param1;
    }

    final static cd a(int param0) {
        if (!(sh.field_d != uc.field_c)) {
            throw new IllegalStateException();
        }
        if (kl.field_z == sh.field_d) {
            sh.field_d = uc.field_c;
            return ea.field_x;
        }
        if (param0 == 13) {
            return null;
        }
        cd discarded$0 = je.a(-1);
        return null;
    }

    final int b(int param0, int param1) {
        if (param1 < 17) {
            ((je) this).field_e = 12;
        }
        if (((je) this).field_a != null) {
            param0 = 6 - -(int)((long)((je) this).field_e * (long)param0 / (long)((je) this).field_d);
        }
        return param0;
    }

    final static String a(String param0, int param1, byte param2) {
        Object var4 = null;
        if (1 != param1) {
          if (2 == param1) {
            return cm.a((byte) 121, hf.field_c, new String[1]);
          } else {
            L0: {
              if (param2 == -128) {
                break L0;
              } else {
                var4 = null;
                String discarded$1 = je.a((String) null, 71, (byte) -56);
                break L0;
              }
            }
            if (3 == param1) {
              return cm.a((byte) 83, bg.field_a, new String[1]);
            } else {
              if (-5 == (param1 ^ -1)) {
                return cm.a((byte) 106, aj.field_b, new String[1]);
              } else {
                if (param1 != 5) {
                  if (param1 != 6) {
                    if (param1 != 7) {
                      if (-9 == param1) {
                        return cm.a((byte) 83, gf.field_d, new String[1]);
                      } else {
                        if (-12 != param1) {
                          if (param1 != 12) {
                            if (13 == param1) {
                              return cm.a((byte) 127, sh.field_b, new String[1]);
                            } else {
                              return null;
                            }
                          } else {
                            return cm.a((byte) 100, md.field_S, new String[1]);
                          }
                        } else {
                          return cm.a((byte) 123, em.field_b, new String[1]);
                        }
                      }
                    } else {
                      return cm.a((byte) 123, f.field_x, new String[1]);
                    }
                  } else {
                    return cm.a((byte) 121, bj.field_b, new String[1]);
                  }
                } else {
                  return cm.a((byte) 96, ln.field_b, new String[1]);
                }
              }
            }
          }
        } else {
          return cm.a((byte) 121, wk.field_g, new String[1]);
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        if (param0 != 23369) {
            field_b = null;
        }
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            return -86;
        }
        if (!(((je) this).field_a == null)) {
            param1 = (int)((long)((je) this).field_e * (long)param1 / (long)((je) this).field_d);
        }
        return param1;
    }

    je(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param1 != param0) {
          var3 = n.a(43, param0, param1);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((je) this).field_d = param0;
          ((je) this).field_e = param1;
          ((je) this).field_a = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
            } else {
              L1: {
                var5 = ((je) this).field_a[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = 3.141592653589793 * ((double)var8 - var6);
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (Math.cos(((double)var8 - var6) * 0.2243994752564138) * 0.46 + 0.54);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    static {
    }
}
