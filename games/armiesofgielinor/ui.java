/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_g;
    static String field_e;
    static String field_k;
    static int field_c;
    static char field_i;
    static String field_h;
    private ms field_d;
    static int field_f;
    static boolean field_b;
    static String field_a;
    private ms field_j;

    final ms c(int param0) {
        ms var2 = null;
        var2 = ((ui) this).field_j;
        if (var2 == ((ui) this).field_d) {
          ((ui) this).field_j = null;
          return null;
        } else {
          ((ui) this).field_j = var2.field_s;
          if (param0 != 24) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final static ca a(bv param0, int param1, int param2) {
        ca var3 = null;
        int var4 = 0;
        if (0 == param1) {
          return null;
        } else {
          var3 = new ca();
          no.a(param0, (uo) (Object) var3, param1, -24721);
          var4 = -10 % ((param2 - -23) / 54);
          return var3;
        }
    }

    final ms b(int param0) {
        ms var2 = null;
        var2 = ((ui) this).field_d.field_s;
        if (param0 == 11) {
          if (((ui) this).field_d == var2) {
            return null;
          } else {
            var2.c((byte) -76);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_e = null;
        field_a = null;
        if (param0 <= 93) {
            return;
        }
        field_k = null;
        field_h = null;
    }

    final int a(int param0) {
        int var2 = 0;
        ms var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        if (param0 != 30578) {
          field_k = null;
          var3 = ((ui) this).field_d.field_s;
          L0: while (true) {
            if (((ui) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_s;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((ui) this).field_d.field_s;
          L1: while (true) {
            if (((ui) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_s;
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(ms param0, boolean param1) {
        if (null == param0.field_l) {
          param0.field_s = ((ui) this).field_d;
          if (param1) {
            field_i = '￠';
            param0.field_l = ((ui) this).field_d.field_l;
            param0.field_l.field_s = param0;
            param0.field_s.field_l = param0;
            return;
          } else {
            param0.field_l = ((ui) this).field_d.field_l;
            param0.field_l.field_s = param0;
            param0.field_s.field_l = param0;
            return;
          }
        } else {
          param0.c((byte) -76);
          param0.field_s = ((ui) this).field_d;
          if (!param1) {
            param0.field_l = ((ui) this).field_d.field_l;
            param0.field_l.field_s = param0;
            param0.field_s.field_l = param0;
            return;
          } else {
            field_i = '￠';
            param0.field_l = ((ui) this).field_d.field_l;
            param0.field_l.field_s = param0;
            param0.field_s.field_l = param0;
            return;
          }
        }
    }

    final ms a(byte param0) {
        ms var2 = null;
        int var3 = 0;
        var2 = ((ui) this).field_d.field_s;
        var3 = 125 / ((param0 - -44) / 59);
        if (var2 == ((ui) this).field_d) {
          ((ui) this).field_j = null;
          return null;
        } else {
          ((ui) this).field_j = var2.field_s;
          return var2;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_154_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_44_0 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (11 != sr.a(param3, -1 + param0, 11, (byte) -122)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (11 != sr.a(param3, param0 - -1, 11, (byte) -115)) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (11 != sr.a(param3 - -1, param0, 11, (byte) -104)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (-12 != (sr.a(param3 + -1, param0, 11, (byte) -94) ^ -1)) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var8 = stackIn_12_0;
          var10 = -98 % ((11 - param2) / 40);
          var9 = 0;
          if (var5 != 0) {
            var9++;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var6 != 0) {
            var9++;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var7 != 0) {
            var9++;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (var8 != 0) {
            var9++;
            break L7;
          } else {
            break L7;
          }
        }
        param4 -= 44;
        if (1 < var9) {
          if (var5 == 0) {
            if (var5 == 0) {
              if (var6 == 0) {
                L8: {
                  if (var6 == 0) {
                    break L8;
                  } else {
                    if (var8 == 0) {
                      break L8;
                    } else {
                      L9: {
                        var11 = 1;
                        if (var11 != 0) {
                          L10: {
                            if (var7 == 0) {
                              break L10;
                            } else {
                              l.field_b[30].a(param1, param4);
                              break L10;
                            }
                          }
                          L11: {
                            if (var5 == 0) {
                              break L11;
                            } else {
                              l.field_b[29].a(param1, param4);
                              break L11;
                            }
                          }
                          l.field_b[24].a(param1, param4);
                          l.field_b[27].a(param1, param4);
                          if (var8 == 0) {
                            break L9;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L9;
                          }
                        } else {
                          L12: {
                            if (var7 == 0) {
                              break L12;
                            } else {
                              if (var8 != 0) {
                                l.field_b[26].a(param1, param4);
                                break L9;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (var5 == 0) {
                            break L9;
                          } else {
                            l.field_b[25].a(param1, param4);
                            break L9;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                var11 = 0;
                if (var11 != 0) {
                  if (var7 == 0) {
                    if (var5 == 0) {
                      l.field_b[24].a(param1, param4);
                      l.field_b[27].a(param1, param4);
                      if (var8 == 0) {
                        return;
                      } else {
                        l.field_b[28].a(param1, param4);
                        return;
                      }
                    } else {
                      l.field_b[29].a(param1, param4);
                      l.field_b[24].a(param1, param4);
                      l.field_b[27].a(param1, param4);
                      if (var8 == 0) {
                        return;
                      } else {
                        l.field_b[28].a(param1, param4);
                        return;
                      }
                    }
                  } else {
                    l.field_b[30].a(param1, param4);
                    l.field_b[29].a(param1, param4);
                    l.field_b[24].a(param1, param4);
                    l.field_b[27].a(param1, param4);
                    L13: {
                      if (var8 == 0) {
                        break L13;
                      } else {
                        l.field_b[28].a(param1, param4);
                        break L13;
                      }
                    }
                    return;
                  }
                } else {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      if (var8 != 0) {
                        l.field_b[26].a(param1, param4);
                        return;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 0) {
                      break L15;
                    } else {
                      if (var6 == 0) {
                        break L15;
                      } else {
                        l.field_b[25].a(param1, param4);
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (var7 != 0) {
                  var11 = 1;
                  if (var11 != 0) {
                    if (var7 == 0) {
                      if (var5 == 0) {
                        l.field_b[24].a(param1, param4);
                        l.field_b[27].a(param1, param4);
                        if (var8 != 0) {
                          l.field_b[28].a(param1, param4);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L16: {
                          l.field_b[29].a(param1, param4);
                          l.field_b[24].a(param1, param4);
                          l.field_b[27].a(param1, param4);
                          if (var8 == 0) {
                            break L16;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L16;
                          }
                        }
                        return;
                      }
                    } else {
                      l.field_b[30].a(param1, param4);
                      l.field_b[29].a(param1, param4);
                      l.field_b[24].a(param1, param4);
                      l.field_b[27].a(param1, param4);
                      L17: {
                        if (var8 == 0) {
                          break L17;
                        } else {
                          l.field_b[28].a(param1, param4);
                          break L17;
                        }
                      }
                      return;
                    }
                  } else {
                    if (var8 == 0) {
                      if (var5 == 0) {
                        return;
                      } else {
                        l.field_b[25].a(param1, param4);
                        return;
                      }
                    } else {
                      l.field_b[26].a(param1, param4);
                      return;
                    }
                  }
                } else {
                  L18: {
                    if (var6 != 0) {
                      if (var8 == 0) {
                        stackOut_153_0 = 0;
                        stackIn_154_0 = stackOut_153_0;
                        break L18;
                      } else {
                        stackOut_152_0 = 1;
                        stackIn_154_0 = stackOut_152_0;
                        break L18;
                      }
                    } else {
                      stackOut_150_0 = 0;
                      stackIn_154_0 = stackOut_150_0;
                      break L18;
                    }
                  }
                  L19: {
                    var11 = stackIn_154_0;
                    if (var11 != 0) {
                      L20: {
                        if (var7 == 0) {
                          break L20;
                        } else {
                          l.field_b[30].a(param1, param4);
                          break L20;
                        }
                      }
                      L21: {
                        if (var5 == 0) {
                          break L21;
                        } else {
                          l.field_b[29].a(param1, param4);
                          break L21;
                        }
                      }
                      l.field_b[24].a(param1, param4);
                      l.field_b[27].a(param1, param4);
                      if (var8 == 0) {
                        break L19;
                      } else {
                        l.field_b[28].a(param1, param4);
                        break L19;
                      }
                    } else {
                      L22: {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          if (var8 != 0) {
                            l.field_b[26].a(param1, param4);
                            break L19;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L19;
                      } else {
                        l.field_b[25].a(param1, param4);
                        break L19;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (var8 != 0) {
                var11 = 1;
                if (var11 != 0) {
                  if (var7 == 0) {
                    if (var5 == 0) {
                      l.field_b[24].a(param1, param4);
                      l.field_b[27].a(param1, param4);
                      if (var8 == 0) {
                        return;
                      } else {
                        l.field_b[28].a(param1, param4);
                        return;
                      }
                    } else {
                      l.field_b[29].a(param1, param4);
                      l.field_b[24].a(param1, param4);
                      l.field_b[27].a(param1, param4);
                      l.field_b[28].a(param1, param4);
                      return;
                    }
                  } else {
                    l.field_b[30].a(param1, param4);
                    l.field_b[29].a(param1, param4);
                    l.field_b[24].a(param1, param4);
                    l.field_b[27].a(param1, param4);
                    L23: {
                      if (var8 == 0) {
                        break L23;
                      } else {
                        l.field_b[28].a(param1, param4);
                        break L23;
                      }
                    }
                    return;
                  }
                } else {
                  L24: {
                    if (var7 == 0) {
                      break L24;
                    } else {
                      if (var8 == 0) {
                        break L24;
                      } else {
                        l.field_b[26].a(param1, param4);
                        return;
                      }
                    }
                  }
                  if (var5 != 0) {
                    if (var6 != 0) {
                      l.field_b[25].a(param1, param4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L25: {
                  L26: {
                    if (var6 == 0) {
                      break L26;
                    } else {
                      if (var7 != 0) {
                        stackOut_105_0 = 1;
                        stackIn_107_0 = stackOut_105_0;
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (var6 != 0) {
                    if (var8 != 0) {
                      stackOut_104_0 = 1;
                      stackIn_107_0 = stackOut_104_0;
                      break L25;
                    } else {
                      stackOut_103_0 = 0;
                      stackIn_107_0 = stackOut_103_0;
                      break L25;
                    }
                  } else {
                    stackOut_101_0 = 0;
                    stackIn_107_0 = stackOut_101_0;
                    break L25;
                  }
                }
                L27: {
                  var11 = stackIn_107_0;
                  if (var11 != 0) {
                    L28: {
                      if (var7 == 0) {
                        break L28;
                      } else {
                        l.field_b[30].a(param1, param4);
                        break L28;
                      }
                    }
                    L29: {
                      if (var5 == 0) {
                        break L29;
                      } else {
                        l.field_b[29].a(param1, param4);
                        break L29;
                      }
                    }
                    l.field_b[24].a(param1, param4);
                    l.field_b[27].a(param1, param4);
                    if (var8 == 0) {
                      break L27;
                    } else {
                      l.field_b[28].a(param1, param4);
                      break L27;
                    }
                  } else {
                    L30: {
                      if (var7 == 0) {
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    if (var5 == 0) {
                      break L27;
                    } else {
                      if (var6 == 0) {
                        break L27;
                      } else {
                        l.field_b[25].a(param1, param4);
                        break L27;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (var7 != 0) {
              var11 = 1;
              if (var11 == 0) {
                if (var8 == 0) {
                  if (var5 != 0) {
                    if (var6 == 0) {
                      return;
                    } else {
                      l.field_b[25].a(param1, param4);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  l.field_b[26].a(param1, param4);
                  return;
                }
              } else {
                L31: {
                  if (var7 == 0) {
                    break L31;
                  } else {
                    l.field_b[30].a(param1, param4);
                    break L31;
                  }
                }
                L32: {
                  if (var5 == 0) {
                    break L32;
                  } else {
                    l.field_b[29].a(param1, param4);
                    break L32;
                  }
                }
                L33: {
                  l.field_b[24].a(param1, param4);
                  if (var6 == 0) {
                    break L33;
                  } else {
                    l.field_b[27].a(param1, param4);
                    break L33;
                  }
                }
                L34: {
                  if (var8 == 0) {
                    break L34;
                  } else {
                    l.field_b[28].a(param1, param4);
                    break L34;
                  }
                }
                return;
              }
            } else {
              L35: {
                if (var8 == 0) {
                  L36: {
                    if (var6 == 0) {
                      break L36;
                    } else {
                      if (var7 == 0) {
                        break L36;
                      } else {
                        stackOut_48_0 = 1;
                        stackIn_56_0 = stackOut_48_0;
                        break L35;
                      }
                    }
                  }
                  if (var6 != 0) {
                    if (var8 != 0) {
                      stackOut_54_0 = 1;
                      stackIn_56_0 = stackOut_54_0;
                      break L35;
                    } else {
                      stackOut_53_0 = 0;
                      stackIn_56_0 = stackOut_53_0;
                      break L35;
                    }
                  } else {
                    stackOut_51_0 = 0;
                    stackIn_56_0 = stackOut_51_0;
                    break L35;
                  }
                } else {
                  stackOut_44_0 = 1;
                  stackIn_56_0 = stackOut_44_0;
                  break L35;
                }
              }
              L37: {
                var11 = stackIn_56_0;
                if (var11 != 0) {
                  L38: {
                    if (var7 == 0) {
                      break L38;
                    } else {
                      l.field_b[30].a(param1, param4);
                      break L38;
                    }
                  }
                  L39: {
                    if (var5 == 0) {
                      break L39;
                    } else {
                      l.field_b[29].a(param1, param4);
                      break L39;
                    }
                  }
                  l.field_b[24].a(param1, param4);
                  l.field_b[27].a(param1, param4);
                  if (var8 == 0) {
                    break L37;
                  } else {
                    l.field_b[28].a(param1, param4);
                    break L37;
                  }
                } else {
                  L40: {
                    if (var7 == 0) {
                      break L40;
                    } else {
                      if (var8 != 0) {
                        l.field_b[26].a(param1, param4);
                        break L37;
                      } else {
                        break L40;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L37;
                  } else {
                    if (var6 == 0) {
                      break L37;
                    } else {
                      l.field_b[25].a(param1, param4);
                      break L37;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          L41: {
            var11 = 1;
            if (var11 != 0) {
              L42: {
                if (var7 == 0) {
                  break L42;
                } else {
                  l.field_b[30].a(param1, param4);
                  break L42;
                }
              }
              L43: {
                if (var5 == 0) {
                  break L43;
                } else {
                  l.field_b[29].a(param1, param4);
                  break L43;
                }
              }
              l.field_b[24].a(param1, param4);
              l.field_b[27].a(param1, param4);
              if (var8 == 0) {
                break L41;
              } else {
                l.field_b[28].a(param1, param4);
                break L41;
              }
            } else {
              L44: {
                if (var7 == 0) {
                  break L44;
                } else {
                  if (var8 != 0) {
                    l.field_b[26].a(param1, param4);
                    break L41;
                  } else {
                    break L44;
                  }
                }
              }
              if (var5 == 0) {
                break L41;
              } else {
                if (var6 == 0) {
                  break L41;
                } else {
                  l.field_b[25].a(param1, param4);
                  break L41;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(byte param0, kl param1) {
        qs var2 = null;
        qs.a(param1.a("", 96, "headers.packvorbis"));
        var2 = qs.a(param1, "jagex logo2.packvorbis", "");
        if (param0 >= -102) {
          ui.a(-11, -82, (byte) 79, 117, -17);
          sn discarded$4 = var2.c();
          return;
        } else {
          sn discarded$5 = var2.c();
          return;
        }
    }

    public ui() {
        ((ui) this).field_d = new ms();
        ((ui) this).field_d.field_l = ((ui) this).field_d;
        ((ui) this).field_d.field_s = ((ui) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Accept";
        field_h = "Username: ";
        field_k = "This unit cannot move";
        field_a = "Out of range";
    }
}
