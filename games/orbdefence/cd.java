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
        field_r = null;
        field_q = null;
        field_w = null;
        field_t = null;
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
        RuntimeException var3 = null;
        Object var4 = null;
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
                var4 = null;
                int discarded$2 = cd.a((CharSequence) null, -84, 37);
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cd.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final byte[] f(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (!((cd) this).field_l) {
            if (-((cd) this).field_s + ((cd) this).field_u.field_j.length > ((cd) this).field_u.field_i) {
              throw new RuntimeException();
            } else {
              return ((cd) this).field_u.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          var3 = null;
          int discarded$6 = cd.a((CharSequence) null, 97, -111);
          if (!((cd) this).field_l) {
            if (-((cd) this).field_s + ((cd) this).field_u.field_j.length > ((cd) this).field_u.field_i) {
              throw new RuntimeException();
            } else {
              return ((cd) this).field_u.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final int e(int param0) {
        if (null == ((cd) this).field_u) {
          return 0;
        } else {
          if (param0 != 100) {
            return -78;
          } else {
            return 100 * ((cd) this).field_u.field_i / (((cd) this).field_u.field_j.length - ((cd) this).field_s);
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
        if (ji.field_b >= 0) {
          L0: {
            var3 = -135 + param0;
            var4 = param2 + -35;
            var5 = 256;
            if (ji.field_b >= 75) {
              break L0;
            } else {
              var5 = (ji.field_b << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (200 < ji.field_b) {
              var5 = (250 + -ji.field_b << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          de.a(-121, kf.field_a);
          wi.c();
          ul.d();
          bj.j(97);
          if (var5 >= 256) {
            oc.g((byte) -105);
            if (150 <= ji.field_b) {
              t.field_j.a(15 + var3, var4 - -10, var5);
              var6 = ji.field_b - 125;
              if (!param1) {
                L2: {
                  if (0 >= var6) {
                    break L2;
                  } else {
                    if (var6 >= 50) {
                      break L2;
                    } else {
                      if (20 <= var6) {
                        if (var6 >= 30) {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L2;
                        } else {
                          L3: {
                            jc.field_k.e(var3, var4, 256);
                            var6 = ji.field_b - 140;
                            if (var6 <= 0) {
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
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                              break L3;
                            }
                          }
                          return;
                        }
                      } else {
                        L5: {
                          var7 = 256 * var6 / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (var6 <= 0) {
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
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                            break L5;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L7: {
                  var6 = ji.field_b - 140;
                  if (var6 <= 0) {
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
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                    break L7;
                  }
                }
                return;
              } else {
                L9: {
                  field_w = null;
                  if (0 >= var6) {
                    break L9;
                  } else {
                    if (var6 >= 50) {
                      break L9;
                    } else {
                      if (20 <= var6) {
                        if (var6 >= 30) {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L9;
                        } else {
                          jc.field_k.e(var3, var4, 256);
                          break L9;
                        }
                      } else {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        break L9;
                      }
                    }
                  }
                }
                L10: {
                  var6 = ji.field_b - 140;
                  if (var6 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                    break L10;
                  }
                }
                return;
              }
            } else {
              kf.field_a.d(var3, var4);
              var6 = ji.field_b - 125;
              if (!param1) {
                L12: {
                  if (0 >= var6) {
                    break L12;
                  } else {
                    if (var6 >= 50) {
                      break L12;
                    } else {
                      if (20 <= var6) {
                        if (var6 >= 30) {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L12;
                        } else {
                          L13: {
                            jc.field_k.e(var3, var4, 256);
                            var6 = ji.field_b - 140;
                            if (var6 <= 0) {
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
                              fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                              break L13;
                            }
                          }
                          return;
                        }
                      } else {
                        L15: {
                          var7 = 256 * var6 / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (var6 <= 0) {
                            break L15;
                          } else {
                            L16: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L17: {
                  var6 = ji.field_b - 140;
                  if (var6 <= 0) {
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
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                    break L17;
                  }
                }
                return;
              } else {
                L19: {
                  field_w = null;
                  if (0 >= var6) {
                    break L19;
                  } else {
                    if (var6 >= 50) {
                      break L19;
                    } else {
                      if (20 <= var6) {
                        if (var6 >= 30) {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L19;
                        } else {
                          jc.field_k.e(var3, var4, 256);
                          break L19;
                        }
                      } else {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        break L19;
                      }
                    }
                  }
                }
                L20: {
                  var6 = ji.field_b - 140;
                  if (var6 <= 0) {
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
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              ul.d(0, 0, ul.field_f, ul.field_l, 0, 256 + -var5);
              oc.g((byte) -105);
              if (150 <= ji.field_b) {
                t.field_j.a(15 + var3, var4 - -10, var5);
                break L22;
              } else {
                kf.field_a.d(var3, var4);
                break L22;
              }
            }
            L23: {
              var6 = ji.field_b - 125;
              if (!param1) {
                break L23;
              } else {
                field_w = null;
                break L23;
              }
            }
            if (0 < var6) {
              if (var6 < 50) {
                L24: {
                  if (20 <= var6) {
                    if (var6 >= 30) {
                      var7 = (12800 - 256 * var6) / 20;
                      jc.field_k.e(var3, var4, var7);
                      break L24;
                    } else {
                      jc.field_k.e(var3, var4, 256);
                      break L24;
                    }
                  } else {
                    var7 = 256 * var6 / 20;
                    jc.field_k.e(var3, var4, var7);
                    break L24;
                  }
                }
                L25: {
                  var6 = ji.field_b - 140;
                  if (var6 <= 0) {
                    break L25;
                  } else {
                    L26: {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                    break L25;
                  }
                }
                return;
              } else {
                L27: {
                  var6 = ji.field_b - 140;
                  if (var6 <= 0) {
                    break L27;
                  } else {
                    L28: {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                    break L27;
                  }
                }
                return;
              }
            } else {
              L29: {
                var6 = ji.field_b - 140;
                if (var6 <= 0) {
                  break L29;
                } else {
                  L30: {
                    var7 = 256;
                    if (20 > var6) {
                      var7 = 256 * var6 / 20;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 8);
                  break L29;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    cd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "ATOMIC SHOT";
        field_x = "You have <%0> unread messages!";
        field_q = new int[8192];
    }
}
