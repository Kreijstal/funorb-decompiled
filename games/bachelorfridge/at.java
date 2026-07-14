/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class at extends bw {
    static String field_i;
    static String[] field_g;
    boolean field_f;
    eaa field_h;

    final void a(int param0, at param1) {
        if (((at) this).field_h != null) {
          if (param0 != 27799) {
            field_g = null;
            ((at) this).field_h.a((bw) (Object) param1, true);
            return;
          } else {
            ((at) this).field_h.a((bw) (Object) param1, true);
            return;
          }
        } else {
          ((at) this).field_h = new eaa();
          if (param0 == 27799) {
            ((at) this).field_h.a((bw) (Object) param1, true);
            return;
          } else {
            field_g = null;
            ((at) this).field_h.a((bw) (Object) param1, true);
            return;
          }
        }
    }

    abstract boolean c(byte param0);

    boolean b(int param0) {
        Object var2 = null;
        at var2_ref = null;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        var2 = null;
        var3 = BachelorFridge.field_y;
        if (!((at) this).field_f) {
          if (!((at) this).c((byte) -14)) {
            if (param0 == 21807) {
              if (var2_ref.field_h == null) {
                return var2_ref.field_f;
              } else {
                var2_ref = (at) (Object) var2_ref.field_h.b((byte) 90);
                L0: while (true) {
                  if (var2_ref == null) {
                    L1: {
                      L2: {
                        if (!var2_ref.field_f) {
                          break L2;
                        } else {
                          if (!var2_ref.field_h.e(param0 + -8890)) {
                            break L2;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_60_0 = 0;
                      stackIn_61_0 = stackOut_60_0;
                      break L1;
                    }
                    return stackIn_61_0 != 0;
                  } else {
                    if (var2_ref.b(21807)) {
                      var2_ref.a(false);
                      var2_ref = (at) (Object) var2_ref.field_h.c(0);
                      continue L0;
                    } else {
                      L3: {
                        L4: {
                          if (!var2_ref.field_f) {
                            break L4;
                          } else {
                            if (!var2_ref.field_h.e(param0 + -8890)) {
                              break L4;
                            } else {
                              stackOut_53_0 = 1;
                              stackIn_55_0 = stackOut_53_0;
                              break L3;
                            }
                          }
                        }
                        stackOut_54_0 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        break L3;
                      }
                      return stackIn_55_0 != 0;
                    }
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            ((at) this).field_f = true;
            if (param0 == 21807) {
              if (var2_ref.field_h == null) {
                return var2_ref.field_f;
              } else {
                var2_ref = (at) (Object) var2_ref.field_h.b((byte) 90);
                L5: while (true) {
                  if (var2_ref != null) {
                    if (var2_ref.b(21807)) {
                      var2_ref.a(false);
                      var2_ref = (at) (Object) var2_ref.field_h.c(0);
                      continue L5;
                    } else {
                      L6: {
                        L7: {
                          if (!var2_ref.field_f) {
                            break L7;
                          } else {
                            if (!var2_ref.field_h.e(param0 + -8890)) {
                              break L7;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L6;
                            }
                          }
                        }
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L6;
                      }
                      return stackIn_43_0 != 0;
                    }
                  } else {
                    L8: {
                      L9: {
                        if (!var2_ref.field_f) {
                          break L9;
                        } else {
                          if (!var2_ref.field_h.e(param0 + -8890)) {
                            break L9;
                          } else {
                            stackOut_32_0 = 1;
                            stackIn_34_0 = stackOut_32_0;
                            break L8;
                          }
                        }
                      }
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L8;
                    }
                    return stackIn_34_0 != 0;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          if (param0 == 21807) {
            if (((at) this).field_h != null) {
              var2_ref = (at) (Object) ((at) this).field_h.b((byte) 90);
              L10: while (true) {
                if (var2_ref != null) {
                  if (var2_ref.b(21807)) {
                    var2_ref.a(false);
                    var2_ref = (at) (Object) var2_ref.field_h.c(0);
                    continue L10;
                  } else {
                    if (var2_ref.field_f) {
                      if (var2_ref.field_h.e(param0 + -8890)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  L11: {
                    L12: {
                      if (!var2_ref.field_f) {
                        break L12;
                      } else {
                        if (!var2_ref.field_h.e(param0 + -8890)) {
                          break L12;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          break L11;
                        }
                      }
                    }
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L11;
                  }
                  return stackIn_11_0 != 0;
                }
              }
            } else {
              return ((at) var2).field_f;
            }
          } else {
            return false;
          }
        }
    }

    protected at() {
    }

    void c(int param0) {
        if (param0 >= -10) {
            boolean discarded$0 = ((at) this).c((byte) 120);
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 5849) {
            return;
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = null;
        field_g = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
