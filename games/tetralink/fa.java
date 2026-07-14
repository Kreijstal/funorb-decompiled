/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static String field_a;
    private ah field_c;
    private ah field_b;
    private dj field_g;
    static int field_d;
    static boolean field_e;
    private dj field_f;

    private final wf a(int param0, int[] param1, String param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((fa) this).field_b.a(param0 + -1, param3);
        if (-1 >= (var5 ^ -1)) {
          var6 = ((fa) this).field_b.a(var5, false, param2);
          if (param0 > var6) {
            return null;
          } else {
            return this.a((byte) 118, var6, param1, var5);
          }
        } else {
          return null;
        }
    }

    final static void a(ah param0, boolean param1, ah param2, ah param3, byte param4) {
        oa.field_y = il.a("", param4 ^ 14822);
        oa.field_y.a(false, 8);
        ua.a(param0, param3, param2, -97);
        qe.a(-86);
        pi.field_a = fk.field_Q;
        ma.field_d = fk.field_Q;
        if (param4 != 91) {
            fa.b(-90);
        }
    }

    private final wf a(String param0, byte param1, String param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var5 = ((fa) this).field_c.a(-1, param2);
        if ((var5 ^ -1) <= -1) {
          var6 = ((fa) this).field_c.a(var5, false, param0);
          if ((var6 ^ -1) <= -1) {
            if (param1 <= 47) {
              var7 = null;
              fa.a((ah) null, false, (ah) null, (ah) null, (byte) 70);
              return this.a(-834608944, var6, param3, var5);
            } else {
              return this.a(-834608944, var6, param3, var5);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final wf a(String param0, String param1, byte param2) {
        if (param2 != 1) {
            return null;
        }
        return this.a(0, (int[]) null, param0, param1);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = param0 >>> -1710593375;
        var2 = var2 | var2 >>> 1673873313;
        var2 = var2 | var2 >>> 1944230722;
        var2 = var2 | var2 >>> -1954905052;
        if (param1 != -24338) {
          return 42;
        } else {
          var2 = var2 | var2 >>> -121626744;
          var2 = var2 | var2 >>> -70266032;
          return param0 & (var2 ^ -1);
        }
    }

    final static hl a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            ig discarded$0 = fa.a(-120, (byte[]) null);
            return ek.a(true);
        }
        return ek.a(true);
    }

    final static ig a(int param0, byte[] param1) {
        ig var2 = null;
        if (param1 != null) {
          if (param0 != -334) {
            return null;
          } else {
            var2 = new ig(param1, qa.field_x, i.field_t, je.field_h, sn.field_e, ti.field_c, ga.field_a);
            an.b(-81);
            return var2;
          }
        } else {
          return null;
        }
    }

    private final wf a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        wf var8 = null;
        wf var8_ref = null;
        ag var9 = null;
        ag var9_ref = null;
        if (param0 == -834608944) {
          var5 = param1 ^ (param3 >>> 638075884 | 65523 & param3 << -1436689596);
          var5 = var5 | param3 << -834608944;
          var6 = (long)var5 ^ 4294967296L;
          var8 = (wf) (Object) ((fa) this).field_f.a(var6, (byte) -43);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if ((param2[0] ^ -1) < -1) {
                L0: {
                  var9 = (ag) (Object) ((fa) this).field_g.a(var6, (byte) -43);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9_ref = ag.a(((fa) this).field_c, param3, param1);
                    if (var9_ref != null) {
                      ((fa) this).field_g.a(var6, param0 ^ 834608919, (mc) (Object) var9_ref);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.b(false);
                  ((fa) this).field_f.a(var6, -112, (mc) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (ag) (Object) ((fa) this).field_g.a(var6, (byte) -43);
                if (var9 != null) {
                  break L1;
                } else {
                  var9_ref = ag.a(((fa) this).field_c, param3, param1);
                  if (var9_ref != null) {
                    ((fa) this).field_g.a(var6, param0 ^ 834608919, (mc) (Object) var9_ref);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.b(false);
                ((fa) this).field_f.a(var6, -112, (mc) (Object) var8_ref);
                return var8_ref;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final wf a(byte param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        wf var8 = null;
        wf var8_ref = null;
        ge var9 = null;
        Object var10 = null;
        wf var11 = null;
        ge var12 = null;
        wf var13 = null;
        ge var21 = null;
        wf var22 = null;
        ge var24 = null;
        wf var25 = null;
        if (param0 > 104) {
          var5 = ((param3 & 1342181375) << -1458974908 | param3 >>> -1490240372) ^ param1;
          var5 = var5 | param3 << 957030736;
          var6 = (long)var5;
          var8 = (wf) (Object) ((fa) this).field_f.a(var6, (byte) -43);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if ((param2[0] ^ -1) < -1) {
                var24 = ge.a(((fa) this).field_b, param3, param1);
                if (var24 == null) {
                  return null;
                } else {
                  L0: {
                    var25 = var24.b();
                    var8_ref = var25;
                    ((fa) this).field_f.a(var6, -58, (mc) (Object) var8_ref);
                    if (param2 != null) {
                      param2[0] = param2[0] - var25.field_s.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var24 = ge.a(((fa) this).field_b, param3, param1);
              if (var24 == null) {
                return null;
              } else {
                L1: {
                  var25 = var24.b();
                  var8_ref = var25;
                  ((fa) this).field_f.a(var6, -58, (mc) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var25.field_s.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            }
          }
        } else {
          var10 = null;
          wf discarded$2 = ((fa) this).a(85, (String) null, (String) null);
          var5 = ((param3 & 1342181375) << -1458974908 | param3 >>> -1490240372) ^ param1;
          var5 = var5 | param3 << 957030736;
          var6 = (long)var5;
          var8 = (wf) (Object) ((fa) this).field_f.a(var6, (byte) -43);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if ((param2[0] ^ -1) < -1) {
                var21 = ge.a(((fa) this).field_b, param3, param1);
                var9 = var21;
                if (var21 == null) {
                  return null;
                } else {
                  L2: {
                    var22 = var21.b();
                    var8_ref = var22;
                    ((fa) this).field_f.a(var6, -58, (mc) (Object) var8_ref);
                    if (param2 != null) {
                      param2[0] = param2[0] - var22.field_s.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var12 = ge.a(((fa) this).field_b, param3, param1);
              var9 = var12;
              if (var12 == null) {
                return null;
              } else {
                L3: {
                  var13 = var12.b();
                  var11 = var13;
                  var8_ref = var13;
                  ((fa) this).field_f.a(var6, -58, (mc) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var13.field_s.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            }
          }
        }
    }

    final wf a(int param0, String param1, String param2) {
        Object var5 = null;
        if (param0 >= -121) {
          var5 = null;
          wf discarded$2 = ((fa) this).a(29, (String) null, (String) null);
          return this.a(param2, (byte) 56, param1, (int[]) null);
        } else {
          return this.a(param2, (byte) 56, param1, (int[]) null);
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -2) {
            field_d = -124;
        }
    }

    final wf a(byte param0, int param1, int[] param2) {
        int var4 = 0;
        if (-2 != (((fa) this).field_b.a(-1) ^ -1)) {
          var4 = -40 % ((-15 - param0) / 54);
          if ((((fa) this).field_b.b(-23126, param1) ^ -1) == -2) {
            return this.a((byte) 127, 0, param2, param1);
          } else {
            throw new RuntimeException();
          }
        } else {
          return this.a((byte) 117, param1, param2, 0);
        }
    }

    final static int a(int param0) {
        if (param0 > -6) {
            int discarded$0 = fa.a(-28);
            return id.field_x;
        }
        return id.field_x;
    }

    final wf a(int[] param0, int param1, int param2) {
        if (-2 != (((fa) this).field_c.a(-1) ^ -1)) {
          if (((fa) this).field_c.b(-23126, param1) != 1) {
            if (param2 < 3) {
              return null;
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(-834608944, 0, param0, param1);
          }
        } else {
          return this.a(-834608944, param1, param0, 0);
        }
    }

    fa(ah param0, ah param1) {
        ((fa) this).field_g = new dj(256);
        ((fa) this).field_f = new dj(256);
        ((fa) this).field_c = param1;
        ((fa) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Options";
    }
}
