/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    static String field_b;
    static String field_a;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        var9 = -78 % ((-51 - param0) / 33);
        var8 = cq.field_u[param6];
        if (9 == var8) {
          oo.a(param4, param2, param5, param7, param3, param1, (byte) -103);
          ac.field_k[ls.a(sr.a(1 + param7, param1 + -1, 2, (byte) -108), 1, sr.a(param7, -1 + param1, 2, (byte) -109), sr.a(param7 - -1, param1, 2, (byte) -94), -57) + 180].b(param3, param2, param4, param5);
          ac.field_k[ls.a(sr.a(-1 + param7, param1 + -1, 2, (byte) -113), 1, sr.a(param7, param1 + -1, 2, (byte) -116), sr.a(param7 - 1, param1, 2, (byte) -126), -63) + 181].b(param3, param2, param4, param5);
          ac.field_k[182 - -ls.a(sr.a(param7 - -1, 1 + param1, 2, (byte) -124), 1, sr.a(param7, param1 - -1, 2, (byte) -127), sr.a(param7 + 1, param1, 2, (byte) -122), -94)].b(param3, param2, param4, param5);
          ac.field_k[183 - -ls.a(sr.a(param7 + -1, param1 + 1, 2, (byte) -122), 1, sr.a(param7, param1 - -1, 2, (byte) -116), sr.a(-1 + param7, param1, 2, (byte) -114), -118)].b(param3, param2, param4, param5);
          return;
        } else {
          return;
        }
    }

    final static sc a(bv param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        sc var3 = null;
        sc stackIn_2_0 = null;
        sc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_3_0 = null;
        sc stackOut_1_0 = null;
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
            if (param1 == -23920) {
              var2_int = param0.i(1);
              param0.o(45);
              var3 = ut.a(param0, (byte) -85, var2_int);
              param0.n(-2);
              stackOut_3_0 = (sc) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (sc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("po.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null == no.field_K) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (-10 == (rs.field_q ^ -1)) {
          if (rb.a(ma.field_ab, ge.field_h, -17231, no.field_S, rv.field_b)) {
            if (2 == no.field_S) {
              return me.a(param1 ^ 6251, ge.field_h, rv.field_b, ma.field_ab, no.field_S);
            } else {
              if (var3 != 0) {
                return false;
              } else {
                return me.a(param1 ^ 6251, ge.field_h, rv.field_b, ma.field_ab, no.field_S);
              }
            }
          } else {
            if (param1 == 6150) {
              if (10 != rs.field_q) {
                if (11 != rs.field_q) {
                  return false;
                } else {
                  if (lq.field_d) {
                    if (vt.field_l != 2) {
                      if (vt.field_l == 2) {
                        if (!aw.a(true)) {
                          return true;
                        } else {
                          var4 = (String) null;
                          it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                          return true;
                        }
                      } else {
                        if (var3 != 0) {
                          return false;
                        } else {
                          if (!aw.a(true)) {
                            return true;
                          } else {
                            var4 = (String) null;
                            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                            return true;
                          }
                        }
                      }
                    } else {
                      if (!wq.a(rt.field_z, wn.field_db, (byte) 78)) {
                        return false;
                      } else {
                        if (vt.field_l == 2) {
                          if (!aw.a(true)) {
                            return true;
                          } else {
                            var4 = (String) null;
                            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                            return true;
                          }
                        } else {
                          if (var3 != 0) {
                            return false;
                          } else {
                            if (!aw.a(true)) {
                              return true;
                            } else {
                              var4 = (String) null;
                              it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                              return true;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                if (var3 == 0) {
                  np.k(param1 ^ 6217);
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              field_a = (String) null;
              if (10 != rs.field_q) {
                if (11 == rs.field_q) {
                  if (lq.field_d) {
                    if (vt.field_l != 2) {
                      if (vt.field_l == 2) {
                        if (!aw.a(true)) {
                          return true;
                        } else {
                          var4 = (String) null;
                          it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                          return true;
                        }
                      } else {
                        if (var3 == 0) {
                          L1: {
                            if (!aw.a(true)) {
                              break L1;
                            } else {
                              var4 = (String) null;
                              it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                              break L1;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      if (wq.a(rt.field_z, wn.field_db, (byte) 78)) {
                        if (vt.field_l != 2) {
                          if (var3 != 0) {
                            return false;
                          } else {
                            L2: {
                              if (!aw.a(true)) {
                                break L2;
                              } else {
                                var4 = (String) null;
                                it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                                break L2;
                              }
                            }
                            return true;
                          }
                        } else {
                          L3: {
                            if (!aw.a(true)) {
                              break L3;
                            } else {
                              var4 = (String) null;
                              it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                              break L3;
                            }
                          }
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (var3 == 0) {
                  np.k(param1 ^ 6217);
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          if (param1 == 6150) {
            if (10 != rs.field_q) {
              if (11 == rs.field_q) {
                if (lq.field_d) {
                  if (vt.field_l != 2) {
                    if (vt.field_l == 2) {
                      if (!aw.a(true)) {
                        return true;
                      } else {
                        var4 = (String) null;
                        it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                        return true;
                      }
                    } else {
                      if (var3 == 0) {
                        L4: {
                          if (!aw.a(true)) {
                            break L4;
                          } else {
                            var4 = (String) null;
                            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                            break L4;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    if (wq.a(rt.field_z, wn.field_db, (byte) 78)) {
                      if (vt.field_l != 2) {
                        if (var3 != 0) {
                          return false;
                        } else {
                          L5: {
                            if (!aw.a(true)) {
                              break L5;
                            } else {
                              var4 = (String) null;
                              it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                              break L5;
                            }
                          }
                          return true;
                        }
                      } else {
                        L6: {
                          if (!aw.a(true)) {
                            break L6;
                          } else {
                            var4 = (String) null;
                            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                            break L6;
                          }
                        }
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                return false;
              } else {
                np.k(param1 ^ 6217);
                return true;
              }
            }
          } else {
            field_a = (String) null;
            if (10 != rs.field_q) {
              if (11 == rs.field_q) {
                if (lq.field_d) {
                  L7: {
                    if (vt.field_l != 2) {
                      break L7;
                    } else {
                      if (!wq.a(rt.field_z, wn.field_db, (byte) 78)) {
                        return false;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (vt.field_l != 2) {
                    if (var3 != 0) {
                      return false;
                    } else {
                      L8: {
                        if (!aw.a(true)) {
                          break L8;
                        } else {
                          var4 = (String) null;
                          it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                          break L8;
                        }
                      }
                      return true;
                    }
                  } else {
                    L9: {
                      if (!aw.a(true)) {
                        break L9;
                      } else {
                        var4 = (String) null;
                        it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                        break L9;
                      }
                    }
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                return false;
              } else {
                np.k(param1 ^ 6217);
                return true;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = (String) null;
        }
    }

    static {
        field_b = "Yes";
        field_a = "This unit has already used a trinket this turn.";
    }
}
