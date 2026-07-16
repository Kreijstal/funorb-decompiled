/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    static String field_f;
    static int field_e;
    static ea field_a;
    static ea field_c;
    static int field_b;
    static ea field_d;
    static int field_g;

    final static gj a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var6 = MinerDisturbance.field_ab;
        var2 = param1.length();
        if (var2 == 0) {
          return dh.field_d;
        } else {
          if (64 < var2) {
            return ec.field_d;
          } else {
            L0: {
              if (param0 == 92) {
                break L0;
              } else {
                var7 = null;
                gj discarded$2 = ha.a(2, (String) null);
                break L0;
              }
            }
            if (34 != param1.charAt(0)) {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (46 != var5) {
                    if (al.field_o.indexOf(var5) == -1) {
                      return vh.field_f;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L1;
                    }
                  } else {
                    L2: {
                      if (-1 == (var4 ^ -1)) {
                        break L2;
                      } else {
                        if (-1 + var2 == var4) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return vh.field_f;
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (param1.charAt(-1 + var2) == 34) {
                var3 = 0;
                var4 = 1;
                L3: while (true) {
                  if (var2 + -1 > var4) {
                    var5 = param1.charAt(var4);
                    if (92 == var5) {
                      L4: {
                        if (var3 != 0) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_19_0;
                      var4++;
                      continue L3;
                    } else {
                      L5: {
                        if (var5 != 34) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            return vh.field_f;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return vh.field_f;
              }
            }
          }
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          if (param0 == 242) {
            break L0;
          } else {
            ha.a((byte) 76);
            break L0;
          }
        }
        L1: {
          var2 = param1;
          if (var2 != 32) {
            if (160 == var2) {
              break L1;
            } else {
              if (95 == var2) {
                break L1;
              } else {
                if (-46 != (var2 ^ -1)) {
                  L2: {
                    if (var2 != 91) {
                      if ((var2 ^ -1) == -94) {
                        break L2;
                      } else {
                        if (-36 == (var2 ^ -1)) {
                          break L2;
                        } else {
                          L3: {
                            if (-225 == (var2 ^ -1)) {
                              break L3;
                            } else {
                              if (225 == var2) {
                                break L3;
                              } else {
                                if ((var2 ^ -1) == -227) {
                                  break L3;
                                } else {
                                  if (228 == var2) {
                                    break L3;
                                  } else {
                                    if (227 != var2) {
                                      if (var2 != 192) {
                                        if (-194 == (var2 ^ -1)) {
                                          break L3;
                                        } else {
                                          if (var2 == 194) {
                                            break L3;
                                          } else {
                                            if (196 != var2) {
                                              if (var2 != 195) {
                                                L4: {
                                                  if (var2 != 232) {
                                                    if (var2 == 233) {
                                                      break L4;
                                                    } else {
                                                      if (-235 != (var2 ^ -1)) {
                                                        if (var2 != 235) {
                                                          if ((var2 ^ -1) == -201) {
                                                            break L4;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (var2 == 202) {
                                                                break L4;
                                                              } else {
                                                                if (203 != var2) {
                                                                  L5: {
                                                                    if (237 != var2) {
                                                                      if (238 != var2) {
                                                                        if (-240 == (var2 ^ -1)) {
                                                                          break L5;
                                                                        } else {
                                                                          if (-206 == (var2 ^ -1)) {
                                                                            break L5;
                                                                          } else {
                                                                            if (-207 == (var2 ^ -1)) {
                                                                              break L5;
                                                                            } else {
                                                                              if (-208 == (var2 ^ -1)) {
                                                                                break L5;
                                                                              } else {
                                                                                L6: {
                                                                                  if (var2 == 242) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if ((var2 ^ -1) == -244) {
                                                                                      break L6;
                                                                                    } else {
                                                                                      if (244 != var2) {
                                                                                        if ((var2 ^ -1) == -247) {
                                                                                          break L6;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L6;
                                                                                          } else {
                                                                                            if (var2 != 210) {
                                                                                              if (-212 == (var2 ^ -1)) {
                                                                                                break L6;
                                                                                              } else {
                                                                                                if (var2 != 212) {
                                                                                                  if (214 == var2) {
                                                                                                    break L6;
                                                                                                  } else {
                                                                                                    if (var2 != 213) {
                                                                                                      L7: {
                                                                                                        if ((var2 ^ -1) == -250) {
                                                                                                          break L7;
                                                                                                        } else {
                                                                                                          if (-251 == (var2 ^ -1)) {
                                                                                                            break L7;
                                                                                                          } else {
                                                                                                            if ((var2 ^ -1) != -252) {
                                                                                                              if (-253 == (var2 ^ -1)) {
                                                                                                                break L7;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if (var2 == 218) {
                                                                                                                    break L7;
                                                                                                                  } else {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L7;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) == -221) {
                                                                                                                        break L7;
                                                                                                                      } else {
                                                                                                                        L8: {
                                                                                                                          if (231 != var2) {
                                                                                                                            if ((var2 ^ -1) == -200) {
                                                                                                                              break L8;
                                                                                                                            } else {
                                                                                                                              L9: {
                                                                                                                                if (255 == var2) {
                                                                                                                                  break L9;
                                                                                                                                } else {
                                                                                                                                  if (-377 != (var2 ^ -1)) {
                                                                                                                                    L10: {
                                                                                                                                      if (-242 != (var2 ^ -1)) {
                                                                                                                                        if (var2 == 209) {
                                                                                                                                          break L10;
                                                                                                                                        } else {
                                                                                                                                          if ((var2 ^ -1) != -224) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        break L10;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L9;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            break L8;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L7;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L7;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L6;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  break L6;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              break L6;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L6;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L5;
                                                                      }
                                                                    } else {
                                                                      break L5;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L4;
                                                                }
                                                              }
                                                            } else {
                                                              break L4;
                                                            }
                                                          }
                                                        } else {
                                                          break L4;
                                                        }
                                                      } else {
                                                        break L4;
                                                      }
                                                    }
                                                  } else {
                                                    break L4;
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L3;
                                              }
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return 'a';
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  return param1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return '_';
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 != 28) {
            Object var2 = null;
            gj discarded$0 = ha.a(-127, (String) null);
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        if (param2 != 92) {
            Object var4 = null;
            gj discarded$0 = ha.a(91, (String) null);
        }
        return pd.a(param0, true, true, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_b = -1;
    }
}
