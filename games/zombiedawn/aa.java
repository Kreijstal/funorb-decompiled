/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static String field_g;
    private boolean field_h;
    int[] field_e;
    private int field_l;
    static dj field_f;
    int field_i;
    int field_b;
    int field_j;
    String field_k;
    private String field_c;
    static int[] field_a;
    private long field_d;

    final int a(byte param0) {
        if (param0 <= -64) {
          if (!((aa) this).field_h) {
            L0: {
              if ((((aa) this).field_j ^ -1) != -3) {
                break L0;
              } else {
                if ((((aa) this).field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (((aa) this).field_d != oc.field_b) {
              if ((w.field_b ^ -1) == -3) {
                if (mc.a(((aa) this).field_c, true)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          ((aa) this).field_e = null;
          if (!((aa) this).field_h) {
            if ((((aa) this).field_j ^ -1) == -3) {
              if ((((aa) this).field_l ^ -1) >= -1) {
                if (((aa) this).field_d != oc.field_b) {
                  if ((w.field_b ^ -1) == -3) {
                    if (mc.a(((aa) this).field_c, true)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 2;
              }
            } else {
              if (((aa) this).field_d != oc.field_b) {
                if ((w.field_b ^ -1) == -3) {
                  if (mc.a(((aa) this).field_c, true)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          } else {
            return 2;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 != -2008296413) {
            Object var2 = null;
            aa.a((de) null, -30);
        }
    }

    final static void a(de param0, int param1) {
        int var2 = 0;
        sn.field_e = param0.f(2) << 1563063301;
        var2 = param0.d((byte) -119);
        rj.field_E = (7 & var2) << -703928878;
        sn.field_e = sn.field_e + (var2 >> -2008296413);
        if (param1 > -93) {
          field_g = null;
          rj.field_E = rj.field_E + (param0.f(2) << -7891006);
          var2 = param0.d((byte) -117);
          ii.field_d = (var2 & 63) << 436222447;
          rj.field_E = rj.field_E + (var2 >> 410594342);
          ii.field_d = ii.field_d + (param0.d((byte) -127) << 245029319);
          var2 = param0.d((byte) -120);
          e.field_H = (1 & var2) << -116975600;
          ii.field_d = ii.field_d + (var2 >> -1617515455);
          e.field_H = e.field_H + param0.f(2);
          return;
        } else {
          rj.field_E = rj.field_E + (param0.f(2) << -7891006);
          var2 = param0.d((byte) -117);
          ii.field_d = (var2 & 63) << 436222447;
          rj.field_E = rj.field_E + (var2 >> 410594342);
          ii.field_d = ii.field_d + (param0.d((byte) -127) << 245029319);
          var2 = param0.d((byte) -120);
          e.field_H = (1 & var2) << -116975600;
          ii.field_d = ii.field_d + (var2 >> -1617515455);
          e.field_H = e.field_H + param0.f(2);
          return;
        }
    }

    final static hn a(int param0, fn param1) {
        hn var2 = null;
        if (param0 <= 4) {
          aa.a(31);
          var2 = new hn(param1, (le) (Object) param1);
          fj.field_i.a(0, (le) (Object) var2);
          t.field_i.b((sp) (Object) param1);
          return var2;
        } else {
          var2 = new hn(param1, (le) (Object) param1);
          fj.field_i.a(0, (le) (Object) var2);
          t.field_i.b((sp) (Object) param1);
          return var2;
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = ZombieDawn.field_J;
        if (-1L > (param0 ^ -1L)) {
          if ((param0 ^ -1L) > -6582952005840035282L) {
            if (-1L != (param0 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param0;
              if (param1 == -27513) {
                L0: while (true) {
                  if (0L == var4) {
                    var12 = new StringBuilder(var3);
                    L1: while (true) {
                      if (0L == param0) {
                        StringBuilder discarded$5 = var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = jo.field_Nb[(int)(-(param0 * 37L) + var7)];
                          if (var9 != 95) {
                            break L2;
                          } else {
                            var10 = var12.length() + -1;
                            var9 = 160;
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            break L2;
                          }
                        }
                        StringBuilder discarded$6 = var12.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L0;
                  }
                }
              } else {
                String discarded$7 = aa.a(59L, 23);
                L3: while (true) {
                  if (0L == var4) {
                    var13 = new StringBuilder(var3);
                    L4: while (true) {
                      if (0L == param0) {
                        StringBuilder discarded$8 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L5: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = jo.field_Nb[(int)(-(param0 * 37L) + var7)];
                          if (var9 != 95) {
                            break L5;
                          } else {
                            var10 = var13.length() + -1;
                            var9 = 160;
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            break L5;
                          }
                        }
                        StringBuilder discarded$9 = var13.append(var9);
                        continue L4;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    aa(boolean param0) {
        ((aa) this).field_k = ge.field_a;
        ((aa) this).field_d = ce.field_s;
        ((aa) this).field_b = td.field_a;
        ((aa) this).field_l = ei.field_J;
        ((aa) this).field_h = vi.field_d;
        if (param0) {
            ((aa) this).field_e = vk.field_d;
        } else {
            ((aa) this).field_e = null;
        }
        ((aa) this).field_c = af.field_a;
        ((aa) this).field_j = cg.field_e;
        ((aa) this).field_i = ep.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{128, 128, 128, 128};
        field_g = "Confirm Email:";
    }
}
