/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    private int field_d;
    int field_b;
    private static String[] field_a;
    private String field_c;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -30600) {
          in.a(118, false);
          if ((wla.field_ub ^ -1) >= -1) {
            if (vpa.a(9)) {
              L0: {
                var2 = 0;
                if (wba.field_o != null) {
                  break L0;
                } else {
                  if (!foa.field_b) {
                    break L0;
                  } else {
                    qna.a(1, param1, var2);
                    return;
                  }
                }
              }
              return;
            } else {
              L1: {
                var2 = 1;
                if (wba.field_o != null) {
                  break L1;
                } else {
                  if (!foa.field_b) {
                    break L1;
                  } else {
                    qna.a(1, param1, var2);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (wba.field_o == null) {
              dq.field_f = r.a(480, 0, param0 ^ -15579, dsa.field_c, 640, 0);
              if (dq.field_f == null) {
                L2: {
                  var2 = 3;
                  if (wba.field_o != null) {
                    break L2;
                  } else {
                    if (!foa.field_b) {
                      break L2;
                    } else {
                      qna.a(1, param1, var2);
                      return;
                    }
                  }
                }
                return;
              } else {
                fpa.a((java.awt.Canvas) (Object) dq.field_f, (byte) 75);
                var2 = 2;
                if (wba.field_o == null) {
                  if (foa.field_b) {
                    qna.a(1, param1, var2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              dq.field_f = wba.field_o.b(27013);
              uu.b(param0 ^ -18237, 2);
              if (dq.field_f == null) {
                var2 = 3;
                if (wba.field_o == null) {
                  if (!foa.field_b) {
                    return;
                  } else {
                    qna.a(1, param1, var2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                fpa.a((java.awt.Canvas) (Object) dq.field_f, (byte) 75);
                var2 = 2;
                if (wba.field_o == null) {
                  if (foa.field_b) {
                    qna.a(1, param1, var2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if ((wla.field_ub ^ -1) >= -1) {
            if (vpa.a(9)) {
              var2 = 0;
              if (wba.field_o == null) {
                if (foa.field_b) {
                  qna.a(1, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 1;
              if (wba.field_o == null) {
                if (foa.field_b) {
                  qna.a(1, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (wba.field_o == null) {
              dq.field_f = r.a(480, 0, param0 ^ -15579, dsa.field_c, 640, 0);
              if (dq.field_f != null) {
                L3: {
                  fpa.a((java.awt.Canvas) (Object) dq.field_f, (byte) 75);
                  var2 = 2;
                  if (wba.field_o != null) {
                    break L3;
                  } else {
                    if (!foa.field_b) {
                      break L3;
                    } else {
                      qna.a(1, param1, var2);
                      break L3;
                    }
                  }
                }
                return;
              } else {
                L4: {
                  var2 = 3;
                  if (wba.field_o != null) {
                    break L4;
                  } else {
                    if (!foa.field_b) {
                      break L4;
                    } else {
                      qna.a(1, param1, var2);
                      break L4;
                    }
                  }
                }
                return;
              }
            } else {
              dq.field_f = wba.field_o.b(27013);
              uu.b(param0 ^ -18237, 2);
              if (dq.field_f == null) {
                var2 = 3;
                if (wba.field_o == null) {
                  if (!foa.field_b) {
                    return;
                  } else {
                    qna.a(1, param1, var2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                fpa.a((java.awt.Canvas) (Object) dq.field_f, (byte) 75);
                var2 = 2;
                if (wba.field_o == null) {
                  if (!foa.field_b) {
                    return;
                  } else {
                    qna.a(1, param1, var2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            in.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 480) {
            return false;
        }
        return qi.a(30054, param0, qt.class);
    }

    final char b(int param0) {
        if (param0 != 21098) {
          String discarded$2 = ((in) this).toString();
          ((in) this).field_b = ((in) this).field_b + 1;
          return ((in) this).field_c.charAt(((in) this).field_b);
        } else {
          ((in) this).field_b = ((in) this).field_b + 1;
          return ((in) this).field_c.charAt(((in) this).field_b);
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            boolean discarded$12 = in.a(126, -107, (byte) 95);
            if (((in) this).field_d > ((in) this).field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((in) this).field_d > ((in) this).field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final String toString() {
        return ((in) this).field_c.substring(0, ((in) this).field_b) + "|" + ((in) this).field_c.substring(((in) this).field_b);
    }

    final static boolean a(int param0, int param1, byte param2) {
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param2 <= -5) {
          L0: {
            stackOut_11_0 = aca.a(param0, 32768, param1);
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if ((param0 & 2048) == 0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          if (stackIn_14_0 | stackIn_14_1 == 0) {
            if (vua.e(param0, param1, 13650)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_15_0 = 1;
            stackIn_17_0 = stackOut_15_0;
            return stackIn_17_0 != 0;
          }
        } else {
          L1: {
            field_a = null;
            stackOut_1_0 = aca.a(param0, 32768, param1);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if ((param0 & 2048) == 0) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          if (stackIn_4_0 | stackIn_4_1 != 0) {
            return true;
          } else {
            L2: {
              if (!vua.e(param0, param1, 13650)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            return stackIn_8_0 != 0;
          }
        }
    }

    in(String param0) {
        ((in) this).field_b = 0;
        ((in) this).field_c = param0;
        ((in) this).field_d = ((in) this).field_c.length();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[2];
        field_a[0] = "Brick";
        field_a[1] = "Sand";
    }
}
