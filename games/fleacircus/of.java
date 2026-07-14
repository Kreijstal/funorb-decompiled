/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static int field_b;
    private int field_j;
    private int field_e;
    static long field_c;
    private tc[] field_l;
    static byte[][] field_d;
    static boolean field_i;
    static String field_g;
    static dd[] field_h;
    String field_f;
    private int field_a;
    float field_k;

    private final void a(tc param0, int param1, boolean param2) {
        float var4 = 0.0f;
        var4 = (float)param1 / 100.0f + (float)(((of) this).field_j + 1);
        if (0 != param1) {
          ((of) this).field_f = param0.field_d + " - " + param1 + "%";
          ((of) this).field_k = (float)((of) this).field_a * var4 / (float)(1 + ((of) this).field_e);
          if (!param2) {
            return;
          } else {
            boolean discarded$4 = ((of) this).c(-38);
            return;
          }
        } else {
          ((of) this).field_f = param0.field_i;
          ((of) this).field_k = (float)((of) this).field_a * var4 / (float)(1 + ((of) this).field_e);
          if (!param2) {
            return;
          } else {
            boolean discarded$5 = ((of) this).c(-38);
            return;
          }
        }
    }

    final boolean c(int param0) {
        tc var2 = null;
        int var3 = 0;
        tc var4 = null;
        var3 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          if (((of) this).field_e <= ((of) this).field_j) {
            if (param0 != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = ((of) this).field_l[((of) this).field_j];
            var2 = var4;
            if (var4.field_a.b((byte) -110)) {
              L1: {
                if (var4.field_f < 0) {
                  break L1;
                } else {
                  if (!var4.field_a.c(var4.field_f, 14969)) {
                    this.a(var2, var4.field_a.b(var4.field_f, -2), false);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_c) {
                  break L2;
                } else {
                  if (var4.field_a.a(var4.field_c, -95)) {
                    break L2;
                  } else {
                    this.a(var2, var4.field_a.a(-84, var4.field_c), false);
                    return false;
                  }
                }
              }
              L3: {
                if (0 <= var4.field_f) {
                  break L3;
                } else {
                  if (null != var4.field_c) {
                    break L3;
                  } else {
                    if (null == var4.field_d) {
                      break L3;
                    } else {
                      if (var4.field_a.a(param0 ^ -58)) {
                        break L3;
                      } else {
                        this.a(var2, var4.field_a.a((byte) -77), false);
                        return false;
                      }
                    }
                  }
                }
              }
              ((of) this).field_j = ((of) this).field_j + 1;
              continue L0;
            } else {
              this.a(var4, 0, false);
              return false;
            }
          }
        }
    }

    final static jg a(int param0) {
        try {
            Throwable var1 = null;
            jg stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            jg stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == -21814) {
                  break L0;
                } else {
                  of.b(125);
                  break L0;
                }
              }
              stackOut_2_0 = (jg) Class.forName("oi").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void b(int param0) {
        field_h = null;
        field_g = null;
        field_d = null;
        int var1 = 30 % ((param0 - -47) / 39);
    }

    final static dd[] a(String param0, String param1, rh param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param3 <= 58) {
          var6 = null;
          dd[] discarded$2 = of.a((String) null, (String) null, (rh) null, 93);
          var4 = param2.a(param1, (byte) -100);
          var5 = param2.a(param0, (byte) -15, var4);
          return oc.a(param2, var5, var4, (byte) -109);
        } else {
          var4 = param2.a(param1, (byte) -100);
          var5 = param2.a(param0, (byte) -15, var4);
          return oc.a(param2, var5, var4, (byte) -109);
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0>Teleporter:<%1> Come in pairs; teleports fleas from one to the other.";
        field_i = false;
    }
}
