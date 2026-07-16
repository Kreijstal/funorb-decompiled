/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends di {
    private lb field_o;
    static k field_n;
    static boolean[] field_m;

    final ud a(int param0, String param1) {
        eh var3 = null;
        Object var4 = null;
        ud stackIn_5_0 = null;
        ud stackIn_9_0 = null;
        ud stackIn_18_0 = null;
        ud stackIn_22_0 = null;
        ud stackIn_28_0 = null;
        ud stackIn_32_0 = null;
        ud stackOut_31_0 = null;
        ud stackOut_30_0 = null;
        ud stackOut_27_0 = null;
        ud stackOut_26_0 = null;
        ud stackOut_21_0 = null;
        ud stackOut_20_0 = null;
        ud stackOut_17_0 = null;
        ud stackOut_16_0 = null;
        ud stackOut_8_0 = null;
        ud stackOut_7_0 = null;
        ud stackOut_4_0 = null;
        ud stackOut_3_0 = null;
        if (((ni) this).field_o instanceof wk) {
          var3 = ((wk) (Object) ((ni) this).field_o).a((byte) -109);
          if (var3 == null) {
            if (param0 >= -106) {
              L0: {
                var4 = null;
                ud discarded$3 = ((ni) this).a(124, (String) null);
                if (!param1.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                  stackOut_31_0 = ef.field_b;
                  stackIn_32_0 = stackOut_31_0;
                  break L0;
                } else {
                  stackOut_30_0 = TrackController.field_G;
                  stackIn_32_0 = stackOut_30_0;
                  break L0;
                }
              }
              return stackIn_32_0;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                  stackOut_27_0 = ef.field_b;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = TrackController.field_G;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            if (var3.a((byte) -120) == TrackController.field_G) {
              if (param0 < -106) {
                L2: {
                  if (!param1.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                    stackOut_21_0 = ef.field_b;
                    stackIn_22_0 = stackOut_21_0;
                    break L2;
                  } else {
                    stackOut_20_0 = TrackController.field_G;
                    stackIn_22_0 = stackOut_20_0;
                    break L2;
                  }
                }
                return stackIn_22_0;
              } else {
                L3: {
                  var4 = null;
                  ud discarded$4 = ((ni) this).a(124, (String) null);
                  if (!param1.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                    stackOut_17_0 = ef.field_b;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = TrackController.field_G;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                return stackIn_18_0;
              }
            } else {
              return ef.field_b;
            }
          }
        } else {
          if (param0 < -106) {
            L4: {
              if (!param1.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                stackOut_8_0 = ef.field_b;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = TrackController.field_G;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              var4 = null;
              ud discarded$5 = ((ni) this).a(124, (String) null);
              if (!param1.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                stackOut_4_0 = ef.field_b;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = TrackController.field_G;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String a(String param0, int param1) {
        eh var3 = null;
        if (((ni) this).field_o instanceof wk) {
          var3 = ((wk) (Object) ((ni) this).field_o).a((byte) -100);
          if (var3 != null) {
            if (var3.a((byte) 107) == TrackController.field_G) {
              if (param0.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                return var3.c(15914);
              } else {
                return rb.field_c;
              }
            } else {
              return var3.c(15914);
            }
          } else {
            if (param1 != 426) {
              ((ni) this).field_o = null;
              if (param0.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                return null;
              } else {
                return rb.field_c;
              }
            } else {
              if (param0.equals((Object) (Object) ((ni) this).field_o.field_s)) {
                return null;
              } else {
                return rb.field_c;
              }
            }
          }
        } else {
          if (param1 != 426) {
            ((ni) this).field_o = null;
            if (param0.equals((Object) (Object) ((ni) this).field_o.field_s)) {
              return null;
            } else {
              return rb.field_c;
            }
          } else {
            if (param0.equals((Object) (Object) ((ni) this).field_o.field_s)) {
              return null;
            } else {
              return rb.field_c;
            }
          }
        }
    }

    ni(lb param0, lb param1) {
        super(param0);
        ((ni) this).field_o = param1;
    }

    public static void g(int param0) {
        field_m = null;
        if (param0 != 112) {
            field_m = null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 <= -115) {
                    break L1;
                  } else {
                    field_m = null;
                    break L1;
                  }
                }
                Object discarded$1 = sj.a(gd.b((byte) 77), new Object[1], 7648, "resizing");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new boolean[112];
    }
}
