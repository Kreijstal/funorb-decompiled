/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tc extends lu {
    private String field_e;
    private long field_g;
    static af field_d;
    static String field_f;

    final static ka[] a(oc[] param0, int param1, ha param2) {
        ka[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ka[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != null) {
          var6 = new ka[param0.length];
          var3 = var6;
          if (param1 != -8829) {
            field_f = null;
            var4 = 0;
            L0: while (true) {
              if (var6.length <= var4) {
                return var3;
              } else {
                var6[var4] = gb.a(param0[var4], param1 + 8957, param2);
                var4++;
                continue L0;
              }
            }
          } else {
            var4 = 0;
            L1: while (true) {
              if (var6.length <= var4) {
                return var3;
              } else {
                var6[var4] = gb.a(param0[var4], param1 + 8957, param2);
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 != 17129) {
            tc.a(false, 119);
            field_d = null;
            field_f = null;
            return;
        }
        field_d = null;
        field_f = null;
    }

    final void a(uia param0, boolean param1) {
        if (param1) {
            return;
        }
        param0.a(1736565456, ((tc) this).field_g);
        param0.a(((tc) this).field_e, -124);
    }

    final static void a(boolean param0, int param1) {
        if (null == qda.field_b) {
          if (hka.field_b == null) {
            if (param1 != 0) {
              L0: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L1: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          } else {
            hka.field_b.a(true, param0);
            if (param1 != 0) {
              L2: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L3: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          }
        } else {
          hia.a(-107, qda.field_b);
          if (hka.field_b != null) {
            hka.field_b.a(true, param0);
            if (param1 == 0) {
              L4: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L5: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L5;
                } else {
                  break L5;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          } else {
            if (param1 != 0) {
              L6: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L6;
                } else {
                  break L6;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L7: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L7;
                } else {
                  break L7;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -2886) {
            return;
        }
        int discarded$0 = rl.r(-93);
    }

    tc(long param0, String param1) {
        ((tc) this).field_e = param1;
        ((tc) this).field_g = param0;
    }

    pl a(byte param0) {
        if (param0 != 113) {
            return null;
        }
        return vm.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create a free account to store achievements, submit your best times and play online against friends! Without signing in, no progress will be saved!";
    }
}
