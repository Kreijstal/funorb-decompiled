/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends wj {
    byte field_s;
    static int[] field_q;
    static String field_r;
    static la field_w;
    static String field_x;
    static se field_t;
    int field_v;
    mg field_u;

    public static void d(byte param0) {
        field_x = null;
        if (param0 != 61) {
          field_q = (int[]) null;
          field_r = null;
          field_q = null;
          field_w = null;
          field_t = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          field_w = null;
          field_t = null;
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        if (param0 == -91) {
          if (param1 < 65) {
            if (param1 >= 97) {
              if (122 >= param1) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 90) {
              L0: {
                L1: {
                  if (param1 < 97) {
                    break L1;
                  } else {
                    if (122 < param1) {
                      break L1;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L0;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
              return stackIn_25_0 != 0;
            } else {
              stackOut_18_0 = 1;
              stackIn_20_0 = stackOut_18_0;
              return stackIn_20_0 != 0;
            }
          }
        } else {
          cd.a(7, true, -24);
          if (param1 >= 65) {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
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
            if (param1 >= 97) {
              if (122 < param1) {
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

    final static int a(CharSequence param0, int param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param2 == -10) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                discarded$2 = cd.a((CharSequence) null, -84, 37);
                break L1;
              }
            }
            stackOut_2_0 = af.a(true, param0, -126, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cd.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] f(int param0) {
        int discarded$6 = 0;
        CharSequence var3 = null;
        if (param0 == 0) {
          if (!this.field_l) {
            if (-this.field_s + this.field_u.field_j.length > this.field_u.field_i) {
              throw new RuntimeException();
            } else {
              return this.field_u.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          var3 = (CharSequence) null;
          discarded$6 = cd.a((CharSequence) null, 97, -111);
          if (!this.field_l) {
            if (-this.field_s + this.field_u.field_j.length > this.field_u.field_i) {
              throw new RuntimeException();
            } else {
              return this.field_u.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final int e(int param0) {
        if (null == this.field_u) {
          return 0;
        } else {
          if (param0 != 100) {
            return -78;
          } else {
            return 100 * this.field_u.field_i / (this.field_u.field_j.length - this.field_s);
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (-1 >= (ji.field_b ^ -1)) {
          L0: {
            var3 = -135 + param0;
            var4 = param2 + -35;
            var5 = 256;
            if (-76 >= (ji.field_b ^ -1)) {
              break L0;
            } else {
              var5 = (ji.field_b << -2009344504) / 75;
              break L0;
            }
          }
          L1: {
            if (200 < ji.field_b) {
              var5 = (250 + -ji.field_b << 41697224) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          de.a(-121, kf.field_a);
          wi.c();
          ul.d();
          bj.j(97);
          if (-257 >= (var5 ^ -1)) {
            oc.g((byte) -105);
            if (150 <= ji.field_b) {
              t.field_j.a(15 + var3, var4 - -10, var5);
              var6 = ji.field_b - 125;
              if (!param1) {
                if (0 < var6) {
                  if (-51 < (var6 ^ -1)) {
                    L2: {
                      if (20 <= var6) {
                        break L2;
                      } else {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        if (var8 != 0) {
                          break L2;
                        } else {
                          L3: {
                            var6 = ji.field_b - 140;
                            if (-1 <= (var6 ^ -1)) {
                              break L3;
                            } else {
                              L4: {
                                var7 = 256;
                                if (20 > var6) {
                                  var7 = 256 * var6 / 20;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                              break L3;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (-31 < (var6 ^ -1)) {
                      jc.field_k.e(var3, var4, 256);
                      if (var8 != 0) {
                        L5: {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L5;
                          } else {
                            L6: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L5;
                          }
                        }
                        return;
                      } else {
                        L7: {
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L7;
                          } else {
                            L8: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L9: {
                        var7 = (12800 - 256 * var6) / 20;
                        jc.field_k.e(var3, var4, var7);
                        var6 = ji.field_b - 140;
                        if (-1 <= (var6 ^ -1)) {
                          break L9;
                        } else {
                          L10: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L11: {
                      var6 = ji.field_b - 140;
                      if (-1 <= (var6 ^ -1)) {
                        break L11;
                      } else {
                        L12: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L13: {
                    var6 = ji.field_b - 140;
                    if (-1 <= (var6 ^ -1)) {
                      break L13;
                    } else {
                      L14: {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                      break L13;
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  field_w = (la) null;
                  if (0 >= var6) {
                    break L15;
                  } else {
                    if (-51 >= (var6 ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (20 <= var6) {
                          break L16;
                        } else {
                          var7 = 256 * var6 / 20;
                          jc.field_k.e(var3, var4, var7);
                          if (var8 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (-31 >= (var6 ^ -1)) {
                        var7 = (12800 - 256 * var6) / 20;
                        jc.field_k.e(var3, var4, var7);
                        break L15;
                      } else {
                        jc.field_k.e(var3, var4, 256);
                        if (var8 == 0) {
                          break L15;
                        } else {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L15;
                        }
                      }
                    }
                  }
                }
                L17: {
                  var6 = ji.field_b - 140;
                  if (-1 <= (var6 ^ -1)) {
                    break L17;
                  } else {
                    L18: {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                    break L17;
                  }
                }
                return;
              }
            } else {
              kf.field_a.d(var3, var4);
              if (var8 == 0) {
                var6 = ji.field_b - 125;
                if (!param1) {
                  if (0 < var6) {
                    if (-51 < (var6 ^ -1)) {
                      L19: {
                        if (20 <= var6) {
                          break L19;
                        } else {
                          var7 = 256 * var6 / 20;
                          jc.field_k.e(var3, var4, var7);
                          if (var8 != 0) {
                            break L19;
                          } else {
                            L20: {
                              var6 = ji.field_b - 140;
                              if (-1 <= (var6 ^ -1)) {
                                break L20;
                              } else {
                                L21: {
                                  var7 = 256;
                                  if (20 > var6) {
                                    var7 = 256 * var6 / 20;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                                break L20;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (-31 >= (var6 ^ -1)) {
                        L22: {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L22;
                          } else {
                            L23: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L22;
                          }
                        }
                        return;
                      } else {
                        jc.field_k.e(var3, var4, 256);
                        if (var8 != 0) {
                          L24: {
                            var7 = (12800 - 256 * var6) / 20;
                            jc.field_k.e(var3, var4, var7);
                            var6 = ji.field_b - 140;
                            if (-1 <= (var6 ^ -1)) {
                              break L24;
                            } else {
                              L25: {
                                var7 = 256;
                                if (20 > var6) {
                                  var7 = 256 * var6 / 20;
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                              break L24;
                            }
                          }
                          return;
                        } else {
                          L26: {
                            var6 = ji.field_b - 140;
                            if (-1 <= (var6 ^ -1)) {
                              break L26;
                            } else {
                              L27: {
                                var7 = 256;
                                if (20 > var6) {
                                  var7 = 256 * var6 / 20;
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                              break L26;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L28: {
                        var6 = ji.field_b - 140;
                        if (-1 <= (var6 ^ -1)) {
                          break L28;
                        } else {
                          L29: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                          break L28;
                        }
                      }
                      return;
                    }
                  } else {
                    L30: {
                      var6 = ji.field_b - 140;
                      if (-1 <= (var6 ^ -1)) {
                        break L30;
                      } else {
                        L31: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                        break L30;
                      }
                    }
                    return;
                  }
                } else {
                  field_w = (la) null;
                  if (0 < var6) {
                    if (-51 < (var6 ^ -1)) {
                      L32: {
                        if (20 <= var6) {
                          break L32;
                        } else {
                          var7 = 256 * var6 / 20;
                          jc.field_k.e(var3, var4, var7);
                          if (var8 != 0) {
                            break L32;
                          } else {
                            L33: {
                              var6 = ji.field_b - 140;
                              if (-1 <= (var6 ^ -1)) {
                                break L33;
                              } else {
                                L34: {
                                  var7 = 256;
                                  if (20 > var6) {
                                    var7 = 256 * var6 / 20;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                                break L33;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (-31 < (var6 ^ -1)) {
                        jc.field_k.e(var3, var4, 256);
                        if (var8 == 0) {
                          L35: {
                            var6 = ji.field_b - 140;
                            if (-1 <= (var6 ^ -1)) {
                              break L35;
                            } else {
                              L36: {
                                var7 = 256;
                                if (20 > var6) {
                                  var7 = 256 * var6 / 20;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                              break L35;
                            }
                          }
                          return;
                        } else {
                          L37: {
                            var7 = (12800 - 256 * var6) / 20;
                            jc.field_k.e(var3, var4, var7);
                            var6 = ji.field_b - 140;
                            if (-1 <= (var6 ^ -1)) {
                              break L37;
                            } else {
                              L38: {
                                var7 = 256;
                                if (20 > var6) {
                                  var7 = 256 * var6 / 20;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                              break L37;
                            }
                          }
                          return;
                        }
                      } else {
                        L39: {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L39;
                          } else {
                            L40: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L39;
                          }
                        }
                        return;
                      }
                    } else {
                      L41: {
                        var6 = ji.field_b - 140;
                        if (-1 <= (var6 ^ -1)) {
                          break L41;
                        } else {
                          L42: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                          fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                          break L41;
                        }
                      }
                      return;
                    }
                  } else {
                    L43: {
                      var6 = ji.field_b - 140;
                      if (-1 <= (var6 ^ -1)) {
                        break L43;
                      } else {
                        L44: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                        break L43;
                      }
                    }
                    return;
                  }
                }
              } else {
                L45: {
                  t.field_j.a(15 + var3, var4 - -10, var5);
                  var6 = ji.field_b - 125;
                  if (!param1) {
                    break L45;
                  } else {
                    field_w = (la) null;
                    break L45;
                  }
                }
                if (0 < var6) {
                  if (-51 < (var6 ^ -1)) {
                    L46: {
                      if (20 <= var6) {
                        break L46;
                      } else {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        if (var8 != 0) {
                          break L46;
                        } else {
                          L47: {
                            var6 = ji.field_b - 140;
                            if (-1 <= (var6 ^ -1)) {
                              break L47;
                            } else {
                              L48: {
                                var7 = 256;
                                if (20 > var6) {
                                  var7 = 256 * var6 / 20;
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                              break L47;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (-31 >= (var6 ^ -1)) {
                      var7 = (12800 - 256 * var6) / 20;
                      jc.field_k.e(var3, var4, var7);
                      L49: {
                        var6 = ji.field_b - 140;
                        if (-1 <= (var6 ^ -1)) {
                          break L49;
                        } else {
                          L50: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                          break L49;
                        }
                      }
                      return;
                    } else {
                      jc.field_k.e(var3, var4, 256);
                      if (var8 != 0) {
                        L51: {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L51;
                          } else {
                            L52: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L51;
                          }
                        }
                        return;
                      } else {
                        L53: {
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L53;
                          } else {
                            L54: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L53;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L55: {
                      var6 = ji.field_b - 140;
                      if (-1 <= (var6 ^ -1)) {
                        break L55;
                      } else {
                        L56: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                        break L55;
                      }
                    }
                    return;
                  }
                } else {
                  L57: {
                    var6 = ji.field_b - 140;
                    if (-1 <= (var6 ^ -1)) {
                      break L57;
                    } else {
                      L58: {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                      fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                      break L57;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L59: {
              L60: {
                ul.d(0, 0, ul.field_f, ul.field_l, 0, 256 + -var5);
                oc.g((byte) -105);
                if (150 <= ji.field_b) {
                  break L60;
                } else {
                  kf.field_a.d(var3, var4);
                  if (var8 == 0) {
                    break L59;
                  } else {
                    break L60;
                  }
                }
              }
              t.field_j.a(15 + var3, var4 - -10, var5);
              break L59;
            }
            L61: {
              var6 = ji.field_b - 125;
              if (!param1) {
                break L61;
              } else {
                field_w = (la) null;
                break L61;
              }
            }
            L62: {
              if (0 >= var6) {
                break L62;
              } else {
                if (-51 >= (var6 ^ -1)) {
                  break L62;
                } else {
                  L63: {
                    if (20 <= var6) {
                      break L63;
                    } else {
                      var7 = 256 * var6 / 20;
                      jc.field_k.e(var3, var4, var7);
                      if (var8 == 0) {
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  if (-31 >= (var6 ^ -1)) {
                    var7 = (12800 - 256 * var6) / 20;
                    jc.field_k.e(var3, var4, var7);
                    break L62;
                  } else {
                    jc.field_k.e(var3, var4, 256);
                    if (var8 == 0) {
                      break L62;
                    } else {
                      var7 = (12800 - 256 * var6) / 20;
                      jc.field_k.e(var3, var4, var7);
                      break L62;
                    }
                  }
                }
              }
            }
            L64: {
              var6 = ji.field_b - 140;
              if (-1 <= (var6 ^ -1)) {
                break L64;
              } else {
                L65: {
                  var7 = 256;
                  if (20 > var6) {
                    var7 = 256 * var6 / 20;
                    break L65;
                  } else {
                    break L65;
                  }
                }
                fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                break L64;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    cd() {
    }

    static {
        field_r = "ATOMIC SHOT";
        field_x = "You have <%0> unread messages!";
        field_q = new int[8192];
    }
}
