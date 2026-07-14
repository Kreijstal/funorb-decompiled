/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static String field_c;
    static String[] field_f;
    static boolean field_i;
    static boolean field_h;
    static String field_b;
    static String field_a;
    static String field_g;
    static int field_e;
    static String field_d;

    final static ql a(int param0, java.applet.Applet param1) {
        String var2 = null;
        ql[] var3 = null;
        int var4 = 0;
        ql var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = fd.a(28, param1, "jagex-last-login-method");
        if (var2 != null) {
          var3 = rm.b(1283220456);
          if (param0 > 106) {
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (!var5.a(var2, -90)) {
                  var4++;
                  continue L0;
                } else {
                  return var5;
                }
              } else {
                return vh.field_f;
              }
            }
          } else {
            return null;
          }
        } else {
          return vh.field_f;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 1) {
            return;
        }
        field_a = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static ho a(int param0, boolean param1) {
        ho var2 = null;
        ho stackIn_2_0 = null;
        ho stackIn_3_0 = null;
        ho stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ho stackOut_1_0 = null;
        ho stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ho stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 32517) {
          return null;
        } else {
          L0: {
            var2 = new ho(true);
            stackOut_1_0 = (ho) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (ho) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (ho) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((ho) (Object) stackIn_4_0).field_h = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = param4 + param2;
          var6 = param1 + param3;
          if (de.field_i < param2) {
            stackOut_2_0 = param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = de.field_i;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (de.field_c < param1) {
            stackOut_5_0 = param1;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = de.field_c;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 < de.field_h) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = de.field_h;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (de.field_k <= var6) {
            stackOut_11_0 = de.field_k;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param2 >= de.field_i) {
          if (param2 < de.field_h) {
            var11 = param2 + var8 * de.field_e;
            var12 = 1 + var10 + -var8 >> 197833953;
            L4: while (true) {
              var12--;
              if (0 > var12) {
                if (param1 >= de.field_c) {
                  if (de.field_k > var6) {
                    var11 = var7 + de.field_e * param1;
                    var12 = 1 - -var9 + -var7 >> -450354335;
                    L5: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        if (param0 == -32171) {
                          L6: {
                            if (var5 < de.field_i) {
                              break L6;
                            } else {
                              if (var5 < de.field_h) {
                                var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                                var12 = -var8 + 1 - -var10 >> 357107169;
                                L7: while (true) {
                                  var12--;
                                  if (var12 < 0) {
                                    break L6;
                                  } else {
                                    de.field_l[var11] = 16777215;
                                    var11 = var11 + de.field_e * 2;
                                    continue L7;
                                  }
                                }
                              } else {
                                L8: {
                                  if (param1 < de.field_c) {
                                    break L8;
                                  } else {
                                    if (de.field_k <= var6) {
                                      break L8;
                                    } else {
                                      var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                      var12 = var9 + (1 + -var7) >> 2063391585;
                                      L9: while (true) {
                                        var12--;
                                        if ((var12 ^ -1) > -1) {
                                          break L8;
                                        } else {
                                          de.field_l[var11] = 16777215;
                                          var11 += 2;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                          L10: {
                            if (param1 < de.field_c) {
                              break L10;
                            } else {
                              if (de.field_k <= var6) {
                                break L10;
                              } else {
                                var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                var12 = var9 + (1 + -var7) >> 2063391585;
                                L11: while (true) {
                                  var12--;
                                  if ((var12 ^ -1) > -1) {
                                    break L10;
                                  } else {
                                    de.field_l[var11] = 16777215;
                                    var11 += 2;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          L12: {
                            var14 = null;
                            ql discarded$5 = oj.a(82, (java.applet.Applet) null);
                            if (var5 < de.field_i) {
                              break L12;
                            } else {
                              if (var5 < de.field_h) {
                                var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                                var12 = -var8 + 1 - -var10 >> 357107169;
                                L13: while (true) {
                                  var12--;
                                  if (var12 < 0) {
                                    break L12;
                                  } else {
                                    de.field_l[var11] = 16777215;
                                    var11 = var11 + de.field_e * 2;
                                    continue L13;
                                  }
                                }
                              } else {
                                L14: {
                                  if (param1 < de.field_c) {
                                    break L14;
                                  } else {
                                    if (de.field_k <= var6) {
                                      break L14;
                                    } else {
                                      var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                      var12 = var9 + (1 + -var7) >> 2063391585;
                                      L15: while (true) {
                                        var12--;
                                        if ((var12 ^ -1) > -1) {
                                          break L14;
                                        } else {
                                          de.field_l[var11] = 16777215;
                                          var11 += 2;
                                          continue L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                          L16: {
                            if (param1 < de.field_c) {
                              break L16;
                            } else {
                              if (de.field_k <= var6) {
                                break L16;
                              } else {
                                var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                var12 = var9 + (1 + -var7) >> 2063391585;
                                L17: while (true) {
                                  var12--;
                                  if ((var12 ^ -1) > -1) {
                                    break L16;
                                  } else {
                                    de.field_l[var11] = 16777215;
                                    var11 += 2;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        de.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L5;
                      }
                    }
                  } else {
                    if (param0 == -32171) {
                      L18: {
                        if (var5 < de.field_i) {
                          break L18;
                        } else {
                          if (var5 < de.field_h) {
                            var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                            var12 = -var8 + 1 - -var10 >> 357107169;
                            L19: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L18;
                              } else {
                                de.field_l[var11] = 16777215;
                                var11 = var11 + de.field_e * 2;
                                continue L19;
                              }
                            }
                          } else {
                            L20: {
                              if (param1 < de.field_c) {
                                break L20;
                              } else {
                                if (de.field_k <= var6) {
                                  break L20;
                                } else {
                                  var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                  var12 = var9 + (1 + -var7) >> 2063391585;
                                  L21: while (true) {
                                    var12--;
                                    if ((var12 ^ -1) > -1) {
                                      break L20;
                                    } else {
                                      de.field_l[var11] = 16777215;
                                      var11 += 2;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      L22: {
                        if (param1 < de.field_c) {
                          break L22;
                        } else {
                          if (de.field_k <= var6) {
                            break L22;
                          } else {
                            var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                            var12 = var9 + (1 + -var7) >> 2063391585;
                            L23: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L22;
                              } else {
                                de.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L24: {
                        var14 = null;
                        ql discarded$6 = oj.a(82, (java.applet.Applet) null);
                        if (var5 < de.field_i) {
                          break L24;
                        } else {
                          if (var5 < de.field_h) {
                            var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                            var12 = -var8 + 1 - -var10 >> 357107169;
                            L25: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L24;
                              } else {
                                de.field_l[var11] = 16777215;
                                var11 = var11 + de.field_e * 2;
                                continue L25;
                              }
                            }
                          } else {
                            L26: {
                              if (param1 < de.field_c) {
                                break L26;
                              } else {
                                if (de.field_k <= var6) {
                                  break L26;
                                } else {
                                  var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                  var12 = var9 + (1 + -var7) >> 2063391585;
                                  L27: while (true) {
                                    var12--;
                                    if ((var12 ^ -1) > -1) {
                                      break L26;
                                    } else {
                                      de.field_l[var11] = 16777215;
                                      var11 += 2;
                                      continue L27;
                                    }
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      L28: {
                        if (param1 < de.field_c) {
                          break L28;
                        } else {
                          if (de.field_k <= var6) {
                            break L28;
                          } else {
                            var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                            var12 = var9 + (1 + -var7) >> 2063391585;
                            L29: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L28;
                              } else {
                                de.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L29;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (param0 == -32171) {
                    L30: {
                      if (var5 < de.field_i) {
                        break L30;
                      } else {
                        if (var5 < de.field_h) {
                          var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                          var12 = -var8 + 1 - -var10 >> 357107169;
                          L31: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L30;
                            } else {
                              de.field_l[var11] = 16777215;
                              var11 = var11 + de.field_e * 2;
                              continue L31;
                            }
                          }
                        } else {
                          L32: {
                            if (param1 < de.field_c) {
                              break L32;
                            } else {
                              if (de.field_k <= var6) {
                                break L32;
                              } else {
                                var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                var12 = var9 + (1 + -var7) >> 2063391585;
                                L33: while (true) {
                                  var12--;
                                  if ((var12 ^ -1) > -1) {
                                    break L32;
                                  } else {
                                    de.field_l[var11] = 16777215;
                                    var11 += 2;
                                    continue L33;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L34: {
                      if (param1 < de.field_c) {
                        break L34;
                      } else {
                        if (de.field_k <= var6) {
                          break L34;
                        } else {
                          var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                          var12 = var9 + (1 + -var7) >> 2063391585;
                          L35: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L34;
                            } else {
                              de.field_l[var11] = 16777215;
                              var11 += 2;
                              continue L35;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L36: {
                      var14 = null;
                      ql discarded$7 = oj.a(82, (java.applet.Applet) null);
                      if (var5 < de.field_i) {
                        break L36;
                      } else {
                        if (var5 < de.field_h) {
                          var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                          var12 = -var8 + 1 - -var10 >> 357107169;
                          L37: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L36;
                            } else {
                              de.field_l[var11] = 16777215;
                              var11 = var11 + de.field_e * 2;
                              continue L37;
                            }
                          }
                        } else {
                          L38: {
                            if (param1 < de.field_c) {
                              break L38;
                            } else {
                              if (de.field_k <= var6) {
                                break L38;
                              } else {
                                var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                                var12 = var9 + (1 + -var7) >> 2063391585;
                                L39: while (true) {
                                  var12--;
                                  if ((var12 ^ -1) > -1) {
                                    break L38;
                                  } else {
                                    de.field_l[var11] = 16777215;
                                    var11 += 2;
                                    continue L39;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L40: {
                      if (param1 < de.field_c) {
                        break L40;
                      } else {
                        if (de.field_k <= var6) {
                          break L40;
                        } else {
                          var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                          var12 = var9 + (1 + -var7) >> 2063391585;
                          L41: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L40;
                            } else {
                              de.field_l[var11] = 16777215;
                              var11 += 2;
                              continue L41;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                de.field_l[var11] = 16777215;
                var11 = var11 + de.field_e * 2;
                continue L4;
              }
            }
          } else {
            L42: {
              if (param1 < de.field_c) {
                break L42;
              } else {
                if (de.field_k <= var6) {
                  break L42;
                } else {
                  var11 = var7 + de.field_e * param1;
                  var12 = 1 - -var9 + -var7 >> -450354335;
                  L43: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L42;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L43;
                    }
                  }
                }
              }
            }
            if (param0 == -32171) {
              if (var5 >= de.field_i) {
                if (var5 < de.field_h) {
                  var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                  var12 = -var8 + 1 - -var10 >> 357107169;
                  L44: while (true) {
                    var12--;
                    if (var12 >= 0) {
                      de.field_l[var11] = 16777215;
                      var11 = var11 + de.field_e * 2;
                      continue L44;
                    } else {
                      L45: {
                        if (param1 < de.field_c) {
                          break L45;
                        } else {
                          if (de.field_k <= var6) {
                            break L45;
                          } else {
                            var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                            var12 = var9 + (1 + -var7) >> 2063391585;
                            L46: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L45;
                              } else {
                                de.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L46;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L47: {
                    if (param1 < de.field_c) {
                      break L47;
                    } else {
                      if (de.field_k <= var6) {
                        break L47;
                      } else {
                        var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                        var12 = var9 + (1 + -var7) >> 2063391585;
                        L48: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L47;
                          } else {
                            de.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L48;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L49: {
                  if (param1 < de.field_c) {
                    break L49;
                  } else {
                    if (de.field_k <= var6) {
                      break L49;
                    } else {
                      var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                      var12 = var9 + (1 + -var7) >> 2063391585;
                      L50: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L49;
                        } else {
                          de.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L50;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              var14 = null;
              ql discarded$8 = oj.a(82, (java.applet.Applet) null);
              if (var5 >= de.field_i) {
                if (var5 >= de.field_h) {
                  L51: {
                    if (param1 < de.field_c) {
                      break L51;
                    } else {
                      if (de.field_k <= var6) {
                        break L51;
                      } else {
                        var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                        var12 = var9 + (1 + -var7) >> 2063391585;
                        L52: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L51;
                          } else {
                            de.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L52;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                  var12 = -var8 + 1 - -var10 >> 357107169;
                  L53: while (true) {
                    var12--;
                    if (var12 < 0) {
                      L54: {
                        if (param1 < de.field_c) {
                          break L54;
                        } else {
                          if (de.field_k <= var6) {
                            break L54;
                          } else {
                            var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                            var12 = var9 + (1 + -var7) >> 2063391585;
                            L55: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L54;
                              } else {
                                de.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L55;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 = var11 + de.field_e * 2;
                      continue L53;
                    }
                  }
                }
              } else {
                L56: {
                  if (param1 < de.field_c) {
                    break L56;
                  } else {
                    if (de.field_k <= var6) {
                      break L56;
                    } else {
                      var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                      var12 = var9 + (1 + -var7) >> 2063391585;
                      L57: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L56;
                        } else {
                          de.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L57;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          L58: {
            if (param1 < de.field_c) {
              break L58;
            } else {
              if (de.field_k <= var6) {
                break L58;
              } else {
                var11 = var7 + de.field_e * param1;
                var12 = 1 - -var9 + -var7 >> -450354335;
                L59: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L58;
                  } else {
                    de.field_l[var11] = 16777215;
                    var11 += 2;
                    continue L59;
                  }
                }
              }
            }
          }
          if (param0 == -32171) {
            if (var5 >= de.field_i) {
              if (var5 >= de.field_h) {
                L60: {
                  if (param1 < de.field_c) {
                    break L60;
                  } else {
                    if (de.field_k <= var6) {
                      break L60;
                    } else {
                      var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                      var12 = var9 + (1 + -var7) >> 2063391585;
                      L61: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L60;
                        } else {
                          de.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L61;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                var12 = -var8 + 1 - -var10 >> 357107169;
                L62: while (true) {
                  var12--;
                  if (var12 < 0) {
                    L63: {
                      if (param1 < de.field_c) {
                        break L63;
                      } else {
                        if (de.field_k <= var6) {
                          break L63;
                        } else {
                          var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                          var12 = var9 + (1 + -var7) >> 2063391585;
                          L64: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L63;
                            } else {
                              de.field_l[var11] = 16777215;
                              var11 += 2;
                              continue L64;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    de.field_l[var11] = 16777215;
                    var11 = var11 + de.field_e * 2;
                    continue L62;
                  }
                }
              }
            } else {
              L65: {
                if (param1 < de.field_c) {
                  break L65;
                } else {
                  if (de.field_k <= var6) {
                    break L65;
                  } else {
                    var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                    var12 = var9 + (1 + -var7) >> 2063391585;
                    L66: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L65;
                      } else {
                        de.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L66;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L67: {
              var14 = null;
              ql discarded$9 = oj.a(82, (java.applet.Applet) null);
              if (var5 < de.field_i) {
                break L67;
              } else {
                if (var5 < de.field_h) {
                  var11 = de.field_e * ((-param2 + var5 & 1) + var8) + var5;
                  var12 = -var8 + 1 - -var10 >> 357107169;
                  L68: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L67;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 = var11 + de.field_e * 2;
                      continue L68;
                    }
                  }
                } else {
                  break L67;
                }
              }
            }
            L69: {
              if (param1 < de.field_c) {
                break L69;
              } else {
                if (de.field_k <= var6) {
                  break L69;
                } else {
                  var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                  var12 = var9 + (1 + -var7) >> 2063391585;
                  L70: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L69;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L70;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_c = "Your request to join has been declined.";
        field_e = 25;
        field_b = "Email address is unavailable";
        field_g = "Full screen";
        field_d = "Invite more players, or alternatively try changing the following settings:  ";
        field_a = "Home in and explode. Click to select the target destination, then hold the mouse to increase the velocity of the attack.";
    }
}
