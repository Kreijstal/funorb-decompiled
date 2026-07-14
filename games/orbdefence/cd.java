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
          field_q = null;
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
        Object var4 = null;
        if (param2 != -10) {
          var4 = null;
          int discarded$2 = cd.a((CharSequence) null, -84, 37);
          return af.a(true, param0, -126, param1);
        } else {
          return af.a(true, param0, -126, param1);
        }
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
        if (-1 >= ji.field_b) {
          L0: {
            var3 = -135 + param0;
            var4 = param2 + -35;
            var5 = 256;
            if (-76 <= ji.field_b) {
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
                  if (-51 < var6) {
                    if (20 <= var6) {
                      if (-31 < var6) {
                        L2: {
                          jc.field_k.e(var3, var4, 256);
                          var6 = ji.field_b - 140;
                          if (-1 >= var6) {
                            break L2;
                          } else {
                            L3: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L2;
                          }
                        }
                        return;
                      } else {
                        L4: {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          var6 = ji.field_b - 140;
                          if (-1 <= (var6 ^ -1)) {
                            break L4;
                          } else {
                            L5: {
                              var7 = 256;
                              if (20 > var6) {
                                var7 = 256 * var6 / 20;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      L6: {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        var6 = ji.field_b - 140;
                        if (-1 <= (var6 ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      var6 = ji.field_b - 140;
                      if (-1 >= var6) {
                        break L8;
                      } else {
                        L9: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                        break L8;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    var6 = ji.field_b - 140;
                    if (-1 <= (var6 ^ -1)) {
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
                      fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                L12: {
                  field_w = null;
                  if (0 >= var6) {
                    break L12;
                  } else {
                    if (-51 >= (var6 ^ -1)) {
                      break L12;
                    } else {
                      if (20 <= var6) {
                        if (-31 >= (var6 ^ -1)) {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L12;
                        } else {
                          jc.field_k.e(var3, var4, 256);
                          break L12;
                        }
                      } else {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        break L12;
                      }
                    }
                  }
                }
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
              kf.field_a.d(var3, var4);
              var6 = ji.field_b - 125;
              if (!param1) {
                if (0 < var6) {
                  if (-51 < var6) {
                    if (20 <= var6) {
                      if (-31 < var6) {
                        L15: {
                          jc.field_k.e(var3, var4, 256);
                          var6 = ji.field_b - 140;
                          if (-1 >= var6) {
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
                            fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                            break L15;
                          }
                        }
                        return;
                      } else {
                        L17: {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
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
                      L19: {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        var6 = ji.field_b - 140;
                        if (-1 <= (var6 ^ -1)) {
                          break L19;
                        } else {
                          L20: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                          break L19;
                        }
                      }
                      return;
                    }
                  } else {
                    L21: {
                      var6 = ji.field_b - 140;
                      if (-1 >= var6) {
                        break L21;
                      } else {
                        L22: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                        break L21;
                      }
                    }
                    return;
                  }
                } else {
                  L23: {
                    var6 = ji.field_b - 140;
                    if (-1 <= (var6 ^ -1)) {
                      break L23;
                    } else {
                      L24: {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      fd.field_a.a(var3 - -15, 10 + var4, var7 * var5 >> 1219318664);
                      break L23;
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  field_w = null;
                  if (0 >= var6) {
                    break L25;
                  } else {
                    if (-51 >= (var6 ^ -1)) {
                      break L25;
                    } else {
                      if (20 <= var6) {
                        if (-31 >= (var6 ^ -1)) {
                          var7 = (12800 - 256 * var6) / 20;
                          jc.field_k.e(var3, var4, var7);
                          break L25;
                        } else {
                          jc.field_k.e(var3, var4, 256);
                          break L25;
                        }
                      } else {
                        var7 = 256 * var6 / 20;
                        jc.field_k.e(var3, var4, var7);
                        break L25;
                      }
                    }
                  }
                }
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
              ul.d(0, 0, ul.field_f, ul.field_l, 0, 256 + -var5);
              oc.g((byte) -105);
              if (150 <= ji.field_b) {
                t.field_j.a(15 + var3, var4 - -10, var5);
                break L28;
              } else {
                kf.field_a.d(var3, var4);
                break L28;
              }
            }
            L29: {
              var6 = ji.field_b - 125;
              if (!param1) {
                break L29;
              } else {
                field_w = null;
                break L29;
              }
            }
            if (0 < var6) {
              if (-51 >= var6) {
                L30: {
                  var6 = ji.field_b - 140;
                  if (-1 >= var6) {
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
              } else {
                L32: {
                  if (20 <= var6) {
                    if (-31 >= (var6 ^ -1)) {
                      var7 = (12800 - 256 * var6) / 20;
                      jc.field_k.e(var3, var4, var7);
                      break L32;
                    } else {
                      jc.field_k.e(var3, var4, 256);
                      break L32;
                    }
                  } else {
                    var7 = 256 * var6 / 20;
                    jc.field_k.e(var3, var4, var7);
                    break L32;
                  }
                }
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
            } else {
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
