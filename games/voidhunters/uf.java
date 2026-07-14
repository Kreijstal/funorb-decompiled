/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf extends htb {
    private int field_B;
    private boolean field_I;
    private long field_D;
    private long field_J;
    private boolean field_G;
    private int field_H;
    static java.awt.Frame field_E;
    private int field_C;
    static String field_F;
    private int field_K;

    private final void k(byte param0) {
        if (!(((uf) this).field_l instanceof en)) {
          if (param0 < 40) {
            field_E = null;
            return;
          } else {
            return;
          }
        } else {
          ((en) (Object) ((uf) this).field_l).a(-12409, (uf) this);
          if (param0 >= 40) {
            return;
          } else {
            field_E = null;
            return;
          }
        }
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_156_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_149_0 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          od.field_a = od.field_a + 1;
          if (ela.field_o != -1) {
            break L0;
          } else {
            if (-1 == gi.field_b) {
              gi.field_b = uia.field_b;
              ela.field_o = kc.field_b;
              break L0;
            } else {
              if (param0 != null) {
                if (param0.equals((Object) (Object) rfa.field_o)) {
                  L1: {
                    rfa.field_o = param0;
                    if (!jib.field_o) {
                      if (!jib.field_o) {
                        break L1;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L1;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L1;
                        }
                      }
                    } else {
                      if (!jib.field_o) {
                        break L1;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L1;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 == 5757) {
                      break L2;
                    } else {
                      field_F = null;
                      break L2;
                    }
                  }
                  return;
                } else {
                  L3: {
                    if (!jib.field_o) {
                      if (fra.field_b <= od.field_a) {
                        if (od.field_a < fra.field_b - -k.field_r) {
                          stackOut_57_0 = 1;
                          stackIn_59_0 = stackOut_57_0;
                          break L3;
                        } else {
                          stackOut_56_0 = 0;
                          stackIn_59_0 = stackOut_56_0;
                          break L3;
                        }
                      } else {
                        stackOut_54_0 = 0;
                        stackIn_59_0 = stackOut_54_0;
                        break L3;
                      }
                    } else {
                      stackOut_52_0 = 0;
                      stackIn_59_0 = stackOut_52_0;
                      break L3;
                    }
                  }
                  L4: {
                    var2 = stackIn_59_0;
                    if (param0 == null) {
                      od.field_a = 0;
                      break L4;
                    } else {
                      if (!jib.field_o) {
                        if (var2 == 0) {
                          od.field_a = 0;
                          break L4;
                        } else {
                          od.field_a = fra.field_b;
                          break L4;
                        }
                      } else {
                        od.field_a = fra.field_b;
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
                          jib.field_o = true;
                          js.field_r = ela.field_o;
                          tmb.field_o = gi.field_b;
                          break L5;
                        }
                      } else {
                        jib.field_o = false;
                        break L6;
                      }
                    }
                    js.field_r = ela.field_o;
                    tmb.field_o = gi.field_b;
                    break L5;
                  }
                  L7: {
                    rfa.field_o = param0;
                    if (jib.field_o) {
                      break L7;
                    } else {
                      if (od.field_a >= fra.field_b) {
                        break L7;
                      } else {
                        if (upb.field_c) {
                          od.field_a = 0;
                          js.field_r = ela.field_o;
                          tmb.field_o = gi.field_b;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    if (!jib.field_o) {
                      break L8;
                    } else {
                      if (ioa.field_o != od.field_a) {
                        break L8;
                      } else {
                        jib.field_o = false;
                        od.field_a = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 == 5757) {
                      break L9;
                    } else {
                      field_F = null;
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                if (null != rfa.field_o) {
                  L10: {
                    rfa.field_o = param0;
                    if (!jib.field_o) {
                      if (!jib.field_o) {
                        break L10;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L10;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L10;
                        }
                      }
                    } else {
                      if (!jib.field_o) {
                        break L10;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L10;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 == 5757) {
                      break L11;
                    } else {
                      field_F = null;
                      break L11;
                    }
                  }
                  return;
                } else {
                  L12: {
                    if (!jib.field_o) {
                      if (fra.field_b <= od.field_a) {
                        if (od.field_a < fra.field_b - -k.field_r) {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L12;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_12_0 = stackOut_9_0;
                          break L12;
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_12_0 = stackOut_7_0;
                        break L12;
                      }
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_12_0 = stackOut_5_0;
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      var2 = stackIn_12_0;
                      if (param0 == null) {
                        break L14;
                      } else {
                        if (!jib.field_o) {
                          if (var2 == 0) {
                            break L14;
                          } else {
                            od.field_a = fra.field_b;
                            break L13;
                          }
                        } else {
                          od.field_a = fra.field_b;
                          break L13;
                        }
                      }
                    }
                    od.field_a = 0;
                    break L13;
                  }
                  L15: {
                    L16: {
                      if (param0 == null) {
                        if (var2 == 0) {
                          break L16;
                        } else {
                          jib.field_o = true;
                          js.field_r = ela.field_o;
                          tmb.field_o = gi.field_b;
                          break L15;
                        }
                      } else {
                        jib.field_o = false;
                        break L16;
                      }
                    }
                    js.field_r = ela.field_o;
                    tmb.field_o = gi.field_b;
                    break L15;
                  }
                  L17: {
                    rfa.field_o = param0;
                    if (!jib.field_o) {
                      if (!jib.field_o) {
                        break L17;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L17;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L17;
                        }
                      }
                    } else {
                      if (!jib.field_o) {
                        break L17;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L17;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L17;
                        }
                      }
                    }
                  }
                  L18: {
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 == 5757) {
                      break L18;
                    } else {
                      field_F = null;
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        L19: {
          if (param0 != null) {
            if (!param0.equals((Object) (Object) rfa.field_o)) {
              break L19;
            } else {
              L20: {
                rfa.field_o = param0;
                if (jib.field_o) {
                  break L20;
                } else {
                  if (od.field_a >= fra.field_b) {
                    break L20;
                  } else {
                    if (upb.field_c) {
                      od.field_a = 0;
                      js.field_r = ela.field_o;
                      tmb.field_o = gi.field_b;
                      break L20;
                    } else {
                      L21: {
                        if (!jib.field_o) {
                          break L21;
                        } else {
                          if (ioa.field_o != od.field_a) {
                            break L21;
                          } else {
                            L22: {
                              jib.field_o = false;
                              od.field_a = 0;
                              gi.field_b = -1;
                              ela.field_o = -1;
                              if (param1 == 5757) {
                                break L22;
                              } else {
                                field_F = null;
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                      gi.field_b = -1;
                      ela.field_o = -1;
                      if (param1 != 5757) {
                        field_F = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L23: {
                if (!jib.field_o) {
                  break L23;
                } else {
                  if (ioa.field_o != od.field_a) {
                    break L23;
                  } else {
                    jib.field_o = false;
                    od.field_a = 0;
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 != 5757) {
                      field_F = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              gi.field_b = -1;
              ela.field_o = -1;
              if (param1 != 5757) {
                field_F = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (null == rfa.field_o) {
              break L19;
            } else {
              L24: {
                rfa.field_o = param0;
                if (jib.field_o) {
                  break L24;
                } else {
                  if (od.field_a >= fra.field_b) {
                    break L24;
                  } else {
                    if (upb.field_c) {
                      od.field_a = 0;
                      js.field_r = ela.field_o;
                      tmb.field_o = gi.field_b;
                      break L24;
                    } else {
                      L25: {
                        if (!jib.field_o) {
                          break L25;
                        } else {
                          if (ioa.field_o != od.field_a) {
                            break L25;
                          } else {
                            L26: {
                              jib.field_o = false;
                              od.field_a = 0;
                              gi.field_b = -1;
                              ela.field_o = -1;
                              if (param1 == 5757) {
                                break L26;
                              } else {
                                field_F = null;
                                break L26;
                              }
                            }
                            return;
                          }
                        }
                      }
                      gi.field_b = -1;
                      ela.field_o = -1;
                      if (param1 != 5757) {
                        field_F = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L27: {
                if (!jib.field_o) {
                  break L27;
                } else {
                  if (ioa.field_o != od.field_a) {
                    break L27;
                  } else {
                    jib.field_o = false;
                    od.field_a = 0;
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 != 5757) {
                      field_F = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              gi.field_b = -1;
              ela.field_o = -1;
              if (param1 != 5757) {
                field_F = null;
                return;
              } else {
                return;
              }
            }
          }
        }
        L28: {
          if (!jib.field_o) {
            if (fra.field_b <= od.field_a) {
              if (od.field_a < fra.field_b - -k.field_r) {
                stackOut_154_0 = 1;
                stackIn_156_0 = stackOut_154_0;
                break L28;
              } else {
                stackOut_153_0 = 0;
                stackIn_156_0 = stackOut_153_0;
                break L28;
              }
            } else {
              stackOut_151_0 = 0;
              stackIn_156_0 = stackOut_151_0;
              break L28;
            }
          } else {
            stackOut_149_0 = 0;
            stackIn_156_0 = stackOut_149_0;
            break L28;
          }
        }
        L29: {
          var2 = stackIn_156_0;
          if (param0 == null) {
            od.field_a = 0;
            break L29;
          } else {
            L30: {
              if (jib.field_o) {
                break L30;
              } else {
                if (var2 != 0) {
                  break L30;
                } else {
                  od.field_a = 0;
                  break L29;
                }
              }
            }
            od.field_a = fra.field_b;
            break L29;
          }
        }
        if (param0 == null) {
          if (var2 == 0) {
            L31: {
              js.field_r = ela.field_o;
              tmb.field_o = gi.field_b;
              rfa.field_o = param0;
              if (jib.field_o) {
                break L31;
              } else {
                if (od.field_a >= fra.field_b) {
                  break L31;
                } else {
                  if (upb.field_c) {
                    od.field_a = 0;
                    js.field_r = ela.field_o;
                    tmb.field_o = gi.field_b;
                    break L31;
                  } else {
                    break L31;
                  }
                }
              }
            }
            L32: {
              if (!jib.field_o) {
                break L32;
              } else {
                if (ioa.field_o != od.field_a) {
                  break L32;
                } else {
                  jib.field_o = false;
                  od.field_a = 0;
                  break L32;
                }
              }
            }
            L33: {
              gi.field_b = -1;
              ela.field_o = -1;
              if (param1 == 5757) {
                break L33;
              } else {
                field_F = null;
                break L33;
              }
            }
            return;
          } else {
            jib.field_o = true;
            L34: {
              js.field_r = ela.field_o;
              tmb.field_o = gi.field_b;
              rfa.field_o = param0;
              if (jib.field_o) {
                break L34;
              } else {
                if (od.field_a >= fra.field_b) {
                  break L34;
                } else {
                  if (upb.field_c) {
                    od.field_a = 0;
                    js.field_r = ela.field_o;
                    tmb.field_o = gi.field_b;
                    break L34;
                  } else {
                    L35: {
                      if (!jib.field_o) {
                        break L35;
                      } else {
                        if (ioa.field_o != od.field_a) {
                          break L35;
                        } else {
                          jib.field_o = false;
                          od.field_a = 0;
                          break L35;
                        }
                      }
                    }
                    L36: {
                      gi.field_b = -1;
                      ela.field_o = -1;
                      if (param1 == 5757) {
                        break L36;
                      } else {
                        field_F = null;
                        break L36;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L37: {
              if (!jib.field_o) {
                break L37;
              } else {
                if (ioa.field_o != od.field_a) {
                  break L37;
                } else {
                  L38: {
                    jib.field_o = false;
                    od.field_a = 0;
                    gi.field_b = -1;
                    ela.field_o = -1;
                    if (param1 == 5757) {
                      break L38;
                    } else {
                      field_F = null;
                      break L38;
                    }
                  }
                  return;
                }
              }
            }
            gi.field_b = -1;
            ela.field_o = -1;
            if (param1 == 5757) {
              return;
            } else {
              field_F = null;
              return;
            }
          }
        } else {
          jib.field_o = false;
          L39: {
            js.field_r = ela.field_o;
            tmb.field_o = gi.field_b;
            rfa.field_o = param0;
            if (jib.field_o) {
              break L39;
            } else {
              if (od.field_a >= fra.field_b) {
                break L39;
              } else {
                if (upb.field_c) {
                  od.field_a = 0;
                  js.field_r = ela.field_o;
                  tmb.field_o = gi.field_b;
                  break L39;
                } else {
                  break L39;
                }
              }
            }
          }
          L40: {
            if (!jib.field_o) {
              break L40;
            } else {
              if (ioa.field_o != od.field_a) {
                break L40;
              } else {
                jib.field_o = false;
                od.field_a = 0;
                break L40;
              }
            }
          }
          L41: {
            gi.field_b = -1;
            ela.field_o = -1;
            if (param1 == 5757) {
              break L41;
            } else {
              field_F = null;
              break L41;
            }
          }
          return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var2 = ((uf) this).field_j.length();
        if (var2 == ((uf) this).field_K) {
          return ((uf) this).field_K;
        } else {
          var3 = ((uf) this).field_K - -1;
          L0: while (true) {
            if (var2 > var3) {
              if (((uf) this).field_j.charAt(var3 - 1) != 32) {
                var3++;
                continue L0;
              } else {
                if (param0 != 62) {
                  return 60;
                } else {
                  return var3;
                }
              }
            } else {
              if (param0 != 62) {
                return 60;
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((uf) this).field_K != ((uf) this).field_H) {
            var2 = ((uf) this).field_H < ((uf) this).field_K ? ((uf) this).field_H : ((uf) this).field_K;
            var3 = ((uf) this).field_H < ((uf) this).field_K ? ((uf) this).field_K : ((uf) this).field_H;
            ((uf) this).field_H = var2;
            ((uf) this).field_K = var2;
            ((uf) this).field_j = ((uf) this).field_j.substring(0, var2) + ((uf) this).field_j.substring(var3, ((uf) this).field_j.length());
            ((uf) this).i((byte) -55);
        }
        var2 = -86 / ((62 - param0) / 48);
    }

    private final void h(int param0) {
        ar var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        at var9 = null;
        var8 = VoidHunters.field_G;
        if (!((uf) this).field_G) {
          ((uf) this).field_s = 0;
          ((uf) this).field_i = 0;
          return;
        } else {
          if (!(((uf) this).field_q instanceof at)) {
            return;
          } else {
            var9 = (at) (Object) ((uf) this).field_q;
            var3 = var9.a((shb) this, 3);
            var4 = var3.c(-18877);
            var5 = var9.b((shb) this, (byte) 114);
            var6 = var9.a(35) >> 391500161;
            if (-var6 + var5 <= var4) {
              if (param0 == 27151) {
                var7 = ((uf) this).field_s - -var3.a(((uf) this).field_K, param0 ^ -27235);
                if (var7 > var5 - var6) {
                  ((uf) this).field_s = var5 - (var6 + (var7 - ((uf) this).field_s));
                  if ((((uf) this).field_s ^ -1) >= -1) {
                    if (((uf) this).field_s >= var6 + -var5) {
                      return;
                    } else {
                      ((uf) this).field_s = -var5 - -var6;
                      return;
                    }
                  } else {
                    ((uf) this).field_s = 0;
                    return;
                  }
                } else {
                  if (var6 <= var7) {
                    if ((((uf) this).field_s ^ -1) >= -1) {
                      if (((uf) this).field_s >= var6 + -var5) {
                        return;
                      } else {
                        ((uf) this).field_s = -var5 - -var6;
                        return;
                      }
                    } else {
                      ((uf) this).field_s = 0;
                      return;
                    }
                  } else {
                    ((uf) this).field_s = ((uf) this).field_s + var6 + -var7;
                    if ((((uf) this).field_s ^ -1) >= -1) {
                      if (((uf) this).field_s >= var6 + -var5) {
                        return;
                      } else {
                        ((uf) this).field_s = -var5 - -var6;
                        return;
                      }
                    } else {
                      ((uf) this).field_s = 0;
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              ((uf) this).field_i = 0;
              ((uf) this).field_s = 0;
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackIn_137_0 = null;
        Object stackIn_138_0 = null;
        Object stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        Object stackIn_177_0 = null;
        Object stackIn_178_0 = null;
        Object stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        Object stackOut_176_0 = null;
        Object stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        Object stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        Object stackOut_136_0 = null;
        Object stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        Object stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        Object stackOut_114_0 = null;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_89_0 = null;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        ((uf) this).field_J = wt.a(false);
        if (param0 == -15834) {
          L0: {
            if (param3 == 60) {
              break L0;
            } else {
              if (62 == param3) {
                break L0;
              } else {
                if (param3 < 32) {
                  L1: {
                    if ((param1 ^ -1) == -86) {
                      if (((uf) this).field_K == ((uf) this).field_H) {
                        if (0 >= ((uf) this).field_K) {
                          break L1;
                        } else {
                          ((uf) this).field_H = ((uf) this).field_K + -1;
                          this.g((byte) 110);
                          return true;
                        }
                      } else {
                        this.g((byte) 120);
                        return true;
                      }
                    } else {
                      if (param1 != 101) {
                        if (-14 != (param1 ^ -1)) {
                          if (param1 == -97) {
                            if (0 >= ((uf) this).field_K) {
                              break L1;
                            } else {
                              L2: {
                                stackOut_176_0 = this;
                                stackIn_178_0 = stackOut_176_0;
                                stackIn_177_0 = stackOut_176_0;
                                if (si.field_o[82]) {
                                  stackOut_178_0 = this;
                                  stackOut_178_1 = this.g(param0 + 15834);
                                  stackIn_179_0 = stackOut_178_0;
                                  stackIn_179_1 = stackOut_178_1;
                                  break L2;
                                } else {
                                  stackOut_177_0 = this;
                                  stackOut_177_1 = -1 + ((uf) this).field_K;
                                  stackIn_179_0 = stackOut_177_0;
                                  stackIn_179_1 = stackOut_177_1;
                                  break L2;
                                }
                              }
                              this.a(stackIn_179_1, (byte) -74);
                              return true;
                            }
                          } else {
                            if (-98 != param1) {
                              if (-103 != param1) {
                                if (-104 != param1) {
                                  if (-85 == (param1 ^ -1)) {
                                    this.k((byte) 68);
                                    return true;
                                  } else {
                                    if (si.field_o[82]) {
                                      if (param1 == 65) {
                                        this.b(true);
                                        return true;
                                      } else {
                                        if (!si.field_o[82]) {
                                          L3: {
                                            if (!si.field_o[82]) {
                                              break L3;
                                            } else {
                                              if (-68 == (param1 ^ -1)) {
                                                this.f(7328);
                                                return true;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          }
                                          return false;
                                        } else {
                                          if (param1 == -67) {
                                            this.l((byte) 24);
                                            return true;
                                          } else {
                                            L4: {
                                              if (!si.field_o[82]) {
                                                break L4;
                                              } else {
                                                if (-68 == param1) {
                                                  this.f(7328);
                                                  return true;
                                                } else {
                                                  break L4;
                                                }
                                              }
                                            }
                                            return false;
                                          }
                                        }
                                      }
                                    } else {
                                      if (!si.field_o[82]) {
                                        L5: {
                                          if (!si.field_o[82]) {
                                            break L5;
                                          } else {
                                            if (-68 == (param1 ^ -1)) {
                                              this.f(7328);
                                              return true;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        return false;
                                      } else {
                                        if (param1 == -67) {
                                          this.l((byte) 24);
                                          return true;
                                        } else {
                                          L6: {
                                            if (!si.field_o[82]) {
                                              break L6;
                                            } else {
                                              if (-68 == param1) {
                                                this.f(7328);
                                                return true;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.a(((uf) this).field_j.length(), (byte) -100);
                                  return true;
                                }
                              } else {
                                this.a(0, (byte) -96);
                                return true;
                              }
                            } else {
                              if (((uf) this).field_K < ((uf) this).field_j.length()) {
                                L7: {
                                  stackOut_136_0 = this;
                                  stackIn_138_0 = stackOut_136_0;
                                  stackIn_137_0 = stackOut_136_0;
                                  if (!si.field_o[82]) {
                                    stackOut_138_0 = this;
                                    stackOut_138_1 = ((uf) this).field_K - -1;
                                    stackIn_139_0 = stackOut_138_0;
                                    stackIn_139_1 = stackOut_138_1;
                                    break L7;
                                  } else {
                                    stackOut_137_0 = this;
                                    stackOut_137_1 = this.i(62);
                                    stackIn_139_0 = stackOut_137_0;
                                    stackIn_139_1 = stackOut_137_1;
                                    break L7;
                                  }
                                }
                                this.a(stackIn_139_1, (byte) -58);
                                return true;
                              } else {
                                return false;
                              }
                            }
                          }
                        } else {
                          ((uf) this).e(82);
                          return true;
                        }
                      } else {
                        if (((uf) this).field_H != ((uf) this).field_K) {
                          this.g((byte) 112);
                          return true;
                        } else {
                          if (((uf) this).field_K < ((uf) this).field_j.length()) {
                            ((uf) this).field_H = 1 + ((uf) this).field_K;
                            this.g((byte) -38);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (param3 <= 126) {
                    if (((uf) this).field_K == ((uf) this).field_H) {
                      L8: {
                        if (-1 == ((uf) this).field_C) {
                          break L8;
                        } else {
                          if (((uf) this).field_j.length() < ((uf) this).field_C) {
                            break L8;
                          } else {
                            return true;
                          }
                        }
                      }
                      if (((uf) this).field_K < ((uf) this).field_j.length()) {
                        ((uf) this).field_j = ((uf) this).field_j.substring(0, ((uf) this).field_K) + param3 + ((uf) this).field_j.substring(((uf) this).field_K, ((uf) this).field_j.length());
                        ((uf) this).field_K = ((uf) this).field_K + 1;
                        ((uf) this).field_H = ((uf) this).field_K;
                        ((uf) this).i((byte) -55);
                        return true;
                      } else {
                        ((uf) this).field_j = ((uf) this).field_j + param3;
                        ((uf) this).field_K = ((uf) this).field_j.length();
                        ((uf) this).field_H = ((uf) this).field_j.length();
                        ((uf) this).i((byte) -55);
                        return true;
                      }
                    } else {
                      L9: {
                        this.g((byte) 120);
                        if (-1 == ((uf) this).field_C) {
                          break L9;
                        } else {
                          if (((uf) this).field_j.length() < ((uf) this).field_C) {
                            break L9;
                          } else {
                            return true;
                          }
                        }
                      }
                      if (((uf) this).field_K < ((uf) this).field_j.length()) {
                        ((uf) this).field_j = ((uf) this).field_j.substring(0, ((uf) this).field_K) + param3 + ((uf) this).field_j.substring(((uf) this).field_K, ((uf) this).field_j.length());
                        ((uf) this).field_K = ((uf) this).field_K + 1;
                        ((uf) this).field_H = ((uf) this).field_K;
                        ((uf) this).i((byte) -55);
                        return true;
                      } else {
                        ((uf) this).field_j = ((uf) this).field_j + param3;
                        ((uf) this).field_K = ((uf) this).field_j.length();
                        ((uf) this).field_H = ((uf) this).field_j.length();
                        ((uf) this).i((byte) -55);
                        return true;
                      }
                    }
                  } else {
                    L10: {
                      if ((param1 ^ -1) == -86) {
                        if (((uf) this).field_K == ((uf) this).field_H) {
                          if (0 >= ((uf) this).field_K) {
                            break L10;
                          } else {
                            ((uf) this).field_H = ((uf) this).field_K + -1;
                            this.g((byte) 110);
                            return true;
                          }
                        } else {
                          this.g((byte) 120);
                          return true;
                        }
                      } else {
                        if (param1 != 101) {
                          if (-14 != (param1 ^ -1)) {
                            if (param1 == -97) {
                              if (0 >= ((uf) this).field_K) {
                                break L10;
                              } else {
                                L11: {
                                  stackOut_114_0 = this;
                                  stackIn_116_0 = stackOut_114_0;
                                  stackIn_115_0 = stackOut_114_0;
                                  if (si.field_o[82]) {
                                    stackOut_116_0 = this;
                                    stackOut_116_1 = this.g(param0 + 15834);
                                    stackIn_117_0 = stackOut_116_0;
                                    stackIn_117_1 = stackOut_116_1;
                                    break L11;
                                  } else {
                                    stackOut_115_0 = this;
                                    stackOut_115_1 = -1 + ((uf) this).field_K;
                                    stackIn_117_0 = stackOut_115_0;
                                    stackIn_117_1 = stackOut_115_1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_117_1, (byte) -74);
                                return true;
                              }
                            } else {
                              if (-98 != param1) {
                                if (-103 != param1) {
                                  if (-104 != param1) {
                                    if (-85 != (param1 ^ -1)) {
                                      L12: {
                                        if (!si.field_o[82]) {
                                          break L12;
                                        } else {
                                          if (param1 != 65) {
                                            break L12;
                                          } else {
                                            this.b(true);
                                            return true;
                                          }
                                        }
                                      }
                                      L13: {
                                        if (!si.field_o[82]) {
                                          break L13;
                                        } else {
                                          if (param1 == -67) {
                                            this.l((byte) 24);
                                            return true;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if (!si.field_o[82]) {
                                        break L10;
                                      } else {
                                        if (-68 == param1) {
                                          this.f(7328);
                                          return true;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    } else {
                                      this.k((byte) 68);
                                      return true;
                                    }
                                  } else {
                                    this.a(((uf) this).field_j.length(), (byte) -100);
                                    return true;
                                  }
                                } else {
                                  this.a(0, (byte) -96);
                                  return true;
                                }
                              } else {
                                if (((uf) this).field_K >= ((uf) this).field_j.length()) {
                                  return false;
                                } else {
                                  L14: {
                                    stackOut_89_0 = this;
                                    stackIn_91_0 = stackOut_89_0;
                                    stackIn_90_0 = stackOut_89_0;
                                    if (!si.field_o[82]) {
                                      stackOut_91_0 = this;
                                      stackOut_91_1 = ((uf) this).field_K - -1;
                                      stackIn_92_0 = stackOut_91_0;
                                      stackIn_92_1 = stackOut_91_1;
                                      break L14;
                                    } else {
                                      stackOut_90_0 = this;
                                      stackOut_90_1 = this.i(62);
                                      stackIn_92_0 = stackOut_90_0;
                                      stackIn_92_1 = stackOut_90_1;
                                      break L14;
                                    }
                                  }
                                  this.a(stackIn_92_1, (byte) -58);
                                  return true;
                                }
                              }
                            }
                          } else {
                            ((uf) this).e(82);
                            return true;
                          }
                        } else {
                          if (((uf) this).field_H == ((uf) this).field_K) {
                            if (((uf) this).field_K >= ((uf) this).field_j.length()) {
                              return false;
                            } else {
                              ((uf) this).field_H = 1 + ((uf) this).field_K;
                              this.g((byte) -38);
                              return true;
                            }
                          } else {
                            this.g((byte) 112);
                            return true;
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          L15: {
            ((uf) this).field_H = 81;
            if (param3 == 60) {
              break L15;
            } else {
              if (62 == param3) {
                break L15;
              } else {
                L16: {
                  if (param3 < 32) {
                    break L16;
                  } else {
                    if (param3 > 126) {
                      break L16;
                    } else {
                      L17: {
                        if (((uf) this).field_K == ((uf) this).field_H) {
                          break L17;
                        } else {
                          this.g((byte) 120);
                          break L17;
                        }
                      }
                      L18: {
                        L19: {
                          if (-1 == ((uf) this).field_C) {
                            break L19;
                          } else {
                            if (((uf) this).field_j.length() < ((uf) this).field_C) {
                              break L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (((uf) this).field_K < ((uf) this).field_j.length()) {
                          ((uf) this).field_j = ((uf) this).field_j.substring(0, ((uf) this).field_K) + param3 + ((uf) this).field_j.substring(((uf) this).field_K, ((uf) this).field_j.length());
                          ((uf) this).field_K = ((uf) this).field_K + 1;
                          ((uf) this).field_H = ((uf) this).field_K;
                          ((uf) this).i((byte) -55);
                          break L18;
                        } else {
                          ((uf) this).field_j = ((uf) this).field_j + param3;
                          ((uf) this).field_K = ((uf) this).field_j.length();
                          ((uf) this).field_H = ((uf) this).field_j.length();
                          ((uf) this).i((byte) -55);
                          break L18;
                        }
                      }
                      return true;
                    }
                  }
                }
                if ((param1 ^ -1) == -86) {
                  if (((uf) this).field_K == ((uf) this).field_H) {
                    if (0 >= ((uf) this).field_K) {
                      return false;
                    } else {
                      ((uf) this).field_H = ((uf) this).field_K + -1;
                      this.g((byte) 110);
                      return true;
                    }
                  } else {
                    this.g((byte) 120);
                    return true;
                  }
                } else {
                  if (param1 != 101) {
                    if (-14 != (param1 ^ -1)) {
                      if (param1 == -97) {
                        if (0 >= ((uf) this).field_K) {
                          return false;
                        } else {
                          L20: {
                            stackOut_58_0 = this;
                            stackIn_60_0 = stackOut_58_0;
                            stackIn_59_0 = stackOut_58_0;
                            if (si.field_o[82]) {
                              stackOut_60_0 = this;
                              stackOut_60_1 = this.g(param0 + 15834);
                              stackIn_61_0 = stackOut_60_0;
                              stackIn_61_1 = stackOut_60_1;
                              break L20;
                            } else {
                              stackOut_59_0 = this;
                              stackOut_59_1 = -1 + ((uf) this).field_K;
                              stackIn_61_0 = stackOut_59_0;
                              stackIn_61_1 = stackOut_59_1;
                              break L20;
                            }
                          }
                          this.a(stackIn_61_1, (byte) -74);
                          return true;
                        }
                      } else {
                        if (-98 != param1) {
                          if (-103 != param1) {
                            if (-104 != param1) {
                              if (-85 != (param1 ^ -1)) {
                                L21: {
                                  if (!si.field_o[82]) {
                                    break L21;
                                  } else {
                                    if (param1 != 65) {
                                      break L21;
                                    } else {
                                      this.b(true);
                                      return true;
                                    }
                                  }
                                }
                                L22: {
                                  if (!si.field_o[82]) {
                                    break L22;
                                  } else {
                                    if (param1 != -67) {
                                      break L22;
                                    } else {
                                      this.l((byte) 24);
                                      return true;
                                    }
                                  }
                                }
                                if (si.field_o[82]) {
                                  if (-68 != param1) {
                                    return false;
                                  } else {
                                    this.f(7328);
                                    return true;
                                  }
                                } else {
                                  return false;
                                }
                              } else {
                                this.k((byte) 68);
                                return true;
                              }
                            } else {
                              this.a(((uf) this).field_j.length(), (byte) -100);
                              return true;
                            }
                          } else {
                            this.a(0, (byte) -96);
                            return true;
                          }
                        } else {
                          if (((uf) this).field_K < ((uf) this).field_j.length()) {
                            L23: {
                              stackOut_33_0 = this;
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              if (!si.field_o[82]) {
                                stackOut_35_0 = this;
                                stackOut_35_1 = ((uf) this).field_K - -1;
                                stackIn_36_0 = stackOut_35_0;
                                stackIn_36_1 = stackOut_35_1;
                                break L23;
                              } else {
                                stackOut_34_0 = this;
                                stackOut_34_1 = this.i(62);
                                stackIn_36_0 = stackOut_34_0;
                                stackIn_36_1 = stackOut_34_1;
                                break L23;
                              }
                            }
                            this.a(stackIn_36_1, (byte) -58);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      ((uf) this).e(82);
                      return true;
                    }
                  } else {
                    if (((uf) this).field_H == ((uf) this).field_K) {
                      if (((uf) this).field_K < ((uf) this).field_j.length()) {
                        ((uf) this).field_H = 1 + ((uf) this).field_K;
                        this.g((byte) -38);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.g((byte) 112);
                      return true;
                    }
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var4 = 0;
        L0: {
          if (param2 != null) {
            break L0;
          } else {
            param2 = "";
            break L0;
          }
        }
        L1: {
          ((uf) this).field_j = param2;
          var4 = param2.length();
          if ((((uf) this).field_C ^ -1) == param1) {
            break L1;
          } else {
            if (((uf) this).field_C < var4) {
              ((uf) this).field_j = ((uf) this).field_j.substring(0, ((uf) this).field_C);
              break L1;
            } else {
              ((uf) this).field_H = ((uf) this).field_j.length();
              ((uf) this).field_K = ((uf) this).field_j.length();
              if (param0) {
                return;
              } else {
                ((uf) this).i((byte) -55);
                return;
              }
            }
          }
        }
        ((uf) this).field_H = ((uf) this).field_j.length();
        ((uf) this).field_K = ((uf) this).field_j.length();
        if (!param0) {
          ((uf) this).i((byte) -55);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        L0: {
          if (0 == (((uf) this).field_C ^ -1)) {
            break L0;
          } else {
            var3 = ((uf) this).field_C - ((uf) this).field_j.length();
            if (0 <= var3) {
              return;
            } else {
              param1 = param1.substring(0, var3);
              break L0;
            }
          }
        }
        if (((uf) this).field_K == ((uf) this).field_j.length()) {
          ((uf) this).field_j = ((uf) this).field_j + param1;
          ((uf) this).field_K = ((uf) this).field_K + param1.length();
          var3 = -69 % ((34 - param0) / 56);
          ((uf) this).field_H = ((uf) this).field_K;
          ((uf) this).i((byte) -55);
          return;
        } else {
          ((uf) this).field_j = ((uf) this).field_j.substring(0, ((uf) this).field_K) + param1 + ((uf) this).field_j.substring(((uf) this).field_K, ((uf) this).field_j.length());
          ((uf) this).field_K = ((uf) this).field_K + param1.length();
          var3 = -69 % ((34 - param0) / 56);
          ((uf) this).field_H = ((uf) this).field_K;
          ((uf) this).i((byte) -55);
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        at var8 = null;
        at var10 = null;
        at var11 = null;
        if (param2 > 47) {
          if (((uf) this).field_q != null) {
            if (-1 == (param1 ^ -1)) {
              ((uf) this).field_q.a(29, (shb) this, param0, param3, ((uf) this).field_x);
              if (((uf) this).field_q instanceof at) {
                L0: {
                  var11 = (at) (Object) ((uf) this).field_q;
                  if (((uf) this).field_H != ((uf) this).field_K) {
                    var11.b(((uf) this).field_H, param3, -24184, param0, (shb) this, ((uf) this).field_K);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = wt.a(false);
                if (((var6 + -((uf) this).field_J) % 1000L ^ -1L) <= -501L) {
                  return;
                } else {
                  var11.a((shb) this, param3, (byte) 99, param0, ((uf) this).field_K);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.g((byte) 89);
          if (((uf) this).field_q != null) {
            if (-1 == (param1 ^ -1)) {
              ((uf) this).field_q.a(29, (shb) this, param0, param3, ((uf) this).field_x);
              if (((uf) this).field_q instanceof at) {
                L1: {
                  var10 = (at) (Object) ((uf) this).field_q;
                  var8 = var10;
                  if (((uf) this).field_H != ((uf) this).field_K) {
                    var10.b(((uf) this).field_H, param3, -24184, param0, (shb) this, ((uf) this).field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = wt.a(false);
                if (((var6 + -((uf) this).field_J) % 1000L ^ -1L) <= -501L) {
                  return;
                } else {
                  var10.a((shb) this, param3, (byte) 99, param0, ((uf) this).field_K);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    uf(String param0, sba param1, int param2) {
        super(param0, param1);
        ((uf) this).field_I = false;
        ((uf) this).field_B = -1;
        ((uf) this).field_D = 0L;
        ((uf) this).field_C = param2;
        ((uf) this).field_q = msa.field_s.field_o;
        ((uf) this).a(true, 0, param0);
        ((uf) this).field_G = true;
        ((uf) this).field_J = wt.a(false);
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -61)) {
          if (param6 >= -17) {
            this.k((byte) 59);
            return false;
          } else {
            return false;
          }
        } else {
          if (((uf) this).field_q instanceof at) {
            L0: {
              var8_int = ((at) (Object) ((uf) this).field_q).a(kc.field_b, uia.field_b, param5, param1, (shb) this, -1);
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (0 == (var8_int ^ -1)) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L0;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = var8_int;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_9_1, (byte) -84);
              var8 = wt.a(false);
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (-251L >= (var8 - ((uf) this).field_D ^ -1L)) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L1;
              }
            }
            ((uf) this).field_I = stackIn_12_1 != 0;
            if (((uf) this).field_I) {
              ((uf) this).field_H = this.g(0);
              ((uf) this).field_K = this.i(62);
              if (-1 > (((uf) this).field_K ^ -1)) {
                if (((uf) this).field_j.charAt(((uf) this).field_K + -1) == 32) {
                  ((uf) this).field_K = ((uf) this).field_K - 1;
                  ((uf) this).field_B = ((uf) this).field_K;
                  ((uf) this).field_D = var8;
                  return true;
                } else {
                  ((uf) this).field_B = ((uf) this).field_K;
                  ((uf) this).field_D = var8;
                  return true;
                }
              } else {
                ((uf) this).field_B = ((uf) this).field_K;
                ((uf) this).field_D = var8;
                return true;
              }
            } else {
              ((uf) this).field_D = var8;
              return true;
            }
          } else {
            if (param6 < -17) {
              return false;
            } else {
              this.k((byte) 59);
              return false;
            }
          }
        }
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param0 != ((uf) this).field_K) {
          var2 = -1 + ((uf) this).field_K;
          L0: while (true) {
            if (var2 > 0) {
              if (((uf) this).field_j.charAt(var2 + -1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((uf) this).field_K;
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        int var6 = 0;
        at var8 = null;
        at var9 = null;
        super.a(param0, param1, param2 ^ 0, param3);
        this.h(param2 ^ -27100);
        if (param2 == -981) {
          if (-2 == (((uf) this).field_n ^ -1)) {
            if (((uf) this).field_q instanceof at) {
              var9 = (at) (Object) ((uf) this).field_q;
              var6 = var9.a(kc.field_b, uia.field_b, param0, param1, (shb) this, param2 + 980);
              if (0 != (var6 ^ -1)) {
                if (((uf) this).field_I) {
                  if (var6 < ((uf) this).field_B) {
                    if (((uf) this).field_H >= var6) {
                      ((uf) this).field_K = var6;
                      ((uf) this).field_J = wt.a(false);
                      return;
                    } else {
                      var6 = ((uf) this).field_B;
                      ((uf) this).field_K = var6;
                      ((uf) this).field_J = wt.a(false);
                      return;
                    }
                  } else {
                    ((uf) this).field_K = var6;
                    ((uf) this).field_J = wt.a(false);
                    return;
                  }
                } else {
                  ((uf) this).field_K = var6;
                  ((uf) this).field_J = wt.a(false);
                  return;
                }
              } else {
                ((uf) this).field_J = wt.a(false);
                return;
              }
            } else {
              ((uf) this).field_J = wt.a(false);
              return;
            }
          } else {
            return;
          }
        } else {
          ((uf) this).field_J = -63L;
          if (-2 == (((uf) this).field_n ^ -1)) {
            if (((uf) this).field_q instanceof at) {
              var8 = (at) (Object) ((uf) this).field_q;
              var6 = var8.a(kc.field_b, uia.field_b, param0, param1, (shb) this, param2 + 980);
              if (0 != (var6 ^ -1)) {
                if (((uf) this).field_I) {
                  if (var6 < ((uf) this).field_B) {
                    if (((uf) this).field_H >= var6) {
                      ((uf) this).field_K = var6;
                      ((uf) this).field_J = wt.a(false);
                      return;
                    } else {
                      var6 = ((uf) this).field_B;
                      ((uf) this).field_K = var6;
                      ((uf) this).field_J = wt.a(false);
                      return;
                    }
                  } else {
                    ((uf) this).field_K = var6;
                    ((uf) this).field_J = wt.a(false);
                    return;
                  }
                } else {
                  ((uf) this).field_K = var6;
                  ((uf) this).field_J = wt.a(false);
                  return;
                }
              } else {
                ((uf) this).field_J = wt.a(false);
                return;
              }
            } else {
              ((uf) this).field_J = wt.a(false);
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void f(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.g((byte) -121);
              if (param0 == 7328) {
                this.a(96, var2);
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(byte param0) {
        field_F = null;
        int var1 = -24 % ((-63 - param0) / 45);
        field_E = null;
    }

    private final void l(byte param0) {
        try {
            String var2 = null;
            if (param0 == 24) {
              var2 = this.j((byte) -96);
              if (var2.length() > 0) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j((byte) -96)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              this.b(true);
              var2 = this.j((byte) -96);
              if (var2.length() <= 0) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j((byte) -96)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte param1) {
        ((uf) this).field_K = param0;
        if (param1 > -35) {
          L0: {
            this.b(false);
            if (!si.field_o[81]) {
              ((uf) this).field_H = ((uf) this).field_K;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!si.field_o[81]) {
              ((uf) this).field_H = ((uf) this).field_K;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void e(int param0) {
        ((uf) this).field_K = 0;
        if (param0 != 82) {
          this.a(32, (String) null);
          ((uf) this).field_H = 0;
          ((uf) this).field_j = "";
          ((uf) this).i((byte) -55);
          return;
        } else {
          ((uf) this).field_H = 0;
          ((uf) this).field_j = "";
          ((uf) this).i((byte) -55);
          return;
        }
    }

    private final String j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != -96) {
          return null;
        } else {
          L0: {
            if (((uf) this).field_H >= ((uf) this).field_K) {
              stackOut_3_0 = ((uf) this).field_K;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((uf) this).field_H;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (((uf) this).field_H >= ((uf) this).field_K) {
              stackOut_6_0 = ((uf) this).field_H;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((uf) this).field_K;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((uf) this).field_j.substring(var2, var3);
        }
    }

    void i(byte param0) {
        L0: {
          if (((uf) this).field_l instanceof en) {
            ((en) (Object) ((uf) this).field_l).a((uf) this, (byte) 100);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -55) {
          ((uf) this).field_H = -20;
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        this.l((byte) 24);
        this.g((byte) 116);
        if (!param0) {
            field_F = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ns discarded$0 = new ns();
        field_F = "Weapon";
    }
}
