/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static int field_b;
    static String field_a;
    static String field_c;
    static int field_e;
    static int field_d;

    final static void a(int param0, kl param1, kl param2, kl param3, boolean param4) {
        try {
            we.field_c = ql.a("", false);
            we.field_c.a(false, 104);
            eg.a(param3, param0 + -2109, param1, param2);
            bd.a(-126);
            fi.field_y = ej.field_b;
            if (param0 != 2202) {
                field_a = null;
            }
            wc.field_j = ej.field_b;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "dj.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    abstract void a(byte[] param0, int param1);

    public static void b(int param0) {
        field_a = null;
        field_c = null;
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        if (!param0) {
          L0: {
            var2 = 0;
            if (param1 < 0) {
              var2 += 16;
              param1 = param1 >>> 16;
              break L0;
            } else {
              if (param1 < 65536) {
                break L0;
              } else {
                L1: {
                  var2 += 16;
                  param1 = param1 >>> 16;
                  if (param1 >= 256) {
                    var2 += 8;
                    param1 = param1 >>> 8;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (16 <= param1) {
                    param1 = param1 >>> 4;
                    var2 += 4;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1 < 4) {
                    break L3;
                  } else {
                    param1 = param1 >>> 2;
                    var2 += 2;
                    break L3;
                  }
                }
                L4: {
                  if (param1 < 1) {
                    break L4;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L4;
                  }
                }
                return param1 + var2;
              }
            }
          }
          L5: {
            if (param1 >= 256) {
              var2 += 8;
              param1 = param1 >>> 8;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (16 <= param1) {
              param1 = param1 >>> 4;
              var2 += 4;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (param1 < 4) {
              break L7;
            } else {
              param1 = param1 >>> 2;
              var2 += 2;
              break L7;
            }
          }
          L8: {
            if (param1 < 1) {
              break L8;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L8;
            }
          }
          return param1 + var2;
        } else {
          var3 = null;
          dj.a(-74, (kl) null, (kl) null, (kl) null, true);
          var2 = 0;
          if (param1 >= 0) {
            L9: {
              if (param1 < 65536) {
                break L9;
              } else {
                var2 += 16;
                param1 = param1 >>> 16;
                break L9;
              }
            }
            L10: {
              if (param1 >= 256) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (16 <= param1) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1 < 4) {
                break L12;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L12;
              }
            }
            L13: {
              if (param1 < 1) {
                break L13;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L13;
              }
            }
            return param1 + var2;
          } else {
            L14: {
              var2 += 16;
              param1 = param1 >>> 16;
              if (param1 >= 256) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (16 <= param1) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1 < 4) {
                break L16;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L16;
              }
            }
            L17: {
              if (param1 < 1) {
                break L17;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L17;
              }
            }
            return param1 + var2;
          }
        }
    }

    abstract byte[] a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please log in to access this feature";
        field_a = "Log in";
        field_d = 0;
    }
}
