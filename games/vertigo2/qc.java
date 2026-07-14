/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends gp {
    static r field_B;
    static db field_v;
    static int field_A;
    int field_C;
    static String field_y;
    static String field_u;
    static int field_z;
    static int field_t;
    static byte[] field_w;
    static cc field_x;

    abstract Object a(byte param0);

    public static void h(int param0) {
        field_y = null;
        field_u = null;
        field_x = null;
        field_B = null;
        if (param0 != 0) {
          qc.h(126);
          field_v = null;
          field_w = null;
          return;
        } else {
          field_v = null;
          field_w = null;
          return;
        }
    }

    final static bk a(int param0, String param1) {
        if (param0 != 0) {
            field_t = -26;
            return new bk(param1);
        }
        return new bk(param1);
    }

    abstract boolean i(int param0);

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_138_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          qf.field_b = qf.field_b + 1;
          if (0 != (ek.field_E ^ -1)) {
            break L0;
          } else {
            if ((or.field_c ^ -1) == 0) {
              ek.field_E = ed.field_n;
              or.field_c = gb.field_d;
              break L0;
            } else {
              if (param0 != null) {
                if (param0.equals((Object) (Object) as.field_a)) {
                  L1: {
                    as.field_a = param0;
                    if (gl.field_o) {
                      break L1;
                    } else {
                      if (qf.field_b >= aj.field_h) {
                        break L1;
                      } else {
                        if (wo.field_s) {
                          hn.field_n = ek.field_E;
                          qf.field_b = 0;
                          rl.field_db = or.field_c;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if (!gl.field_o) {
                      break L2;
                    } else {
                      if (qf.field_b == td.field_g) {
                        gl.field_o = false;
                        qf.field_b = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                } else {
                  L3: {
                    if (!gl.field_o) {
                      if (qf.field_b >= aj.field_h) {
                        if (aj.field_h + ea.field_g > qf.field_b) {
                          stackOut_55_0 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          break L3;
                        } else {
                          stackOut_54_0 = 0;
                          stackIn_57_0 = stackOut_54_0;
                          break L3;
                        }
                      } else {
                        stackOut_52_0 = 0;
                        stackIn_57_0 = stackOut_52_0;
                        break L3;
                      }
                    } else {
                      stackOut_50_0 = 0;
                      stackIn_57_0 = stackOut_50_0;
                      break L3;
                    }
                  }
                  L4: {
                    var2 = stackIn_57_0;
                    if (param0 == null) {
                      qf.field_b = 0;
                      break L4;
                    } else {
                      if (!gl.field_o) {
                        if (var2 == 0) {
                          qf.field_b = 0;
                          break L4;
                        } else {
                          qf.field_b = aj.field_h;
                          break L4;
                        }
                      } else {
                        qf.field_b = aj.field_h;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (param0 == null) {
                        if (var2 == 0) {
                          break L6;
                        } else {
                          gl.field_o = true;
                          hn.field_n = ek.field_E;
                          rl.field_db = or.field_c;
                          break L5;
                        }
                      } else {
                        gl.field_o = false;
                        break L6;
                      }
                    }
                    hn.field_n = ek.field_E;
                    rl.field_db = or.field_c;
                    break L5;
                  }
                  L7: {
                    as.field_a = param0;
                    if (gl.field_o) {
                      break L7;
                    } else {
                      if (qf.field_b >= aj.field_h) {
                        break L7;
                      } else {
                        if (wo.field_s) {
                          hn.field_n = ek.field_E;
                          qf.field_b = 0;
                          rl.field_db = or.field_c;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    if (!gl.field_o) {
                      break L8;
                    } else {
                      if (qf.field_b == td.field_g) {
                        gl.field_o = false;
                        qf.field_b = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                }
              } else {
                if (null != as.field_a) {
                  L9: {
                    as.field_a = param0;
                    if (gl.field_o) {
                      break L9;
                    } else {
                      if (qf.field_b >= aj.field_h) {
                        break L9;
                      } else {
                        if (wo.field_s) {
                          hn.field_n = ek.field_E;
                          qf.field_b = 0;
                          rl.field_db = or.field_c;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    if (!gl.field_o) {
                      break L10;
                    } else {
                      if (qf.field_b == td.field_g) {
                        gl.field_o = false;
                        qf.field_b = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                } else {
                  L11: {
                    if (!gl.field_o) {
                      if (qf.field_b >= aj.field_h) {
                        if (aj.field_h + ea.field_g > qf.field_b) {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L11;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_12_0 = stackOut_9_0;
                          break L11;
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_12_0 = stackOut_7_0;
                        break L11;
                      }
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_12_0 = stackOut_5_0;
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      var2 = stackIn_12_0;
                      if (param0 == null) {
                        break L13;
                      } else {
                        if (!gl.field_o) {
                          if (var2 == 0) {
                            break L13;
                          } else {
                            qf.field_b = aj.field_h;
                            break L12;
                          }
                        } else {
                          qf.field_b = aj.field_h;
                          break L12;
                        }
                      }
                    }
                    qf.field_b = 0;
                    break L12;
                  }
                  L14: {
                    L15: {
                      if (param0 == null) {
                        if (var2 == 0) {
                          break L15;
                        } else {
                          gl.field_o = true;
                          hn.field_n = ek.field_E;
                          rl.field_db = or.field_c;
                          break L14;
                        }
                      } else {
                        gl.field_o = false;
                        break L15;
                      }
                    }
                    hn.field_n = ek.field_E;
                    rl.field_db = or.field_c;
                    break L14;
                  }
                  L16: {
                    as.field_a = param0;
                    if (gl.field_o) {
                      break L16;
                    } else {
                      if (qf.field_b >= aj.field_h) {
                        break L16;
                      } else {
                        if (wo.field_s) {
                          hn.field_n = ek.field_E;
                          qf.field_b = 0;
                          rl.field_db = or.field_c;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (!gl.field_o) {
                      break L17;
                    } else {
                      if (qf.field_b == td.field_g) {
                        gl.field_o = false;
                        qf.field_b = 0;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                }
              }
            }
          }
        }
        L18: {
          if (param0 != null) {
            if (!param0.equals((Object) (Object) as.field_a)) {
              break L18;
            } else {
              L19: {
                as.field_a = param0;
                if (gl.field_o) {
                  break L19;
                } else {
                  if (qf.field_b >= aj.field_h) {
                    break L19;
                  } else {
                    if (wo.field_s) {
                      hn.field_n = ek.field_E;
                      qf.field_b = 0;
                      rl.field_db = or.field_c;
                      break L19;
                    } else {
                      if (gl.field_o) {
                        if (qf.field_b != td.field_g) {
                          or.field_c = -1;
                          var2 = -102 % ((-47 - param1) / 38);
                          ek.field_E = -1;
                          return;
                        } else {
                          gl.field_o = false;
                          qf.field_b = 0;
                          or.field_c = -1;
                          var2 = -102 % ((-47 - param1) / 38);
                          ek.field_E = -1;
                          return;
                        }
                      } else {
                        or.field_c = -1;
                        var2 = -102 % ((-47 - param1) / 38);
                        ek.field_E = -1;
                        return;
                      }
                    }
                  }
                }
              }
              if (gl.field_o) {
                if (qf.field_b == td.field_g) {
                  gl.field_o = false;
                  qf.field_b = 0;
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                } else {
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                }
              } else {
                or.field_c = -1;
                var2 = -102 % ((-47 - param1) / 38);
                ek.field_E = -1;
                return;
              }
            }
          } else {
            if (null == as.field_a) {
              break L18;
            } else {
              L20: {
                as.field_a = param0;
                if (gl.field_o) {
                  break L20;
                } else {
                  if (qf.field_b >= aj.field_h) {
                    break L20;
                  } else {
                    if (wo.field_s) {
                      hn.field_n = ek.field_E;
                      qf.field_b = 0;
                      rl.field_db = or.field_c;
                      break L20;
                    } else {
                      if (gl.field_o) {
                        if (qf.field_b != td.field_g) {
                          or.field_c = -1;
                          var2 = -102 % ((-47 - param1) / 38);
                          ek.field_E = -1;
                          return;
                        } else {
                          gl.field_o = false;
                          qf.field_b = 0;
                          or.field_c = -1;
                          var2 = -102 % ((-47 - param1) / 38);
                          ek.field_E = -1;
                          return;
                        }
                      } else {
                        or.field_c = -1;
                        var2 = -102 % ((-47 - param1) / 38);
                        ek.field_E = -1;
                        return;
                      }
                    }
                  }
                }
              }
              if (gl.field_o) {
                if (qf.field_b != td.field_g) {
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                } else {
                  gl.field_o = false;
                  qf.field_b = 0;
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                }
              } else {
                or.field_c = -1;
                var2 = -102 % ((-47 - param1) / 38);
                ek.field_E = -1;
                return;
              }
            }
          }
        }
        L21: {
          if (!gl.field_o) {
            if (qf.field_b >= aj.field_h) {
              if (aj.field_h + ea.field_g > qf.field_b) {
                stackOut_136_0 = 1;
                stackIn_138_0 = stackOut_136_0;
                break L21;
              } else {
                stackOut_135_0 = 0;
                stackIn_138_0 = stackOut_135_0;
                break L21;
              }
            } else {
              stackOut_133_0 = 0;
              stackIn_138_0 = stackOut_133_0;
              break L21;
            }
          } else {
            stackOut_131_0 = 0;
            stackIn_138_0 = stackOut_131_0;
            break L21;
          }
        }
        L22: {
          var2 = stackIn_138_0;
          if (param0 == null) {
            qf.field_b = 0;
            break L22;
          } else {
            if (gl.field_o) {
              qf.field_b = aj.field_h;
              break L22;
            } else {
              if (var2 != 0) {
                L23: {
                  L24: {
                    qf.field_b = aj.field_h;
                    if (param0 == null) {
                      if (var2 == 0) {
                        break L24;
                      } else {
                        gl.field_o = true;
                        hn.field_n = ek.field_E;
                        rl.field_db = or.field_c;
                        break L23;
                      }
                    } else {
                      gl.field_o = false;
                      break L24;
                    }
                  }
                  hn.field_n = ek.field_E;
                  rl.field_db = or.field_c;
                  break L23;
                }
                L25: {
                  as.field_a = param0;
                  if (gl.field_o) {
                    break L25;
                  } else {
                    if (qf.field_b >= aj.field_h) {
                      break L25;
                    } else {
                      if (wo.field_s) {
                        hn.field_n = ek.field_E;
                        qf.field_b = 0;
                        rl.field_db = or.field_c;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                L26: {
                  if (!gl.field_o) {
                    break L26;
                  } else {
                    if (qf.field_b == td.field_g) {
                      gl.field_o = false;
                      qf.field_b = 0;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                or.field_c = -1;
                var2 = -102 % ((-47 - param1) / 38);
                ek.field_E = -1;
                return;
              } else {
                qf.field_b = 0;
                break L22;
              }
            }
          }
        }
        if (param0 == null) {
          if (var2 == 0) {
            L27: {
              hn.field_n = ek.field_E;
              rl.field_db = or.field_c;
              as.field_a = param0;
              if (gl.field_o) {
                break L27;
              } else {
                if (qf.field_b >= aj.field_h) {
                  break L27;
                } else {
                  if (wo.field_s) {
                    hn.field_n = ek.field_E;
                    qf.field_b = 0;
                    rl.field_db = or.field_c;
                    break L27;
                  } else {
                    L28: {
                      if (!gl.field_o) {
                        break L28;
                      } else {
                        if (qf.field_b == td.field_g) {
                          gl.field_o = false;
                          qf.field_b = 0;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                    or.field_c = -1;
                    var2 = -102 % ((-47 - param1) / 38);
                    ek.field_E = -1;
                    return;
                  }
                }
              }
            }
            if (gl.field_o) {
              if (qf.field_b == td.field_g) {
                gl.field_o = false;
                qf.field_b = 0;
                or.field_c = -1;
                var2 = -102 % ((-47 - param1) / 38);
                ek.field_E = -1;
                return;
              } else {
                or.field_c = -1;
                var2 = -102 % ((-47 - param1) / 38);
                ek.field_E = -1;
                return;
              }
            } else {
              or.field_c = -1;
              var2 = -102 % ((-47 - param1) / 38);
              ek.field_E = -1;
              return;
            }
          } else {
            gl.field_o = true;
            L29: {
              hn.field_n = ek.field_E;
              rl.field_db = or.field_c;
              as.field_a = param0;
              if (gl.field_o) {
                break L29;
              } else {
                if (qf.field_b >= aj.field_h) {
                  break L29;
                } else {
                  if (wo.field_s) {
                    hn.field_n = ek.field_E;
                    qf.field_b = 0;
                    rl.field_db = or.field_c;
                    break L29;
                  } else {
                    L30: {
                      if (!gl.field_o) {
                        break L30;
                      } else {
                        if (qf.field_b == td.field_g) {
                          gl.field_o = false;
                          qf.field_b = 0;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                    or.field_c = -1;
                    var2 = -102 % ((-47 - param1) / 38);
                    ek.field_E = -1;
                    return;
                  }
                }
              }
            }
            L31: {
              if (!gl.field_o) {
                break L31;
              } else {
                if (qf.field_b == td.field_g) {
                  gl.field_o = false;
                  qf.field_b = 0;
                  break L31;
                } else {
                  or.field_c = -1;
                  var2 = -102 % ((-47 - param1) / 38);
                  ek.field_E = -1;
                  return;
                }
              }
            }
            or.field_c = -1;
            var2 = -102 % ((-47 - param1) / 38);
            ek.field_E = -1;
            return;
          }
        } else {
          gl.field_o = false;
          L32: {
            hn.field_n = ek.field_E;
            rl.field_db = or.field_c;
            as.field_a = param0;
            if (gl.field_o) {
              break L32;
            } else {
              if (qf.field_b >= aj.field_h) {
                break L32;
              } else {
                if (wo.field_s) {
                  hn.field_n = ek.field_E;
                  qf.field_b = 0;
                  rl.field_db = or.field_c;
                  break L32;
                } else {
                  break L32;
                }
              }
            }
          }
          if (gl.field_o) {
            if (qf.field_b != td.field_g) {
              or.field_c = -1;
              var2 = -102 % ((-47 - param1) / 38);
              ek.field_E = -1;
              return;
            } else {
              gl.field_o = false;
              qf.field_b = 0;
              or.field_c = -1;
              var2 = -102 % ((-47 - param1) / 38);
              ek.field_E = -1;
              return;
            }
          } else {
            or.field_c = -1;
            var2 = -102 % ((-47 - param1) / 38);
            ek.field_E = -1;
            return;
          }
        }
    }

    qc(int param0) {
        ((qc) this).field_C = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "This option cannot be combined with the current settings for:  ";
        field_y = "Enter name of player to delete from list";
    }
}
