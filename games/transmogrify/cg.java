/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends me {
    static int field_l;
    private rg field_j;
    static volatile int field_k;

    final static boolean g(int param0) {
        ba var1 = null;
        int var2 = 0;
        int var3 = 0;
        ba var4 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        var4 = (ba) (Object) wg.field_f.a((byte) -95);
        var1 = var4;
        if (var1 != null) {
          if (param0 == -5591) {
            var2 = 0;
            L0: while (true) {
              if (var1.field_p > var2) {
                L1: {
                  if (var4.field_m[var2] == null) {
                    break L1;
                  } else {
                    if (var4.field_m[var2].field_c == 0) {
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                if (null != var4.field_o[var2]) {
                  if (-1 == (var4.field_o[var2].field_c ^ -1)) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            field_k = -92;
            var2 = 0;
            L2: while (true) {
              if (var1.field_p > var2) {
                L3: {
                  if (var4.field_m[var2] == null) {
                    break L3;
                  } else {
                    if (var4.field_m[var2].field_c == 0) {
                      return false;
                    } else {
                      break L3;
                    }
                  }
                }
                if (null != var4.field_o[var2]) {
                  if (-1 == (var4.field_o[var2].field_c ^ -1)) {
                    return false;
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L2;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    cg(rg param0, rg param1) {
        super(param0);
        ((cg) this).field_j = param1;
    }

    final static void b(byte param0) {
        int var1 = 118 / ((68 - param0) / 37);
        pg.a(0);
    }

    final rc a(int param0, String param1) {
        Object var4 = null;
        wa var5 = null;
        wa var6 = null;
        rc stackIn_7_0 = null;
        rc stackIn_13_0 = null;
        rc stackIn_18_0 = null;
        rc stackIn_23_0 = null;
        rc stackIn_28_0 = null;
        rc stackIn_34_0 = null;
        rc stackOut_33_0 = null;
        rc stackOut_32_0 = null;
        rc stackOut_27_0 = null;
        rc stackOut_26_0 = null;
        rc stackOut_22_0 = null;
        rc stackOut_21_0 = null;
        rc stackOut_12_0 = null;
        rc stackOut_11_0 = null;
        rc stackOut_6_0 = null;
        rc stackOut_5_0 = null;
        rc stackOut_17_0 = null;
        rc stackOut_16_0 = null;
        if (param0 == 95) {
          if (((cg) this).field_j instanceof ie) {
            var6 = ((ie) (Object) ((cg) this).field_j).a((byte) 113);
            if (var6 != null) {
              if (var6.a(27835) == hi.field_b) {
                L0: {
                  if (!param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                    stackOut_33_0 = ec.field_d;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    stackOut_32_0 = hi.field_b;
                    stackIn_34_0 = stackOut_32_0;
                    break L0;
                  }
                }
                return stackIn_34_0;
              } else {
                return ec.field_d;
              }
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                  stackOut_27_0 = ec.field_d;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = hi.field_b;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            L2: {
              if (!param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                stackOut_22_0 = ec.field_d;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              } else {
                stackOut_21_0 = hi.field_b;
                stackIn_23_0 = stackOut_21_0;
                break L2;
              }
            }
            return stackIn_23_0;
          }
        } else {
          var4 = null;
          rc discarded$1 = ((cg) this).a(41, (String) null);
          if (((cg) this).field_j instanceof ie) {
            var5 = ((ie) (Object) ((cg) this).field_j).a((byte) 113);
            if (var5 != null) {
              if (var5.a(27835) == hi.field_b) {
                L3: {
                  if (!param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                    stackOut_12_0 = ec.field_d;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    stackOut_11_0 = hi.field_b;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                return stackIn_13_0;
              } else {
                return ec.field_d;
              }
            } else {
              L4: {
                if (!param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                  stackOut_6_0 = ec.field_d;
                  stackIn_7_0 = stackOut_6_0;
                  break L4;
                } else {
                  stackOut_5_0 = hi.field_b;
                  stackIn_7_0 = stackOut_5_0;
                  break L4;
                }
              }
              return stackIn_7_0;
            }
          } else {
            L5: {
              if (!param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                stackOut_17_0 = ec.field_d;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = hi.field_b;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            return stackIn_18_0;
          }
        }
    }

    final static ci a(byte param0, int param1) {
        if (param0 != -82) {
          field_k = 79;
          return mh.a(-26159, false, true, false, 1, param1);
        } else {
          return mh.a(-26159, false, true, false, 1, param1);
        }
    }

    final String b(int param0, String param1) {
        wa var3 = null;
        if (((cg) this).field_j instanceof ie) {
          var3 = ((ie) (Object) ((cg) this).field_j).a((byte) 94);
          if (var3 == null) {
            if (param0 == -1) {
              if (param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                return null;
              } else {
                return gl.field_C;
              }
            } else {
              return null;
            }
          } else {
            if (var3.a(param0 ^ -27836) == hi.field_b) {
              if (param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
                return var3.c(param0 + 30524);
              } else {
                return gl.field_C;
              }
            } else {
              return var3.c(param0 + 30524);
            }
          }
        } else {
          if (param0 == -1) {
            if (param1.equals((Object) (Object) ((cg) this).field_j.field_k)) {
              return null;
            } else {
              return gl.field_C;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
    }
}
