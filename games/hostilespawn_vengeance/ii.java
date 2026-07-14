/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    private boolean field_a;
    static int[] field_c;
    private boolean field_b;
    static boolean field_g;
    static Boolean field_h;
    private String field_e;
    static String[] field_f;
    static oc field_d;

    final String a(byte param0) {
        if (param0 != -34) {
            return null;
        }
        return ((ii) this).field_e;
    }

    final boolean a(int param0) {
        if (param0 != 17539) {
            field_g = true;
            return ((ii) this).field_a;
        }
        return ((ii) this).field_a;
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 >= -64) {
          field_d = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final boolean d(byte param0) {
        if (param0 > -13) {
            String discarded$0 = ((ii) this).a((byte) 47);
            return ((ii) this).field_b;
        }
        return ((ii) this).field_b;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ii) this).field_a = stackIn_3_1 != 0;
        if (param0 != 25957) {
          field_d = null;
          ((ii) this).field_b = true;
          return;
        } else {
          ((ii) this).field_b = true;
          return;
        }
    }

    final static boolean b(byte param0) {
        if (param0 == 30) {
          if (-1 != bm.field_c) {
            if (1 == bm.field_c) {
              if (-9 != rl.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (-4 != rl.field_c) {
              if (1 == bm.field_c) {
                if (-9 != rl.field_c) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          boolean discarded$7 = ii.b((byte) -32);
          if (-1 == bm.field_c) {
            if (-4 != rl.field_c) {
              if (1 == bm.field_c) {
                if (-9 != rl.field_c) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (1 == bm.field_c) {
              if (-9 != rl.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static String c(byte param0) {
        int var1 = 0;
        if (!re.field_k) {
          if (fb.field_l >= ui.field_e) {
            if (qg.field_u + ui.field_e > fb.field_l) {
              return eb.field_d;
            } else {
              var1 = -97 / ((param0 - 1) / 40);
              return null;
            }
          } else {
            var1 = -97 / ((param0 - 1) / 40);
            return null;
          }
        } else {
          var1 = -97 / ((param0 - 1) / 40);
          return null;
        }
    }

    ii(String param0) {
        ((ii) this).field_a = false;
        ((ii) this).field_b = false;
        ((ii) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_g = false;
        field_f = new String[]{"Name", "Rank", "Level", "Score"};
        field_d = new oc();
    }
}
