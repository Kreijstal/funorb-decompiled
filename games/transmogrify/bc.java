/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static rc field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        int var1 = -65 % ((85 - param0) / 33);
    }

    final static void a(long param0, int param1) {
        try {
            boolean discarded$1 = false;
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Thread.sleep(param0);
                if (param1 == -23850) {
                  break L0;
                } else {
                  discarded$1 = bc.a('X', 6);
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(char param0, int param1) {
        if (!Character.isISOControl(param0)) {
          if (param1 == -161) {
            if (qk.a(param0, (byte) -110)) {
              return true;
            } else {
              if (45 != param0) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static ti[] a(byte param0) {
        ti[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        boolean stackIn_4_0 = false;
        int stackIn_23_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_22_0 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        var1 = new ti[ih.field_b];
        if (param0 <= 34) {
          return (ti[]) null;
        } else {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (ih.field_b <= var2) {
                  break L2;
                } else {
                  var3 = ql.field_b[var2] * wk.field_b[var2];
                  var17 = re.field_K[var2];
                  stackOut_3_0 = cc.field_e[var2];
                  stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (!stackIn_4_0) {
                            break L5;
                          } else {
                            var18 = ld.field_e[var2];
                            var14 = new int[var3];
                            var12 = var14;
                            var6_ref_int__ = var12;
                            var7 = 0;
                            L6: while (true) {
                              L7: {
                                if (var7 >= var3) {
                                  var1[var2] = (ti) ((Object) new jf(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var14));
                                  break L7;
                                } else {
                                  var6_ref_int__[var7] = cl.b(rg.field_D[vg.c((int) var17[var7], 255)], vg.c(var18[var7] << 1283255416, -16777216));
                                  var7++;
                                  if (var8 != 0) {
                                    break L7;
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var10 = new int[var3];
                        var6 = 0;
                        L8: while (true) {
                          if (var6 >= var3) {
                            var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var10);
                            break L4;
                          } else {
                            var10[var6] = rg.field_D[vg.c(255, (int) var17[var6])];
                            var6++;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              continue L8;
                            }
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_22_0 = 127;
              stackIn_23_0 = stackOut_22_0;
              break L1;
            }
            wd.d(stackIn_23_0);
            return var1;
          }
        }
    }

    static {
        field_a = new rc();
        field_b = 897634304;
    }
}
