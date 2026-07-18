/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends ck {
    boolean field_q;
    static boolean field_v;
    static ul field_w;
    boolean field_p;
    int field_A;
    static int field_o;
    int field_x;
    int field_s;
    int field_B;
    int field_u;
    int field_y;
    int field_r;
    boolean field_z;
    static int field_t;

    public static void a() {
        field_w = null;
    }

    final static u a(int param0, byte[] param1) {
        u var2 = null;
        RuntimeException var2_ref = null;
        u stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        u stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new u(param1, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
              int discarded$2 = 9324;
              uh.a();
              stackOut_3_0 = (u) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("je.B(").append(96).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    je(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          ((je) this).field_x = param2;
          ((je) this).field_s = param0;
          ((je) this).field_q = false;
          ((je) this).field_A = param1;
          ((je) this).field_p = false;
          var4 = 50;
          ((je) this).field_z = false;
          if (((je) this).field_s != 6) {
            break L0;
          } else {
            var4 = 5;
            break L0;
          }
        }
        L1: {
          if (((je) this).field_s != 5) {
            break L1;
          } else {
            ((je) this).field_z = true;
            var4 = 125;
            break L1;
          }
        }
        L2: {
          if (((je) this).field_s != 12) {
            break L2;
          } else {
            ((je) this).field_z = false;
            var4 = 5;
            break L2;
          }
        }
        L3: {
          if (((je) this).field_s != 3) {
            break L3;
          } else {
            ((je) this).field_z = true;
            var4 = 100;
            break L3;
          }
        }
        if (0 == ((je) this).field_s) {
          L4: {
            var4 = 10;
            if (((je) this).field_A != 0) {
              break L4;
            } else {
              var4 = 25;
              break L4;
            }
          }
          L5: {
            if (1 != ((je) this).field_A) {
              break L5;
            } else {
              var4 = 20;
              break L5;
            }
          }
          L6: {
            if (((je) this).field_A != 2) {
              break L6;
            } else {
              var4 = 35;
              break L6;
            }
          }
          L7: {
            if (3 != ((je) this).field_A) {
              break L7;
            } else {
              var4 = 50;
              break L7;
            }
          }
          L8: {
            if (6 != ((je) this).field_A) {
              break L8;
            } else {
              var4 = 40;
              ((je) this).field_z = true;
              break L8;
            }
          }
          L9: {
            if (((je) this).field_A != 7) {
              break L9;
            } else {
              var4 = 50;
              ((je) this).field_z = true;
              break L9;
            }
          }
          L10: {
            if (8 != ((je) this).field_A) {
              break L10;
            } else {
              var4 = 100;
              ((je) this).field_z = true;
              break L10;
            }
          }
          L11: {
            if (((je) this).field_A != 9) {
              break L11;
            } else {
              var4 = 30;
              ((je) this).field_z = true;
              break L11;
            }
          }
          L12: {
            if (((je) this).field_A != 10) {
              break L12;
            } else {
              var4 = 20;
              ((je) this).field_z = true;
              break L12;
            }
          }
          L13: {
            if (((je) this).field_A != 4) {
              break L13;
            } else {
              var4 = 75;
              break L13;
            }
          }
          if (5 == ((je) this).field_A) {
            var4 = 75;
            if (((je) this).field_s == 7) {
              ((je) this).field_z = true;
              var4 = 25;
              if (3 == ((je) this).field_A) {
                L14: {
                  var4 = 100;
                  if (((je) this).field_s != 8) {
                    break L14;
                  } else {
                    var4 = 25;
                    ((je) this).field_z = true;
                    break L14;
                  }
                }
                L15: {
                  if (((je) this).field_s != 9) {
                    break L15;
                  } else {
                    ((je) this).field_z = true;
                    var4 = 25;
                    break L15;
                  }
                }
                L16: {
                  if (11 != ((je) this).field_s) {
                    break L16;
                  } else {
                    var4 = 25;
                    ((je) this).field_z = false;
                    break L16;
                  }
                }
                L17: {
                  if (((je) this).field_s != 10) {
                    break L17;
                  } else {
                    var4 = 1;
                    break L17;
                  }
                }
                ((je) this).field_r = var4 + ((je) this).field_x;
                return;
              } else {
                L18: {
                  if (((je) this).field_s != 8) {
                    break L18;
                  } else {
                    var4 = 25;
                    ((je) this).field_z = true;
                    break L18;
                  }
                }
                L19: {
                  if (((je) this).field_s != 9) {
                    break L19;
                  } else {
                    ((je) this).field_z = true;
                    var4 = 25;
                    break L19;
                  }
                }
                L20: {
                  if (11 != ((je) this).field_s) {
                    break L20;
                  } else {
                    var4 = 25;
                    ((je) this).field_z = false;
                    break L20;
                  }
                }
                L21: {
                  if (((je) this).field_s != 10) {
                    break L21;
                  } else {
                    var4 = 1;
                    break L21;
                  }
                }
                ((je) this).field_r = var4 + ((je) this).field_x;
                return;
              }
            } else {
              L22: {
                if (((je) this).field_s != 8) {
                  break L22;
                } else {
                  var4 = 25;
                  ((je) this).field_z = true;
                  break L22;
                }
              }
              L23: {
                if (((je) this).field_s != 9) {
                  break L23;
                } else {
                  ((je) this).field_z = true;
                  var4 = 25;
                  break L23;
                }
              }
              L24: {
                if (11 != ((je) this).field_s) {
                  break L24;
                } else {
                  var4 = 25;
                  ((je) this).field_z = false;
                  break L24;
                }
              }
              L25: {
                if (((je) this).field_s != 10) {
                  break L25;
                } else {
                  var4 = 1;
                  break L25;
                }
              }
              ((je) this).field_r = var4 + ((je) this).field_x;
              return;
            }
          } else {
            L26: {
              if (((je) this).field_s != 7) {
                break L26;
              } else {
                ((je) this).field_z = true;
                var4 = 25;
                if (3 != ((je) this).field_A) {
                  break L26;
                } else {
                  var4 = 100;
                  break L26;
                }
              }
            }
            L27: {
              if (((je) this).field_s != 8) {
                break L27;
              } else {
                var4 = 25;
                ((je) this).field_z = true;
                break L27;
              }
            }
            L28: {
              if (((je) this).field_s != 9) {
                break L28;
              } else {
                ((je) this).field_z = true;
                var4 = 25;
                break L28;
              }
            }
            L29: {
              if (11 != ((je) this).field_s) {
                break L29;
              } else {
                var4 = 25;
                ((je) this).field_z = false;
                break L29;
              }
            }
            L30: {
              if (((je) this).field_s != 10) {
                break L30;
              } else {
                var4 = 1;
                break L30;
              }
            }
            ((je) this).field_r = var4 + ((je) this).field_x;
            return;
          }
        } else {
          L31: {
            if (((je) this).field_s != 7) {
              break L31;
            } else {
              ((je) this).field_z = true;
              var4 = 25;
              if (3 != ((je) this).field_A) {
                break L31;
              } else {
                var4 = 100;
                break L31;
              }
            }
          }
          L32: {
            if (((je) this).field_s != 8) {
              break L32;
            } else {
              var4 = 25;
              ((je) this).field_z = true;
              break L32;
            }
          }
          L33: {
            if (((je) this).field_s != 9) {
              break L33;
            } else {
              ((je) this).field_z = true;
              var4 = 25;
              break L33;
            }
          }
          L34: {
            if (11 != ((je) this).field_s) {
              break L34;
            } else {
              var4 = 25;
              ((je) this).field_z = false;
              break L34;
            }
          }
          L35: {
            if (((je) this).field_s != 10) {
              break L35;
            } else {
              var4 = 1;
              break L35;
            }
          }
          ((je) this).field_r = var4 + ((je) this).field_x;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = false;
        field_o = 0;
        field_w = new ul();
    }
}
