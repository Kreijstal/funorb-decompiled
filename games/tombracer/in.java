/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    private int field_d;
    int field_b;
    private static String[] field_a;
    private String field_c;

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
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
                fpa.a(dq.field_f, (byte) 75);
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
                fpa.a(dq.field_f, (byte) 75);
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
                  fpa.a(dq.field_f, (byte) 75);
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
                fpa.a(dq.field_f, (byte) 75);
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
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 480) {
              stackIn_4_0 = qi.a(30054, param0, qt.class);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("in.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final char b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != 21098) {
          this.toString();
          fieldTemp$2 = this.field_b;
          this.field_b = this.field_b + 1;
          return this.field_c.charAt(fieldTemp$2);
        } else {
          fieldTemp$3 = this.field_b;
          this.field_b = this.field_b + 1;
          return this.field_c.charAt(fieldTemp$3);
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 0) {
          L0: {
            in.a(126, -107, (byte) 95);
            if (this.field_d > this.field_b) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_d > this.field_b) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final String toString() {
        return this.field_c.substring(0, this.field_b) + "|" + this.field_c.substring(this.field_b);
    }

    final static boolean a(int param0, int param1, byte param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        if (param2 <= -5) {
          L0: {
            stackIn_13_0 = aca.a(param0, 32768, param1);

            if ((param0 & 2048) == 0) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = 0;
              break L0;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = 1;
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
            stackIn_17_0 = 1;
            return stackIn_17_0 != 0;
          }
        } else {
          L1: {
            field_a = (String[]) null;
            stackIn_3_0 = aca.a(param0, 32768, param1);

            if ((param0 & 2048) == 0) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          if (stackIn_4_0 | stackIn_4_1 != 0) {
            return true;
          } else {
            L2: {
              if (!vua.e(param0, param1, 13650)) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            return stackIn_8_0 != 0;
          }
        }
    }

    in(String param0) {
        this.field_b = 0;
        try {
            this.field_c = param0;
            this.field_d = this.field_c.length();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[2];
        field_a[0] = "Brick";
        field_a[1] = "Sand";
    }
}
