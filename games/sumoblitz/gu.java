/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends ka {
    private lm field_g;
    private int field_e;
    static String field_h;
    static int field_d;
    private int field_c;
    static int field_j;
    private lr field_i;
    private lr field_k;
    private lr field_f;
    private lr field_l;

    final void b(byte param0) {
        int var2 = 0;
        L0: {
          if (null != ((gu) this).field_i) {
            ((gu) this).field_i.b(16711680);
            break L0;
          } else {
            break L0;
          }
        }
        if (((gu) this).field_k == null) {
          if (((gu) this).field_l == null) {
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f == null) {
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            }
          } else {
            ((gu) this).field_l.b(16711680);
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f == null) {
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((gu) this).field_k.b(16711680);
          if (((gu) this).field_l != null) {
            ((gu) this).field_l.b(16711680);
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f != null) {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              if (((gu) this).field_g == null) {
                return;
              } else {
                ((gu) this).field_g.a(-1);
                return;
              }
            }
          } else {
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f == null) {
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g == null) {
                return;
              } else {
                ((gu) this).field_g.a(-1);
                return;
              }
            }
          }
        }
    }

    gu(aw param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((gu) this).field_c = param2;
                ((gu) this).field_e = param1;
                if (param3) {
                  break L2;
                } else {
                  if (!jf.a(((gu) this).field_e, (byte) -97, ((gu) this).field_c)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((gu) this).field_i = new lr(te.a(false, ((gu) this).field_e, ((gu) this).field_c));
              break L1;
            }
            L3: {
              L4: {
                if (param3) {
                  break L4;
                } else {
                  if (!sg.a(((gu) this).field_c, ((gu) this).field_e, 37)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((gu) this).field_k = new lr(om.a(((gu) this).field_c, ((gu) this).field_e, (byte) -50));
              break L3;
            }
            L5: {
              L6: {
                if (param3) {
                  break L6;
                } else {
                  if (!oj.a(((gu) this).field_e, 13836, ((gu) this).field_c)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ((gu) this).field_l = new lr(se.a(31, ((gu) this).field_e, ((gu) this).field_c));
              break L5;
            }
            L7: {
              L8: {
                if (param3) {
                  break L8;
                } else {
                  if (!bj.a(((gu) this).field_e, (byte) -113, ((gu) this).field_c)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              ((gu) this).field_f = new lr(mo.a(((gu) this).field_c, ((gu) this).field_e, 30643));
              break L7;
            }
            L9: {
              if (param3) {
                break L9;
              } else {
                if (tf.a(((gu) this).field_c, -2626, ((gu) this).field_e)) {
                  break L9;
                } else {
                  return;
                }
              }
            }
            ((gu) this).field_g = new lm(qq.b(((gu) this).field_e, ((gu) this).field_c, -126));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("gu.<init>(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L10;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L10;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Music: ";
    }
}
