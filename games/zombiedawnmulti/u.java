/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends br {
    static String field_k;
    static boolean field_i;
    int[] field_h;
    static String field_j;
    static String field_f;
    int field_g;

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        vh.field_Gb = null;
        vo.field_o = null;
        la.field_d = 0;
        var2 = qe.field_f;
        qe.field_f = ll.field_b;
        ll.field_b = var2;
        if (param1 == 5) {
          if (-52 != (param0 ^ -1)) {
            if (param0 != 50) {
              i.field_a.field_p = 1;
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n < 2) {
                L0: {
                  if (-3 > i.field_a.field_n) {
                    break L0;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  L1: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L1;
                    } else {
                      if (param0 != -51) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              i.field_a.field_p = 5;
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n < 2) {
                L2: {
                  if (-3 > i.field_a.field_n) {
                    break L2;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  L3: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L3;
                    } else {
                      if (param0 != -51) {
                        break L3;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            i.field_a.field_p = 2;
            i.field_a.field_n = i.field_a.field_n + 1;
            if (i.field_a.field_n < 2) {
              L4: {
                if (-3 > i.field_a.field_n) {
                  break L4;
                } else {
                  if ((param0 ^ -1) != -51) {
                    break L4;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > i.field_a.field_n) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param0 == 51) {
                return 2;
              } else {
                if (-3 >= (i.field_a.field_n ^ -1)) {
                  if (param0 == -51) {
                    return 5;
                  } else {
                    if (4 > i.field_a.field_n) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          var4 = null;
          ll discarded$1 = u.a(-78, (go) null, 25, -28, -35, -43);
          if (-52 != param0) {
            if (param0 != 50) {
              i.field_a.field_p = 1;
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n >= 2) {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (-3 >= (i.field_a.field_n ^ -1)) {
                    if ((param0 ^ -1) != -51) {
                      if (4 > i.field_a.field_n) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (4 > i.field_a.field_n) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (-3 >= (i.field_a.field_n ^ -1)) {
                  if ((param0 ^ -1) == -51) {
                    return 5;
                  } else {
                    if (4 > i.field_a.field_n) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              i.field_a.field_p = 5;
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n >= 2) {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (-3 >= (i.field_a.field_n ^ -1)) {
                    if ((param0 ^ -1) != -51) {
                      if (4 <= i.field_a.field_n) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (4 <= i.field_a.field_n) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L5: {
                  if (-3 < (i.field_a.field_n ^ -1)) {
                    break L5;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L5;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 <= i.field_a.field_n) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            i.field_a.field_p = 2;
            i.field_a.field_n = i.field_a.field_n + 1;
            if (i.field_a.field_n >= 2) {
              if (param0 == 51) {
                return 2;
              } else {
                if (-3 >= (i.field_a.field_n ^ -1)) {
                  if ((param0 ^ -1) != -51) {
                    if (4 <= i.field_a.field_n) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (4 <= i.field_a.field_n) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              L6: {
                if (-3 > i.field_a.field_n) {
                  break L6;
                } else {
                  if ((param0 ^ -1) != -51) {
                    break L6;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 <= i.field_a.field_n) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 21242) {
            return null;
        }
        return qa.a(param3, param4, 1, 3, (byte) 127, param2, param1, 1, 1);
    }

    final static ul a(int param0, int param1) {
        if (param0 != 5) {
          field_k = null;
          return wm.a(param1, 1, true, false, 19, false);
        } else {
          return wm.a(param1, 1, true, false, 19, false);
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_f = null;
        if (param0 != -7406) {
            field_k = null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!ba.c(-1)) {
            aq.field_B.a(iq.a(bo.field_d, -1, bd.field_g), 76, iq.a(ka.field_t, -1, vb.field_f));
            if (param0 <= -50) {
              L1: {
                if (!aq.field_B.c(-85)) {
                  break L1;
                } else {
                  var1 = 1;
                  break L1;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (aq.field_B.field_d <= -1) {
                  var3 = v.field_b[aq.field_B.field_d];
                  if (2 == var3) {
                    L2: {
                      ek.i(81);
                      if (-1 != var3) {
                        break L2;
                      } else {
                        if (ho.field_q == 2) {
                          var4 = bl.a((byte) 118) - so.field_s;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (-1 <= var6) {
                            eb.a(false, true, 5);
                            var3 = 2;
                            break L2;
                          } else {
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  } else {
                    if (5 == var3) {
                      L3: {
                        ek.i(81);
                        if (-1 != var3) {
                          break L3;
                        } else {
                          if (ho.field_q == 2) {
                            var4 = bl.a((byte) 118) - so.field_s;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (-1 <= var6) {
                              eb.a(false, true, 5);
                              var3 = 2;
                              break L3;
                            } else {
                              return var3;
                            }
                          } else {
                            return var3;
                          }
                        }
                      }
                      return var3;
                    } else {
                      L4: {
                        if (-1 != (var3 ^ -1)) {
                          break L4;
                        } else {
                          if (ho.field_q == 2) {
                            var4 = bl.a((byte) 118) - so.field_s;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (-1 <= var6) {
                              eb.a(false, true, 5);
                              var3 = 2;
                              break L4;
                            } else {
                              return var3;
                            }
                          } else {
                            return var3;
                          }
                        }
                      }
                      return var3;
                    }
                  }
                } else {
                  if (var2 != 0) {
                    if (2 == ho.field_q) {
                      L5: {
                        if (-1 != var3) {
                          break L5;
                        } else {
                          if (ho.field_q == 2) {
                            var4 = bl.a((byte) 118) - so.field_s;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (-1 <= (var6 ^ -1)) {
                              eb.a(false, true, 5);
                              var3 = 2;
                              break L5;
                            } else {
                              return var3;
                            }
                          } else {
                            return var3;
                          }
                        }
                      }
                      return var3;
                    } else {
                      L6: {
                        ek.i(126);
                        if (-1 != (var3 ^ -1)) {
                          break L6;
                        } else {
                          if (ho.field_q == 2) {
                            var4 = bl.a((byte) 118) - so.field_s;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (-1 <= (var6 ^ -1)) {
                              eb.a(false, true, 5);
                              var3 = 2;
                              break L6;
                            } else {
                              return var3;
                            }
                          } else {
                            return var3;
                          }
                        }
                      }
                      return var3;
                    }
                  } else {
                    L7: {
                      if (-1 != var3) {
                        break L7;
                      } else {
                        if (ho.field_q == 2) {
                          var4 = bl.a((byte) 118) - so.field_s;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (-1 <= (var6 ^ -1)) {
                            eb.a(false, true, 5);
                            var3 = 2;
                            break L7;
                          } else {
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  }
                }
              } else {
                if (var2 != 0) {
                  if (2 != ho.field_q) {
                    L8: {
                      ek.i(126);
                      if (-1 != var3) {
                        break L8;
                      } else {
                        if (ho.field_q == 2) {
                          var4 = bl.a((byte) 118) - so.field_s;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (-1 <= (var6 ^ -1)) {
                            eb.a(false, true, 5);
                            var3 = 2;
                            break L8;
                          } else {
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  } else {
                    if (-1 == var3) {
                      if (ho.field_q == 2) {
                        var4 = bl.a((byte) 118) - so.field_s;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (-1 > (var6 ^ -1)) {
                          return var3;
                        } else {
                          eb.a(false, true, 5);
                          var3 = 2;
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  }
                } else {
                  if (-1 == (var3 ^ -1)) {
                    if (ho.field_q == 2) {
                      var4 = bl.a((byte) 118) - so.field_s;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (-1 > (var6 ^ -1)) {
                        return var3;
                      } else {
                        eb.a(false, true, 5);
                        var3 = 2;
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            } else {
              return 119;
            }
          } else {
            L9: {
              aq.field_B.d(99);
              if (!aq.field_B.c(-85)) {
                break L9;
              } else {
                var1 = 1;
                break L9;
              }
            }
            if (-14 == (sj.field_p ^ -1)) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final static ll a(int param0, go param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        ll var7 = null;
        java.awt.Frame var8 = null;
        var8 = m.a(param5, param1, param4, param3, param2, 88);
        var6 = var8;
        if (param0 == 10386) {
          if (var8 == null) {
            return null;
          } else {
            var7 = new ll();
            var7.field_i = var8;
            java.awt.Component discarded$2 = var7.field_i.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param5, param2);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    private u() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "(1 player wants to join)";
        field_j = "Rematch?";
        field_f = "Invalid name";
    }
}
