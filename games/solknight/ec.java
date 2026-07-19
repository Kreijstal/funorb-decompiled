/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ec extends gg {
    static String field_j;
    long field_l;
    static int field_h;
    ec field_k;
    ec field_i;

    final static aj b(boolean param0) {
        if (!param0) {
          if (null == ji.field_b) {
            ji.field_b = new aj();
            ji.field_b.a(87, ua.field_G);
            ji.field_b.field_n = 2763306;
            ji.field_b.field_f = 14;
            ji.field_b.field_b = 7697781;
            ji.field_b.field_d = 5;
            ji.field_b.field_e = 0;
            ji.field_b.field_j = 6;
            ji.field_b.field_q = 4;
            ji.field_b.field_k = jh.field_g;
            return ji.field_b;
          } else {
            return ji.field_b;
          }
        } else {
          field_j = (String) null;
          if (null != ji.field_b) {
            return ji.field_b;
          } else {
            ji.field_b = new aj();
            ji.field_b.a(87, ua.field_G);
            ji.field_b.field_n = 2763306;
            ji.field_b.field_f = 14;
            ji.field_b.field_b = 7697781;
            ji.field_b.field_d = 5;
            ji.field_b.field_e = 0;
            ji.field_b.field_j = 6;
            ji.field_b.field_q = 4;
            ji.field_b.field_k = jh.field_g;
            return ji.field_b;
          }
        }
    }

    final void a(int param0) {
        if (param0 != 97) {
            this.field_l = 11L;
            if (!(null != this.field_k)) {
                return;
            }
            this.field_k.field_i = this.field_i;
            this.field_i.field_k = this.field_k;
            this.field_i = null;
            this.field_k = null;
            return;
        }
        if (!(null != this.field_k)) {
            return;
        }
        this.field_k.field_i = this.field_i;
        this.field_i.field_k = this.field_k;
        this.field_i = null;
        this.field_k = null;
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          if (param0 < 65) {
            if (97 <= param0) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (97 <= param0) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_h = 22;
          if (param0 >= 65) {
            if (param0 > 90) {
              if (97 <= param0) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (97 <= param0) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_31_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        if (param2) {
          if (qg.field_c[param0] < qg.field_c[param3]) {
            return true;
          } else {
            if (qg.field_c[param3] >= qg.field_c[param0]) {
              if (l.field_a[param0] < l.field_a[param3]) {
                return true;
              } else {
                if (l.field_a[param3] >= l.field_a[param0]) {
                  var4 = eh.field_a[param0] - -ld.field_M[param0] + ma.field_n[param0];
                  var5 = eh.field_a[param3] - -ld.field_M[param3] - -ma.field_n[param3];
                  if (var4 >= var5) {
                    if (param1 != -66) {
                      field_j = (String) null;
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param0 >= param3) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param0 >= param3) {
                            stackOut_30_0 = 0;
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            stackOut_29_0 = 1;
                            stackIn_31_0 = stackOut_29_0;
                            break L0;
                          }
                        }
                        return stackIn_31_0 != 0;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          if (l.field_a[param0] < l.field_a[param3]) {
            return true;
          } else {
            if (l.field_a[param0] > l.field_a[param3]) {
              return false;
            } else {
              if (qg.field_c[param0] < qg.field_c[param3]) {
                return true;
              } else {
                if (qg.field_c[param3] >= qg.field_c[param0]) {
                  var4 = eh.field_a[param0] - -ld.field_M[param0] + ma.field_n[param0];
                  var5 = eh.field_a[param3] - -ld.field_M[param3] - -ma.field_n[param3];
                  if (var4 >= var5) {
                    if (param1 == -66) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param0 >= param3) {
                            stackOut_54_0 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            break L1;
                          } else {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            break L1;
                          }
                        }
                        return stackIn_55_0 != 0;
                      }
                    } else {
                      field_j = (String) null;
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param0 >= param3) {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            break L2;
                          } else {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            break L2;
                          }
                        }
                        return stackIn_48_0 != 0;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    final static boolean e(int param0) {
        di var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        di var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (di) ((Object) ga.field_E.a((byte) 51));
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              if (param0 == 7697781) {
                L1: while (true) {
                  L2: {
                    if (var2 >= var1.field_h) {
                      break L2;
                    } else {
                      L3: {
                        if (null != var4.field_k[var2]) {
                          if (var4.field_k[var2].field_c != 0) {
                            break L3;
                          } else {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var4.field_s[var2] != null) {
                          if (var4.field_s[var2].field_c != 0) {
                            break L4;
                          } else {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "ec.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_20_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 30418) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = wi.a(-913, true, param1, 10);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ec.IA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    protected ec() {
    }

    public static void d(int param0) {
        boolean discarded$0 = false;
        if (param0 != -1) {
            discarded$0 = ec.e(-35);
            field_j = null;
            return;
        }
        field_j = null;
    }

    static {
    }
}
