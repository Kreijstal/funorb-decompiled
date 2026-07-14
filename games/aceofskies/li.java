/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class li implements sp {
    private long field_a;
    static String field_b;

    public final String a(boolean param0) {
        String var3 = null;
        if (param0) {
          if (!((li) this).a(26921)) {
            if (kh.a(-104) < ((li) this).field_a + 350L) {
              return null;
            } else {
              return ((li) this).b(8192);
            }
          } else {
            return null;
          }
        } else {
          var3 = (String) null;
          li.a(-62, -108, (String) null);
          if (!((li) this).a(26921)) {
            if (kh.a(-104) < ((li) this).field_a + 350L) {
              return null;
            } else {
              return ((li) this).b(8192);
            }
          } else {
            return null;
          }
        }
    }

    abstract pt c(int param0);

    public final void a(byte param0) {
        if (param0 <= 62) {
            String discarded$0 = ((li) this).b(-122);
            ((li) this).field_a = kh.a(-74);
            return;
        }
        ((li) this).field_a = kh.a(-74);
    }

    abstract String b(int param0);

    public final pt b(boolean param0) {
        if (!(!((li) this).a(26921))) {
            return vb.field_o;
        }
        if (!param0) {
            ((li) this).a((byte) 120);
            if (!((kh.a(-113) ^ -1L) <= (((li) this).field_a - -350L ^ -1L))) {
                return jc.field_Pc;
            }
            return ((li) this).c(0);
        }
        if (!((kh.a(-113) ^ -1L) <= (((li) this).field_a - -350L ^ -1L))) {
            return jc.field_Pc;
        }
        return ((li) this).c(0);
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -90) {
            String var2 = (String) null;
            li.a(0, -79, (String) null);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = 101 % ((65 - param0) / 43);
        nm.field_a = false;
        ss.field_t = false;
        if (ml.field_m != null) {
          if (ml.field_m.field_z) {
            L0: {
              if ((param1 ^ -1) == -9) {
                L1: {
                  if (nf.field_a) {
                    param2 = jr.field_p;
                    break L1;
                  } else {
                    param2 = id.field_e;
                    break L1;
                  }
                }
                param1 = 2;
                vr.field_b.a(se.field_a, 122);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              var4 = 1;
              if (10 == param1) {
                bt.a(10);
                var4 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var4 == 0) {
                break L3;
              } else {
                L4: {
                  if (nm.field_a) {
                    param2 = sn.a(bc.field_v, 107, new String[1]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!ae.field_f) {
                    break L5;
                  } else {
                    param2 = sl.field_n;
                    break L5;
                  }
                }
                ml.field_m.a((byte) -117, param1, param2);
                break L3;
              }
            }
            if (256 != param1) {
              if (10 != param1) {
                if (nf.field_a) {
                  return;
                } else {
                  vr.field_b.h(310);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "to return to the normal view.";
    }
}
