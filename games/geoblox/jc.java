/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static dm field_a;
    static String field_c;
    static String field_b;

    final static void a(int param0, boolean param1) {
        int var3;
        var3 = Geoblox.field_C;
        if (7 == param0) {
          if (ka.field_h != 36) {
            ka.field_h = 36;
            pa.field_g = 110;
            nd.field_a = 6;
            td.a(-348, fl.field_c[23]);
          }
        }
        if (pa.field_g > 0) {
          if (param0 == 3) {
            wa.field_a = 50;
            td.a(-348, fl.field_c[27]);
          }
        } else {
          if (!param1) {
            if (param0 != 0) {
              if (1 == param0) {
                nd.field_a = 1;
                ka.field_h = 6;
              } else {
                if (param0 != 2) {
                  if (3 == param0) {
                    ka.field_h = 18;
                    wa.field_a = 50;
                    pa.field_g = 110;
                    nd.field_a = 3;
                    td.a(-348, fl.field_c[27]);
                  } else {
                    if (param0 == 4) {
                      pa.field_g = 110;
                      ka.field_h = 24;
                      nd.field_a = 4;
                    } else {
                      if (param0 == 5) {
                        pa.field_g = 110;
                        nd.field_a = 5;
                        ka.field_h = 30;
                        td.a(-348, fl.field_c[24]);
                      }
                    }
                  }
                } else {
                  if (12 != ka.field_h) {
                    if (ka.field_h != 24) {
                      if (30 != ka.field_h) {
                        if (36 != ka.field_h) {
                          td.a(-348, fl.field_c[26]);
                        }
                      }
                    }
                  }
                  nd.field_a = 2;
                  ka.field_h = 12;
                }
              }
            } else {
              if (ka.field_h != 0) {
                if (24 != ka.field_h) {
                  if (ka.field_h != 30) {
                    if (ka.field_h != 36) {
                      td.a(-348, fl.field_c[25]);
                    }
                  }
                }
              }
              ka.field_h = 0;
              nd.field_a = 0;
            }
          } else {
            field_a = (dm) null;
            if (param0 == 0) {
              if (ka.field_h != 0) {
                if (24 != ka.field_h) {
                  if (ka.field_h != 30) {
                    if (ka.field_h != 36) {
                      td.a(-348, fl.field_c[25]);
                    }
                  }
                }
              }
              ka.field_h = 0;
              nd.field_a = 0;
            } else {
              if (1 == param0) {
                nd.field_a = 1;
                ka.field_h = 6;
              } else {
                if (param0 != 2) {
                  if (3 == param0) {
                    ka.field_h = 18;
                    wa.field_a = 50;
                    pa.field_g = 110;
                    nd.field_a = 3;
                    td.a(-348, fl.field_c[27]);
                  } else {
                    if (param0 == 4) {
                      pa.field_g = 110;
                      ka.field_h = 24;
                      nd.field_a = 4;
                    } else {
                      if (param0 == 5) {
                        pa.field_g = 110;
                        nd.field_a = 5;
                        ka.field_h = 30;
                        td.a(-348, fl.field_c[24]);
                      }
                    }
                  }
                } else {
                  if (12 != ka.field_h) {
                    if (ka.field_h != 24) {
                      if (30 != ka.field_h) {
                        if (36 != ka.field_h) {
                          td.a(-348, fl.field_c[26]);
                        }
                      }
                    }
                  }
                  nd.field_a = 2;
                  ka.field_h = 12;
                }
              }
            }
          }
          uf.field_b = uf.field_b % 6 + ka.field_h;
        }
    }

    final static fd[] a(pk param0, boolean param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fd[] var4 = null;
        fd var6_ref_fd = null;
        int var6 = 0;
        int var7 = 0;
        fd[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        fd[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          var2_int = param0.e((byte) -17, 8);
          if (!param1) {
            stackIn_3_0 = (fd[]) null;
            return stackIn_3_0;
          }
          if (0 < var2_int) {
            stackIn_6_0 = null;
            return (fd[]) ((Object) stackIn_6_0);
          }
          var3 = param0.e((byte) -17, 12);
          var4 = new fd[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!ac.a((byte) 71, param0)) {
              var6 = param0.e((byte) -17, td.a(var5 - 1, (byte) 66));
              var4[var5] = var4[var6];
            } else {
              var6_ref_fd = new fd();
              param0.e((byte) -17, 24);
              param0.e((byte) -17, 24);
              var6_ref_fd.field_a = param0.e((byte) -17, 24);
              param0.e((byte) -17, 9);
              param0.e((byte) -17, 12);
              param0.e((byte) -17, 12);
              param0.e((byte) -17, 12);
              var4[var5] = var6_ref_fd;
            }
          }
          stackIn_14_0 = (fd[]) (var4);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var2);
          stackIn_17_1 = new StringBuilder().append("jc.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -13) {
            field_a = (dm) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 <= -33) {
            var3 = param0 >> 31 & param1 - 1;
            return var3 + ((param0 >>> 31) + param0) % param1;
        }
        return 80;
    }

    static {
        field_c = "To Customer Support";
    }
}
