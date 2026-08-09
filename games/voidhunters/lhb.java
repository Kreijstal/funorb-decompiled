/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lhb implements dja {
    static no field_a;

    final static tsa a(byte param0, ipb param1) throws ojb {
        tsa stackIn_9_0 = null;
        tsa stackIn_25_0 = null;
        tsa stackIn_31_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4 = 0;
        tsa var5 = null;
        tsa var6 = null;
        tsa var7 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = param1.a((byte) -1);
              if (param0 > 13) {
                break L1;
              } else {
                field_a = (no) null;
                break L1;
              }
            }
            L2: {
              if (dla.field_d == var5.field_e) {
                break L2;
              } else {
                if (ek.field_o == var5.field_e) {
                  break L2;
                } else {
                  if (var5.field_e == fwa.field_h) {
                    break L2;
                  } else {
                    if (io.field_p != var5.field_e) {
                      if (hpa.field_p == var5.field_e) {
                        if (param1.a(81)) {
                          throw new ojb(var5.field_g);
                        } else {
                          var6 = param1.a((byte) -67);
                          if (var6.field_e != wdb.field_vb) {
                            throw new ojb(var6.field_g);
                          } else {
                            var5.field_f = new ij();
                            L3: while (true) {
                              if (param1.a(67)) {
                                throw new ojb(var5.field_g);
                              } else {
                                if (param1.a((byte) -27).field_e == ua.field_o) {
                                  stackIn_25_0 = (tsa) (var5);
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  param1.field_a = param1.field_a - 1;
                                  var5.field_f.b(-10258, lhb.a((byte) 33, param1));
                                  if (!param1.a(35)) {
                                    var7 = param1.a((byte) -28);
                                    if (var7.field_e == ua.field_o) {
                                      stackIn_31_0 = (tsa) (var5);
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    } else {
                                      if (var7.field_e != jwa.field_l) {
                                        throw new ojb(var7.field_g);
                                      } else {
                                        continue L3;
                                      }
                                    }
                                  } else {
                                    throw new ojb(var5.field_g);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        throw new ojb(var5.field_g);
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = (tsa) (var5);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("lhb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L4;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0;
          } else {
            return stackIn_31_0;
          }
        }
    }

    final static void a(byte param0, ml param1) {
        ml var4 = null;
        ml var5 = null;
        try {
            param1.a(1, 7, new ml(35));
            int var2_int = -57 / ((param0 - 24) / 51);
            param1.a(1, 15, new ml(35));
            param1.a(1, 3, new ml(13));
            param1.a(1, 11, new ml(13));
            param1.a(1, 16, new ml(13));
            param1.a(1, 17, new ml(13));
            param1.a(1, 5, new ml(15));
            param1.a(1, 9, new ml(15));
            param1.a(1, 4, new ml(15));
            param1.a(1, 10, new ml(15));
            var4 = new ml(33);
            var4.a(1, 0, new ml(13));
            param1.a(1, 1, var4);
            var5 = new ml(33);
            var5.a(1, 2, new ml(13));
            param1.a(1, 13, var5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lhb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            this.a((byte) -4);
            return (tv[]) ((Object) new mqb[param1]);
        }
        return (tv[]) ((Object) new mqb[param1]);
    }

    public final tv a(byte param0) {
        int var2 = -113 / ((param0 - -64) / 50);
        return (tv) ((Object) new mqb());
    }

    public static void b(byte param0) {
        if (param0 > -62) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
