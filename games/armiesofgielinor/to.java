/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends mn {
    private ik field_v;
    private int field_w;

    final static short[] a(short[] param0, int param1, bv param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = param2.g(45, param1);
        if (var4 != 0) {
          if (param3 == 10064) {
            if (param0 == null) {
              param0 = new short[var4];
              var5 = param2.g(123, 4);
              var6 = (short)param2.g(param3 + -10172, 16);
              if (0 < var5) {
                var7 = 0;
                L0: while (true) {
                  if (var4 > var7) {
                    param0[var7] = (short)(param2.g(63, var5) + var6);
                    var7++;
                    continue L0;
                  } else {
                    return param0;
                  }
                }
              } else {
                var7 = 0;
                L1: while (true) {
                  if (var4 > var7) {
                    param0[var7] = (short)var6;
                    var7++;
                    continue L1;
                  } else {
                    return param0;
                  }
                }
              }
            } else {
              if (var4 == param0.length) {
                var5 = param2.g(123, 4);
                var6 = (short)param2.g(param3 + -10172, 16);
                if (0 < var5) {
                  var7 = 0;
                  L2: while (true) {
                    if (var4 > var7) {
                      param0[var7] = (short)(param2.g(63, var5) + var6);
                      var7++;
                      continue L2;
                    } else {
                      return param0;
                    }
                  }
                } else {
                  var7 = 0;
                  L3: while (true) {
                    if (var4 > var7) {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L3;
                    } else {
                      return param0;
                    }
                  }
                }
              } else {
                param0 = new short[var4];
                var5 = param2.g(123, 4);
                var6 = (short)param2.g(param3 + -10172, 16);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4 > var7) {
                      param0[var7] = (short)(param2.g(63, var5) + var6);
                      var7++;
                      continue L4;
                    } else {
                      return param0;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4 > var7) {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L5;
                    } else {
                      return param0;
                    }
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        if (vi.field_a != null) {
          if (0 != vi.field_a.length) {
            if ((param0 ^ -1) <= -1) {
              if (param0 >= vi.field_a.length) {
                return;
              } else {
                te discarded$2 = we.a(100, param2, vi.field_a[param0]);
                var3 = -110 / ((-58 - param1) / 63);
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

    final static void a(boolean param0, float param1, String param2, int param3) {
        if (pq.field_a != null) {
          pq.field_a.a(param1, 30, param0, param2);
          qn.b();
          nw.b((byte) 92, true);
          if (param3 != -1) {
            to.a(-96, (byte) 21, 26);
            return;
          } else {
            return;
          }
        } else {
          pq.field_a = new cr(rl.field_C, aw.field_h);
          rl.field_C.a((kb) (Object) pq.field_a, param3 + 1);
          pq.field_a.a(param1, 30, param0, param2);
          qn.b();
          nw.b((byte) 92, true);
          if (param3 == -1) {
            return;
          } else {
            to.a(-96, (byte) 21, 26);
            return;
          }
        }
    }

    final bd a(int param0, ha param1) {
        Object var4 = null;
        ((to) this).d(-104);
        if (param0 <= 31) {
          var4 = null;
          to.a(true, -1.1208561658859253f, (String) null, -70);
          ((to) this).field_v.a((byte) -37, param1);
          return (bd) (Object) new ua(((to) this).field_v, ((to) this).field_w, ((to) this).field_p);
        } else {
          ((to) this).field_v.a((byte) -37, param1);
          return (bd) (Object) new ua(((to) this).field_v, ((to) this).field_w, ((to) this).field_p);
        }
    }

    to(ik param0, int param1, int param2) {
        ((to) this).field_w = param1;
        ((to) this).field_p = param2;
        ((to) this).field_v = param0;
    }

    static {
    }
}
