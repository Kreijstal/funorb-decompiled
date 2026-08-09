/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static cp field_b;
    static int field_a;

    public static void b(int param0) {
        int var1 = 32 / ((-29 - param0) / 41);
        field_b = null;
    }

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_139_0 = 0;
        int var1;
        int var2;
        int var3;
        jp var4;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 2) {
          var1 = 1;
          var2 = m.field_i;
          if (-1 != (var2 ^ -1)) {
            if (1 != var2) {
              if (var2 != 2) {
                if ((var2 ^ -1) != -4) {
                  if (4 != var2) {
                    if ((var2 ^ -1) != -6) {
                      if (6 != var2) {
                        if (7 == var2) {
                          L0: {
                            if (!m.field_f.a(-123, oj.field_q, 22050, ic.field_a, gf.field_e)) {
                              stackIn_116_0 = 0;
                              break L0;
                            } else {
                              stackIn_116_0 = 1;
                              break L0;
                            }
                          }
                          L1: {
                            var1 = stackIn_116_0;
                            if (var1 != 0) {
                              m.field_i = m.field_i + 1;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        L2: {
                          if (!m.field_f.a(-111, c.field_j, 22050, ic.field_a, gf.field_e)) {
                            stackIn_139_0 = 0;
                            break L2;
                          } else {
                            stackIn_139_0 = 1;
                            break L2;
                          }
                        }
                        L3: {
                          var1 = stackIn_139_0;
                          if (var1 != 0) {
                            m.field_i = m.field_i + 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return false;
                      }
                    } else {
                      L4: {
                        if (!m.field_f.a(-112, uk.field_t, 22050, ic.field_a, gf.field_e)) {
                          stackIn_132_0 = 0;
                          break L4;
                        } else {
                          stackIn_132_0 = 1;
                          break L4;
                        }
                      }
                      L5: {
                        var1 = stackIn_132_0;
                        if (var1 != 0) {
                          m.field_i = m.field_i + 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return false;
                    }
                  } else {
                    L6: {
                      if (!m.field_f.a(-114, cd.field_g, 22050, ic.field_a, gf.field_e)) {
                        stackIn_103_0 = 0;
                        break L6;
                      } else {
                        stackIn_103_0 = 1;
                        break L6;
                      }
                    }
                    L7: {
                      var1 = stackIn_103_0;
                      if (var1 != 0) {
                        m.field_i = m.field_i + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return false;
                  }
                } else {
                  L8: {
                    oj.field_q = vm.a(kc.field_j, "", "BaB_podium");
                    if (null == oj.field_q) {
                      stackIn_95_0 = 0;
                      break L8;
                    } else {
                      stackIn_95_0 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    var1 = stackIn_95_0;
                    if (var1 != 0) {
                      m.field_i = m.field_i + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return false;
                }
              } else {
                L10: {
                  c.field_j = vm.a(kc.field_j, "", "BaB_game_completed");
                  if (null == c.field_j) {
                    stackIn_124_0 = 0;
                    break L10;
                  } else {
                    stackIn_124_0 = 1;
                    break L10;
                  }
                }
                L11: {
                  var1 = stackIn_124_0;
                  if (var1 != 0) {
                    m.field_i = m.field_i + 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return false;
              }
            } else {
              L12: {
                uk.field_t = vm.a(kc.field_j, "", "BaB_panic");
                if (uk.field_t == null) {
                  stackIn_85_0 = 0;
                  break L12;
                } else {
                  stackIn_85_0 = 1;
                  break L12;
                }
              }
              L13: {
                var1 = stackIn_85_0;
                if (var1 != 0) {
                  m.field_i = m.field_i + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              return false;
            }
          } else {
            L14: {
              cd.field_g = vm.a(kc.field_j, "", "BaB_title_music");
              if (null == cd.field_g) {
                stackIn_77_0 = 0;
                break L14;
              } else {
                stackIn_77_0 = 1;
                break L14;
              }
            }
            L15: {
              var1 = stackIn_77_0;
              if (var1 != 0) {
                m.field_i = m.field_i + 1;
                break L15;
              } else {
                break L15;
              }
            }
            return false;
          }
        } else {
          var4 = (jp) null;
          wo.a(-99, -77, (jp) null, -107, -18, 45, 120, 4, (jp) null, (jp) null, 24);
          var1 = 1;
          var2 = m.field_i;
          if (-1 != (var2 ^ -1)) {
            if (1 != var2) {
              if (var2 != 2) {
                if ((var2 ^ -1) != -4) {
                  if (4 != var2) {
                    if ((var2 ^ -1) != -6) {
                      if (6 != var2) {
                        if (7 != var2) {
                          return true;
                        } else {
                          L16: {
                            if (!m.field_f.a(-123, oj.field_q, 22050, ic.field_a, gf.field_e)) {
                              stackIn_43_0 = 0;
                              break L16;
                            } else {
                              stackIn_43_0 = 1;
                              break L16;
                            }
                          }
                          L17: {
                            var1 = stackIn_43_0;
                            if (var1 != 0) {
                              m.field_i = m.field_i + 1;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          return false;
                        }
                      } else {
                        L18: {
                          if (!m.field_f.a(-111, c.field_j, 22050, ic.field_a, gf.field_e)) {
                            stackIn_68_0 = 0;
                            break L18;
                          } else {
                            stackIn_68_0 = 1;
                            break L18;
                          }
                        }
                        L19: {
                          var1 = stackIn_68_0;
                          if (var1 != 0) {
                            m.field_i = m.field_i + 1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return false;
                      }
                    } else {
                      L20: {
                        if (!m.field_f.a(-112, uk.field_t, 22050, ic.field_a, gf.field_e)) {
                          stackIn_60_0 = 0;
                          break L20;
                        } else {
                          stackIn_60_0 = 1;
                          break L20;
                        }
                      }
                      L21: {
                        var1 = stackIn_60_0;
                        if (var1 != 0) {
                          m.field_i = m.field_i + 1;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      return false;
                    }
                  } else {
                    L22: {
                      if (!m.field_f.a(-114, cd.field_g, 22050, ic.field_a, gf.field_e)) {
                        stackIn_31_0 = 0;
                        break L22;
                      } else {
                        stackIn_31_0 = 1;
                        break L22;
                      }
                    }
                    L23: {
                      var1 = stackIn_31_0;
                      if (var1 != 0) {
                        m.field_i = m.field_i + 1;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    return false;
                  }
                } else {
                  L24: {
                    oj.field_q = vm.a(kc.field_j, "", "BaB_podium");
                    if (null == oj.field_q) {
                      stackIn_23_0 = 0;
                      break L24;
                    } else {
                      stackIn_23_0 = 1;
                      break L24;
                    }
                  }
                  L25: {
                    var1 = stackIn_23_0;
                    if (var1 != 0) {
                      m.field_i = m.field_i + 1;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  return false;
                }
              } else {
                L26: {
                  c.field_j = vm.a(kc.field_j, "", "BaB_game_completed");
                  if (null == c.field_j) {
                    stackIn_52_0 = 0;
                    break L26;
                  } else {
                    stackIn_52_0 = 1;
                    break L26;
                  }
                }
                L27: {
                  var1 = stackIn_52_0;
                  if (var1 != 0) {
                    m.field_i = m.field_i + 1;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return false;
              }
            } else {
              L28: {
                uk.field_t = vm.a(kc.field_j, "", "BaB_panic");
                if (uk.field_t == null) {
                  stackIn_13_0 = 0;
                  break L28;
                } else {
                  stackIn_13_0 = 1;
                  break L28;
                }
              }
              L29: {
                var1 = stackIn_13_0;
                if (var1 != 0) {
                  m.field_i = m.field_i + 1;
                  break L29;
                } else {
                  break L29;
                }
              }
              return false;
            }
          } else {
            L30: {
              cd.field_g = vm.a(kc.field_j, "", "BaB_title_music");
              if (null == cd.field_g) {
                stackIn_5_0 = 0;
                break L30;
              } else {
                stackIn_5_0 = 1;
                break L30;
              }
            }
            L31: {
              var1 = stackIn_5_0;
              if (var1 != 0) {
                m.field_i = m.field_i + 1;
                break L31;
              } else {
                break L31;
              }
            }
            return false;
          }
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, int param4, int param5, int param6, int param7, jp param8, jp param9, int param10) {
        try {
            param9.d((param4 - param9.field_x) / 2 + (param6 + (param1 * 5 >> -2042685680)), param0);
            uq.a(param2, 5 / param7 + (10 * param1 >> -1905158896) + ((param4 + -param2.field_x) / 2 + param6), 53 / param7 + -param2.field_z + (param5 + param0 - -480));
            uq.a(param8, -(5 / param7) + (param6 - (-((param4 - param8.field_x) / 2) - (param1 * 20 >> -1064006416))), 480 + -param8.field_z);
            if (param3 <= 108) {
                jp var12 = (jp) null;
                wo.a(25, -97, (jp) null, -16, -115, 10, -8, 2, (jp) null, (jp) null, -69);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wo.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    static {
    }
}
