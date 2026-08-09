/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_f;
    static String field_b;
    static km field_e;
    static il field_a;
    static wl field_c;
    static String field_d;

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -10 / ((param0 - -24) / 60);
            stackIn_1_0 = h.a(-4623, false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("ee.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0) {
        if (kf.field_e != 0 + -of.field_a) {
          if (-of.field_a + 250 != kf.field_e) {
            kf.field_e = kf.field_e + 1;
            if (!param0) {
              field_a = (il) null;
              return;
            } else {
              return;
            }
          } else {
            kf.field_e = kf.field_e + 1;
            if (!param0) {
              field_a = (il) null;
              return;
            } else {
              return;
            }
          }
        } else {
          kf.field_e = kf.field_e + 1;
          if (!param0) {
            field_a = (il) null;
            return;
          } else {
            return;
          }
        }
    }

    final static void b(boolean param0) {
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        if (!an.field_b) {
          if (wl.field_e != null) {
            if (!wl.field_e.field_l) {
              if (param0) {
                L0: {
                  field_c = (wl) null;
                  if (!an.field_b) {
                    break L0;
                  } else {
                    L1: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_58_0 = 0;
                        break L1;
                      } else {
                        stackIn_58_0 = 1;
                        break L1;
                      }
                    }
                    b.field_Db = stackIn_58_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L0;
                  }
                }
                return;
              } else {
                L2: {
                  if (!an.field_b) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_52_0 = 0;
                        break L3;
                      } else {
                        stackIn_52_0 = 1;
                        break L3;
                      }
                    }
                    b.field_Db = stackIn_52_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L2;
                  }
                }
                return;
              }
            } else {
              rn.field_c = rn.field_c | wl.field_e.field_g;
              an.field_b = true;
              wl.field_e = null;
              if (param0) {
                L4: {
                  field_c = (wl) null;
                  if (!an.field_b) {
                    break L4;
                  } else {
                    L5: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_44_0 = 0;
                        break L5;
                      } else {
                        stackIn_44_0 = 1;
                        break L5;
                      }
                    }
                    b.field_Db = stackIn_44_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  if (!an.field_b) {
                    break L6;
                  } else {
                    L7: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_38_0 = 0;
                        break L7;
                      } else {
                        stackIn_38_0 = 1;
                        break L7;
                      }
                    }
                    b.field_Db = stackIn_38_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L6;
                  }
                }
                return;
              }
            }
          } else {
            wl.field_e = m.a((byte) 106, 4);
            if (wl.field_e.field_l) {
              rn.field_c = rn.field_c | wl.field_e.field_g;
              an.field_b = true;
              wl.field_e = null;
              if (!param0) {
                L8: {
                  if (!an.field_b) {
                    break L8;
                  } else {
                    L9: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_29_0 = 0;
                        break L9;
                      } else {
                        stackIn_29_0 = 1;
                        break L9;
                      }
                    }
                    b.field_Db = stackIn_29_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L8;
                  }
                }
                return;
              } else {
                L10: {
                  field_c = (wl) null;
                  if (!an.field_b) {
                    break L10;
                  } else {
                    L11: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_23_0 = 0;
                        break L11;
                      } else {
                        stackIn_23_0 = 1;
                        break L11;
                      }
                    }
                    b.field_Db = stackIn_23_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L10;
                  }
                }
                return;
              }
            } else {
              if (param0) {
                L12: {
                  field_c = (wl) null;
                  if (!an.field_b) {
                    break L12;
                  } else {
                    L13: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_15_0 = 0;
                        break L13;
                      } else {
                        stackIn_15_0 = 1;
                        break L13;
                      }
                    }
                    b.field_Db = stackIn_15_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L12;
                  }
                }
                return;
              } else {
                L14: {
                  if (!an.field_b) {
                    break L14;
                  } else {
                    L15: {
                      if (-1 != (1 & rn.field_c ^ -1)) {
                        stackIn_9_0 = 0;
                        break L15;
                      } else {
                        stackIn_9_0 = 1;
                        break L15;
                      }
                    }
                    b.field_Db = stackIn_9_0 != 0;
                    ge.b(18887);
                    wn.a((byte) 96);
                    break L14;
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (param0 < 15) {
            return;
        }
        fi.field_t.b(new jl(), (byte) -53);
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 <= 53) {
            return;
        }
        field_e = null;
    }

    static {
        field_f = "<%0> cannot move";
        field_b = "These are your pieces<br>Click to select one";
        field_d = "Loading sound effects";
        field_c = new wl();
    }
}
