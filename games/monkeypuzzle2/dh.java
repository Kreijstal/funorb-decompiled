/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static cd field_d;
    static volatile int field_b;
    static int field_c;
    static String field_a;

    final static am a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = param0.length();
          if (param1 > 40) {
            break L0;
          } else {
            field_b = 88;
            if (var2 != 0) {
              if ((var2 ^ -1) < -64) {
                return wk.field_f;
              } else {
                var3 = 0;
                if (var2 > var3) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 == 45) {
                      if (0 != var3) {
                        if (var2 + -1 != var3) {
                          var3++;
                          break L1;
                        } else {
                          return lh.field_c;
                        }
                      } else {
                        return lh.field_c;
                      }
                    } else {
                      if ((fb.field_i.indexOf(var4) ^ -1) == 0) {
                        return lh.field_c;
                      } else {
                        var3++;
                        break L1;
                      }
                    }
                  }
                  var3++;
                  var3++;
                  var3++;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              return si.field_s;
            }
          }
        }
        if (var2 != 0) {
          if ((var2 ^ -1) < -64) {
            return wk.field_f;
          } else {
            var3 = 0;
            L2: while (true) {
              if (var2 > var3) {
                var4 = param0.charAt(var3);
                if (var4 == 45) {
                  L3: {
                    if (0 == var3) {
                      break L3;
                    } else {
                      if (var2 + -1 == var3) {
                        break L3;
                      } else {
                        var3++;
                        var3++;
                        continue L2;
                      }
                    }
                  }
                  return lh.field_c;
                } else {
                  if ((fb.field_i.indexOf(var4) ^ -1) == 0) {
                    return lh.field_c;
                  } else {
                    var3++;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return si.field_s;
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        kd.field_a = null;
        ii.field_T = 0;
        pg.field_a = null;
        if (param0) {
          var2 = oh.field_c;
          oh.field_c = pi.field_o;
          if (param1 != -52) {
            if (50 == param1) {
              lg.field_n.field_a = 5;
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 < (lg.field_n.field_b ^ -1)) {
                L0: {
                  if (lg.field_n.field_b < 2) {
                    break L0;
                  } else {
                    if (param1 != -51) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 <= lg.field_n.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (51 != param1) {
                  L1: {
                    if (lg.field_n.field_b < 2) {
                      break L1;
                    } else {
                      if (param1 != -51) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 <= lg.field_n.field_b) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            } else {
              lg.field_n.field_a = 1;
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 < (lg.field_n.field_b ^ -1)) {
                L2: {
                  if (lg.field_n.field_b < 2) {
                    break L2;
                  } else {
                    if (param1 != -51) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 <= lg.field_n.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (51 != param1) {
                  L3: {
                    if (lg.field_n.field_b < 2) {
                      break L3;
                    } else {
                      if (param1 != -51) {
                        break L3;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 <= lg.field_n.field_b) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          } else {
            lg.field_n.field_a = 2;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (-3 > lg.field_n.field_b) {
              L4: {
                if (lg.field_n.field_b < 2) {
                  break L4;
                } else {
                  if (param1 != -51) {
                    break L4;
                  } else {
                    return 5;
                  }
                }
              }
              if (-5 <= lg.field_n.field_b) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (51 != param1) {
                L5: {
                  if (lg.field_n.field_b < 2) {
                    break L5;
                  } else {
                    if (param1 != -51) {
                      break L5;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 <= lg.field_n.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 2;
              }
            }
          }
        } else {
          field_a = null;
          var2 = oh.field_c;
          oh.field_c = pi.field_o;
          if (param1 != -52) {
            if (50 == param1) {
              lg.field_n.field_a = 5;
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 >= (lg.field_n.field_b ^ -1)) {
                if (51 == param1) {
                  return 2;
                } else {
                  if (lg.field_n.field_b >= 2) {
                    if (param1 != -51) {
                      if (-5 <= lg.field_n.field_b) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (-5 >= (lg.field_n.field_b ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L6: {
                  if (lg.field_n.field_b < 2) {
                    break L6;
                  } else {
                    if (param1 != -51) {
                      break L6;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 <= lg.field_n.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              lg.field_n.field_a = 1;
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 >= (lg.field_n.field_b ^ -1)) {
                if (51 == param1) {
                  return 2;
                } else {
                  if (lg.field_n.field_b >= 2) {
                    if (param1 != -51) {
                      if (-5 <= lg.field_n.field_b) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (-5 >= (lg.field_n.field_b ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L7: {
                  if (lg.field_n.field_b < 2) {
                    break L7;
                  } else {
                    if (param1 != -51) {
                      break L7;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 <= lg.field_n.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            lg.field_n.field_a = 2;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (-3 <= lg.field_n.field_b) {
              if (51 == param1) {
                return 2;
              } else {
                if (lg.field_n.field_b >= 2) {
                  if (param1 != -51) {
                    if (-5 <= lg.field_n.field_b) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              L8: {
                if (lg.field_n.field_b < 2) {
                  break L8;
                } else {
                  if (param1 != -51) {
                    break L8;
                  } else {
                    return 5;
                  }
                }
              }
              if (-5 <= lg.field_n.field_b) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -14955) {
            dh.a(-41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = "Suggested names: ";
        field_d = new cd("usename");
    }
}
