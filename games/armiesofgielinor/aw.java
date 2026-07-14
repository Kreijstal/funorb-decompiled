/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends sm {
    static wk field_m;
    static String field_k;
    static boolean field_l;
    static int[][][] field_j;
    static String field_h;
    static wr field_i;

    final static boolean a(boolean param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
          var1 = vi.b(-45);
          var3 = var1 + -dp.field_Lb;
          if (-30001L > (var3 ^ -1L)) {
            dp.field_Lb = var1;
            mu.field_d = 0;
            return true;
          } else {
            L0: {
              var5 = 3000;
              if (7 <= mu.field_d) {
                var5 = 12000;
                break L0;
              } else {
                if (mu.field_d < 5) {
                  if (3 > mu.field_d) {
                    break L0;
                  } else {
                    var5 = 6000;
                    if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
                      dp.field_Lb = var1;
                      mu.field_d = mu.field_d + 1;
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  var5 = 9000;
                  if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
                    dp.field_Lb = var1;
                    mu.field_d = mu.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
            if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
              dp.field_Lb = var1;
              mu.field_d = mu.field_d + 1;
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0, jb param1) {
        jb var3 = null;
        jb var3_ref = null;
        Object var4 = null;
        var3 = (jb) (Object) ((aw) this).field_a.a(0);
        if (param0 == 16777062) {
          if (var3_ref != null) {
            if (param1.field_t > var3_ref.field_t) {
              var3_ref = param1;
              ((aw) this).field_a.a(750, (tc) (Object) var3_ref);
              return;
            } else {
              ((aw) this).field_a.a(750, (tc) (Object) var3_ref);
              return;
            }
          } else {
            var3_ref = param1;
            ((aw) this).field_a.a(750, (tc) (Object) var3_ref);
            return;
          }
        } else {
          var4 = null;
          ((aw) this).a(64, (jb) null);
          if (var3 != null) {
            if (param1.field_t > var3_ref.field_t) {
              var3_ref = param1;
              ((aw) this).field_a.a(750, (tc) (Object) var3_ref);
              return;
            } else {
              ((aw) this).field_a.a(750, (tc) (Object) var3_ref);
              return;
            }
          } else {
            var3_ref = param1;
            ((aw) this).field_a.a(750, (tc) (Object) var3_ref);
            return;
          }
        }
    }

    final jb a(byte param0) {
        jb var2 = null;
        if (param0 > -28) {
          jb discarded$2 = ((aw) this).a((byte) -5);
          var2 = (jb) (Object) ((aw) this).field_a.a(0);
          return var2;
        } else {
          var2 = (jb) (Object) ((aw) this).field_a.a(0);
          return var2;
        }
    }

    final static og a(byte param0, mt param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1.field_c = param1.field_c - 1;
        var2 = param1.field_c - 1;
        var3 = new StringBuilder();
        var4 = param1.b(-1);
        if (param0 > 95) {
          StringBuilder discarded$6 = var3.append(var4);
          var5 = 0;
          L0: while (true) {
            if (!param1.a((byte) 16)) {
              var6 = param1.b(-1);
              if (var5 != 0) {
                var5 = 0;
                StringBuilder discarded$7 = var3.append(var6);
                continue L0;
              } else {
                L1: {
                  if (var6 != 92) {
                    StringBuilder discarded$8 = var3.append(var6);
                    break L1;
                  } else {
                    var5 = 1;
                    break L1;
                  }
                }
                if (var4 != var6) {
                  continue L0;
                } else {
                  L2: {
                    if (var4 != 34) {
                      stackOut_32_0 = hf.field_h;
                      stackIn_33_0 = stackOut_32_0;
                      break L2;
                    } else {
                      stackOut_31_0 = iu.field_x;
                      stackIn_33_0 = stackOut_31_0;
                      break L2;
                    }
                  }
                  var6 = stackIn_33_0;
                  return new og(var6, var2, var3.toString());
                }
              }
            } else {
              L3: {
                if (var4 != 34) {
                  stackOut_23_0 = hf.field_h;
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                } else {
                  stackOut_22_0 = iu.field_x;
                  stackIn_24_0 = stackOut_22_0;
                  break L3;
                }
              }
              var6 = stackIn_24_0;
              return new og(var6, var2, var3.toString());
            }
          }
        } else {
          field_h = null;
          StringBuilder discarded$9 = var3.append(var4);
          var5 = 0;
          L4: while (true) {
            if (!param1.a((byte) 16)) {
              var6 = param1.b(-1);
              if (var5 != 0) {
                var5 = 0;
                StringBuilder discarded$10 = var3.append(var6);
                continue L4;
              } else {
                L5: {
                  if (var6 != 92) {
                    StringBuilder discarded$11 = var3.append(var6);
                    break L5;
                  } else {
                    var5 = 1;
                    break L5;
                  }
                }
                if (var4 != var6) {
                  continue L4;
                } else {
                  L6: {
                    if (var4 != 34) {
                      stackOut_17_0 = hf.field_h;
                      stackIn_18_0 = stackOut_17_0;
                      break L6;
                    } else {
                      stackOut_16_0 = iu.field_x;
                      stackIn_18_0 = stackOut_16_0;
                      break L6;
                    }
                  }
                  var6 = stackIn_18_0;
                  return new og(var6, var2, var3.toString());
                }
              }
            } else {
              L7: {
                if (var4 != 34) {
                  stackOut_5_0 = hf.field_h;
                  stackIn_6_0 = stackOut_5_0;
                  break L7;
                } else {
                  stackOut_4_0 = iu.field_x;
                  stackIn_6_0 = stackOut_4_0;
                  break L7;
                }
              }
              var6 = stackIn_6_0;
              return new og(var6, var2, var3.toString());
            }
          }
        }
    }

    final static void a(co param0, co[] param1, int param2) {
        if (param2 != -5841) {
          field_h = null;
          param1[param0.field_d] = (co) (Object) param1;
          return;
        } else {
          param1[param0.field_d] = (co) (Object) param1;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        nt var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = (nt) (Object) s.field_a.e((byte) 104);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 1742) {
              boolean discarded$2 = aw.a(true);
              return;
            } else {
              return;
            }
          } else {
            tf.a(param0, var4, (byte) -64);
            var4 = (nt) (Object) s.field_a.a((byte) 123);
            continue L0;
          }
        }
    }

    public static void c(byte param0) {
        int var1 = 13 % ((-54 - param0) / 57);
        field_h = null;
        field_k = null;
        field_m = null;
        field_j = null;
        field_i = null;
    }

    aw(ej param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
    }
}
