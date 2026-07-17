/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends wj {
    private long field_e;
    private long[] field_g;
    static int field_i;
    private int field_f;
    private long field_c;
    private int field_h;
    private long field_d;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 == 10) {
          if (param5 >= param0) {
            if (param0 - -param3 > param5) {
              if (param4 <= param1) {
                if (param6 + param4 <= param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$11 = eb.a(74, -120, 53, -42, -35, 107, -25);
          if (param5 >= param0) {
            if (param0 - -param3 > param5) {
              if (param4 <= param1) {
                if (param6 + param4 <= param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0) {
        L0: {
          ((eb) this).field_c = 0L;
          if (~((eb) this).field_d < ~((eb) this).field_e) {
            ((eb) this).field_e = ((eb) this).field_e + (((eb) this).field_d + -((eb) this).field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -19635) {
          return;
        } else {
          return;
        }
    }

    private final long d(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        var2 = System.nanoTime();
        if (param0 == -14942) {
          var4 = var2 - ((eb) this).field_c;
          ((eb) this).field_c = var2;
          if (var4 > -5000000000L) {
            if (var4 >= 5000000000L) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (((eb) this).field_h < var8) {
                  return var6 / (long)((eb) this).field_h;
                } else {
                  var6 = var6 + ((eb) this).field_g[(((eb) this).field_f + -var8 - -10) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              L1: {
                ((eb) this).field_g[((eb) this).field_f] = var4;
                if (((eb) this).field_h < 1) {
                  ((eb) this).field_h = ((eb) this).field_h + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((eb) this).field_f = (((eb) this).field_f + 1) % 10;
              var6 = 0L;
              var8 = 1;
              L2: while (true) {
                if (((eb) this).field_h < var8) {
                  return var6 / (long)((eb) this).field_h;
                } else {
                  var6 = var6 + ((eb) this).field_g[(((eb) this).field_f + -var8 - -10) % 10];
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L3: while (true) {
              if (((eb) this).field_h < var8) {
                return var6 / (long)((eb) this).field_h;
              } else {
                var6 = var6 + ((eb) this).field_g[(((eb) this).field_f + -var8 - -10) % 10];
                var8++;
                continue L3;
              }
            }
          }
        } else {
          boolean discarded$1 = eb.a(-86, 37, 79, 90, 127, -32, 104);
          var4 = var2 - ((eb) this).field_c;
          ((eb) this).field_c = var2;
          if (var4 <= -5000000000L) {
            var6 = 0L;
            var8 = 1;
            L4: while (true) {
              if (((eb) this).field_h < var8) {
                return var6 / (long)((eb) this).field_h;
              } else {
                var6 = var6 + ((eb) this).field_g[(((eb) this).field_f + -var8 - -10) % 10];
                var8++;
                continue L4;
              }
            }
          } else {
            L5: {
              if (var4 < 5000000000L) {
                L6: {
                  ((eb) this).field_g[((eb) this).field_f] = var4;
                  if (((eb) this).field_h < 1) {
                    ((eb) this).field_h = ((eb) this).field_h + 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((eb) this).field_f = (((eb) this).field_f + 1) % 10;
                break L5;
              } else {
                break L5;
              }
            }
            var6 = 0L;
            var8 = 1;
            L7: while (true) {
              if (((eb) this).field_h < var8) {
                return var6 / (long)((eb) this).field_h;
              } else {
                var6 = var6 + ((eb) this).field_g[(((eb) this).field_f + -var8 - -10) % 10];
                var8++;
                continue L7;
              }
            }
          }
        }
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        if (param0 > 103) {
          if (((eb) this).field_d <= ((eb) this).field_e) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((eb) this).field_d = ((eb) this).field_d + param1;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (((eb) this).field_e > ((eb) this).field_d) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (~((eb) this).field_e < ~((eb) this).field_d) {
                ((eb) this).field_d = ((eb) this).field_e;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((eb) this).field_c = ((eb) this).field_c + (-((eb) this).field_e + ((eb) this).field_d);
            ((eb) this).field_e = ((eb) this).field_e + (-((eb) this).field_e + ((eb) this).field_d);
            ((eb) this).field_d = ((eb) this).field_d + param1;
            return 1;
          }
        } else {
          ((eb) this).field_h = 85;
          if (((eb) this).field_d <= ((eb) this).field_e) {
            var4 = 0;
            L2: while (true) {
              L3: {
                ((eb) this).field_d = ((eb) this).field_d + param1;
                var4++;
                if (var4 >= 10) {
                  break L3;
                } else {
                  if (((eb) this).field_e > ((eb) this).field_d) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (~((eb) this).field_e >= ~((eb) this).field_d) {
                return var4;
              } else {
                ((eb) this).field_d = ((eb) this).field_e;
                return var4;
              }
            }
          } else {
            ((eb) this).field_c = ((eb) this).field_c + (-((eb) this).field_e + ((eb) this).field_d);
            ((eb) this).field_e = ((eb) this).field_e + (-((eb) this).field_e + ((eb) this).field_d);
            ((eb) this).field_d = ((eb) this).field_d + param1;
            return 1;
          }
        }
    }

    final long a(int param0) {
        if (param0 != -27042) {
            ((eb) this).b(120);
            ((eb) this).field_e = ((eb) this).field_e + this.d(-14942);
            if (!(~((eb) this).field_e <= ~((eb) this).field_d)) {
                return (((eb) this).field_d - ((eb) this).field_e) / 1000000L;
            }
            return 0L;
        }
        ((eb) this).field_e = ((eb) this).field_e + this.d(-14942);
        if (!(~((eb) this).field_e <= ~((eb) this).field_d)) {
            return (((eb) this).field_d - ((eb) this).field_e) / 1000000L;
        }
        return 0L;
    }

    eb() {
        ((eb) this).field_f = 0;
        ((eb) this).field_c = 0L;
        ((eb) this).field_e = 0L;
        ((eb) this).field_h = 1;
        ((eb) this).field_g = new long[10];
        ((eb) this).field_d = 0L;
        ((eb) this).field_e = System.nanoTime();
        ((eb) this).field_d = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 64;
    }
}
