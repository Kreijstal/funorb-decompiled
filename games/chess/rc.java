/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_f;
    static volatile boolean field_d;
    static lh field_a;
    static String field_c;
    static String field_e;
    static String field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
          var13 = Chess.field_G;
          var5 = param3 + param2;
          var6 = param4 - -param0;
          if (wb.field_i >= param2) {
            stackOut_2_0 = wb.field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param4 <= wb.field_a) {
            stackOut_5_0 = wb.field_a;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= wb.field_j) {
            stackOut_8_0 = wb.field_j;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 < wb.field_b) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = wb.field_b;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (wb.field_i <= param2) {
          if (param2 < wb.field_j) {
            var11 = param2 + wb.field_h * var8;
            var12 = -var8 + 1 + var10 >> 85216097;
            L4: while (true) {
              var12--;
              if ((var12 ^ -1) > -1) {
                L5: {
                  if (wb.field_a > param4) {
                    break L5;
                  } else {
                    if (wb.field_b > var6) {
                      var11 = wb.field_h * param4 + var7;
                      var12 = var9 + (1 - var7) >> 84626305;
                      L6: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L5;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L6;
                        }
                      }
                    } else {
                      L7: {
                        if (var5 < wb.field_i) {
                          break L7;
                        } else {
                          if (var5 >= wb.field_j) {
                            break L7;
                          } else {
                            var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                            var12 = -var8 + (var10 + 1) >> -1140663615;
                            L8: while (true) {
                              var12--;
                              if (0 > var12) {
                                break L7;
                              } else {
                                wb.field_d[var11] = 16777215;
                                var11 = var11 + 2 * wb.field_h;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      L9: {
                        if (param4 < wb.field_a) {
                          break L9;
                        } else {
                          if (var6 >= wb.field_b) {
                            break L9;
                          } else {
                            var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                            var12 = var9 + 1 + -var7 >> -184342687;
                            L10: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L9;
                              } else {
                                wb.field_d[var11] = 16777215;
                                var11 += 2;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      if (!param1) {
                        return;
                      } else {
                        rc.a(-44, false, -98, -67, 79);
                        return;
                      }
                    }
                  }
                }
                L11: {
                  if (var5 < wb.field_i) {
                    break L11;
                  } else {
                    if (var5 >= wb.field_j) {
                      break L11;
                    } else {
                      var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                      var12 = -var8 + (var10 + 1) >> -1140663615;
                      L12: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L11;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 = var11 + 2 * wb.field_h;
                          continue L12;
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (param4 < wb.field_a) {
                    break L13;
                  } else {
                    if (var6 >= wb.field_b) {
                      break L13;
                    } else {
                      var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                      var12 = var9 + 1 + -var7 >> -184342687;
                      L14: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L13;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L14;
                        }
                      }
                    }
                  }
                }
                if (!param1) {
                  return;
                } else {
                  rc.a(-44, false, -98, -67, 79);
                  return;
                }
              } else {
                wb.field_d[var11] = 16777215;
                var11 = var11 + 2 * wb.field_h;
                continue L4;
              }
            }
          } else {
            if (wb.field_a <= param4) {
              if (wb.field_b > var6) {
                var11 = wb.field_h * param4 + var7;
                var12 = var9 + (1 - var7) >> 84626305;
                L15: while (true) {
                  var12--;
                  if ((var12 ^ -1) <= -1) {
                    wb.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L15;
                  } else {
                    L16: {
                      if (var5 < wb.field_i) {
                        break L16;
                      } else {
                        if (var5 >= wb.field_j) {
                          break L16;
                        } else {
                          var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                          var12 = -var8 + (var10 + 1) >> -1140663615;
                          L17: while (true) {
                            var12--;
                            if (0 > var12) {
                              break L16;
                            } else {
                              wb.field_d[var11] = 16777215;
                              var11 = var11 + 2 * wb.field_h;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (param4 < wb.field_a) {
                        break L18;
                      } else {
                        if (var6 >= wb.field_b) {
                          break L18;
                        } else {
                          var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                          var12 = var9 + 1 + -var7 >> -184342687;
                          L19: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L18;
                            } else {
                              wb.field_d[var11] = 16777215;
                              var11 += 2;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    if (!param1) {
                      return;
                    } else {
                      rc.a(-44, false, -98, -67, 79);
                      return;
                    }
                  }
                }
              } else {
                L20: {
                  if (var5 < wb.field_i) {
                    break L20;
                  } else {
                    if (var5 >= wb.field_j) {
                      break L20;
                    } else {
                      var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                      var12 = -var8 + (var10 + 1) >> -1140663615;
                      L21: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L20;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 = var11 + 2 * wb.field_h;
                          continue L21;
                        }
                      }
                    }
                  }
                }
                L22: {
                  if (param4 < wb.field_a) {
                    break L22;
                  } else {
                    if (var6 >= wb.field_b) {
                      break L22;
                    } else {
                      var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                      var12 = var9 + 1 + -var7 >> -184342687;
                      L23: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L22;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L23;
                        }
                      }
                    }
                  }
                }
                if (param1) {
                  rc.a(-44, false, -98, -67, 79);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L24: {
                if (var5 < wb.field_i) {
                  break L24;
                } else {
                  if (var5 >= wb.field_j) {
                    break L24;
                  } else {
                    var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                    var12 = -var8 + (var10 + 1) >> -1140663615;
                    L25: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L24;
                      } else {
                        wb.field_d[var11] = 16777215;
                        var11 = var11 + 2 * wb.field_h;
                        continue L25;
                      }
                    }
                  }
                }
              }
              L26: {
                if (param4 < wb.field_a) {
                  break L26;
                } else {
                  if (var6 >= wb.field_b) {
                    break L26;
                  } else {
                    var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                    var12 = var9 + 1 + -var7 >> -184342687;
                    L27: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L26;
                      } else {
                        wb.field_d[var11] = 16777215;
                        var11 += 2;
                        continue L27;
                      }
                    }
                  }
                }
              }
              if (param1) {
                rc.a(-44, false, -98, -67, 79);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L28: {
            if (wb.field_a > param4) {
              break L28;
            } else {
              if (wb.field_b > var6) {
                var11 = wb.field_h * param4 + var7;
                var12 = var9 + (1 - var7) >> 84626305;
                L29: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L28;
                  } else {
                    wb.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L29;
                  }
                }
              } else {
                L30: {
                  if (var5 < wb.field_i) {
                    break L30;
                  } else {
                    if (var5 >= wb.field_j) {
                      break L30;
                    } else {
                      var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                      var12 = -var8 + (var10 + 1) >> -1140663615;
                      L31: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L30;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 = var11 + 2 * wb.field_h;
                          continue L31;
                        }
                      }
                    }
                  }
                }
                L32: {
                  if (param4 < wb.field_a) {
                    break L32;
                  } else {
                    if (var6 >= wb.field_b) {
                      break L32;
                    } else {
                      var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                      var12 = var9 + 1 + -var7 >> -184342687;
                      L33: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L32;
                        } else {
                          wb.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L33;
                        }
                      }
                    }
                  }
                }
                L34: {
                  if (!param1) {
                    break L34;
                  } else {
                    rc.a(-44, false, -98, -67, 79);
                    break L34;
                  }
                }
                return;
              }
            }
          }
          L35: {
            if (var5 < wb.field_i) {
              break L35;
            } else {
              if (var5 >= wb.field_j) {
                break L35;
              } else {
                var11 = var5 + (var8 + (-param2 + var5 & 1)) * wb.field_h;
                var12 = -var8 + (var10 + 1) >> -1140663615;
                L36: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L35;
                  } else {
                    wb.field_d[var11] = 16777215;
                    var11 = var11 + 2 * wb.field_h;
                    continue L36;
                  }
                }
              }
            }
          }
          L37: {
            if (param4 < wb.field_a) {
              break L37;
            } else {
              if (var6 >= wb.field_b) {
                break L37;
              } else {
                var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                var12 = var9 + 1 + -var7 >> -184342687;
                L38: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L37;
                  } else {
                    wb.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L38;
                  }
                }
              }
            }
          }
          if (param1) {
            rc.a(-44, false, -98, -67, 79);
            return;
          } else {
            return;
          }
        }
    }

    final static pm a(String param0, int param1, String param2, um param3, um param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 19131) {
          return null;
        } else {
          var5 = param3.a(param0, 0);
          var6 = param3.a(param2, 7, var5);
          return dn.a(var6, var5, (byte) 124, param3, param4);
        }
    }

    final static void b(int param0) {
        an.field_c = false;
        if (null == tl.field_Fb) {
          if (param0 != vk.field_g) {
            ml.a(0);
            hf.field_g = 0;
            return;
          } else {
            hf.field_g = 0;
            return;
          }
        } else {
          tl.field_Fb.n(-116);
          if (param0 == vk.field_g) {
            hf.field_g = 0;
            return;
          } else {
            ml.a(0);
            hf.field_g = 0;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          rc.b(38);
          field_f = null;
          field_b = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> to move";
        field_e = "Login: ";
        field_d = false;
        field_c = "You have <%0> unread messages!";
        field_b = "Quit";
    }
}
