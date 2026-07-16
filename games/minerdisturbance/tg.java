/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int field_f;
    private int field_h;
    private pi field_e;
    private pi field_c;
    static int field_g;
    static int field_i;
    static int field_d;
    private int field_a;
    private pi[] field_b;

    final pi a(int param0) {
        ((tg) this).field_h = 0;
        if (param0 != -16545) {
            pi discarded$0 = ((tg) this).a(77);
            return ((tg) this).a(true);
        }
        return ((tg) this).a(true);
    }

    final pi a(long param0, int param1) {
        pi var4 = null;
        pi var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        var4 = ((tg) this).field_b[(int)(param0 & (long)(((tg) this).field_a - 1))];
        ((tg) this).field_c = var4.field_f;
        L0: while (true) {
          if (((tg) this).field_c == var4) {
            ((tg) this).field_c = null;
            if (param1 == -27109) {
              return null;
            } else {
              ((tg) this).field_e = null;
              return null;
            }
          } else {
            if (((tg) this).field_c.field_d != param0) {
              ((tg) this).field_c = ((tg) this).field_c.field_f;
              continue L0;
            } else {
              var5 = ((tg) this).field_c;
              ((tg) this).field_c = ((tg) this).field_c.field_f;
              return var5;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_224_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var3 = MinerDisturbance.field_ab;
        if (param0 <= -89) {
          L0: {
            pe.field_pb = pe.field_pb + 1;
            if ((h.field_b ^ -1) != 0) {
              break L0;
            } else {
              if (vd.field_y == -1) {
                h.field_b = nk.field_w;
                vd.field_y = gb.field_e;
                break L0;
              } else {
                if (param1 == null) {
                  if (null != fa.field_c) {
                    L1: {
                      if (il.field_n) {
                        break L1;
                      } else {
                        if (ch.field_f <= pe.field_pb) {
                          break L1;
                        } else {
                          if (!k.field_i) {
                            break L1;
                          } else {
                            lj.field_q = vd.field_y;
                            pe.field_pb = 0;
                            ng.field_l = h.field_b;
                            break L1;
                          }
                        }
                      }
                    }
                    L2: {
                      fa.field_c = param1;
                      vd.field_y = -1;
                      h.field_b = -1;
                      if (!il.field_n) {
                        break L2;
                      } else {
                        if (oh.field_E == pe.field_pb) {
                          il.field_n = false;
                          pe.field_pb = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return;
                  } else {
                    L3: {
                      if (!il.field_n) {
                        if (pe.field_pb >= ch.field_f) {
                          if (od.field_o + ch.field_f <= pe.field_pb) {
                            stackOut_152_0 = 0;
                            stackIn_153_0 = stackOut_152_0;
                            break L3;
                          } else {
                            stackOut_151_0 = 1;
                            stackIn_153_0 = stackOut_151_0;
                            break L3;
                          }
                        } else {
                          stackOut_149_0 = 0;
                          stackIn_153_0 = stackOut_149_0;
                          break L3;
                        }
                      } else {
                        stackOut_147_0 = 0;
                        stackIn_153_0 = stackOut_147_0;
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var2 = stackIn_153_0;
                        if (param1 == null) {
                          break L5;
                        } else {
                          if (il.field_n) {
                            pe.field_pb = ch.field_f;
                            break L4;
                          } else {
                            if (var2 == 0) {
                              break L5;
                            } else {
                              pe.field_pb = ch.field_f;
                              break L4;
                            }
                          }
                        }
                      }
                      pe.field_pb = 0;
                      break L4;
                    }
                    L6: {
                      lj.field_q = vd.field_y;
                      ng.field_l = h.field_b;
                      if (param1 != null) {
                        il.field_n = false;
                        break L6;
                      } else {
                        if (var2 == 0) {
                          break L6;
                        } else {
                          il.field_n = true;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (il.field_n) {
                        break L7;
                      } else {
                        if (ch.field_f <= pe.field_pb) {
                          break L7;
                        } else {
                          if (!k.field_i) {
                            break L7;
                          } else {
                            lj.field_q = vd.field_y;
                            pe.field_pb = 0;
                            ng.field_l = h.field_b;
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      fa.field_c = param1;
                      vd.field_y = -1;
                      h.field_b = -1;
                      if (!il.field_n) {
                        break L8;
                      } else {
                        if (oh.field_E == pe.field_pb) {
                          il.field_n = false;
                          pe.field_pb = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L9: {
                    if (!param1.equals((Object) (Object) fa.field_c)) {
                      L10: {
                        if (!il.field_n) {
                          if (pe.field_pb >= ch.field_f) {
                            if (od.field_o + ch.field_f <= pe.field_pb) {
                              stackOut_123_0 = 0;
                              stackIn_124_0 = stackOut_123_0;
                              break L10;
                            } else {
                              stackOut_122_0 = 1;
                              stackIn_124_0 = stackOut_122_0;
                              break L10;
                            }
                          } else {
                            stackOut_120_0 = 0;
                            stackIn_124_0 = stackOut_120_0;
                            break L10;
                          }
                        } else {
                          stackOut_118_0 = 0;
                          stackIn_124_0 = stackOut_118_0;
                          break L10;
                        }
                      }
                      L11: {
                        L12: {
                          var2 = stackIn_124_0;
                          if (param1 == null) {
                            break L12;
                          } else {
                            if (il.field_n) {
                              pe.field_pb = ch.field_f;
                              break L11;
                            } else {
                              if (var2 == 0) {
                                break L12;
                              } else {
                                pe.field_pb = ch.field_f;
                                break L11;
                              }
                            }
                          }
                        }
                        pe.field_pb = 0;
                        break L11;
                      }
                      lj.field_q = vd.field_y;
                      ng.field_l = h.field_b;
                      if (param1 != null) {
                        il.field_n = false;
                        break L9;
                      } else {
                        if (var2 == 0) {
                          break L9;
                        } else {
                          il.field_n = true;
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  L13: {
                    if (il.field_n) {
                      break L13;
                    } else {
                      if (ch.field_f <= pe.field_pb) {
                        break L13;
                      } else {
                        if (!k.field_i) {
                          break L13;
                        } else {
                          lj.field_q = vd.field_y;
                          pe.field_pb = 0;
                          ng.field_l = h.field_b;
                          break L13;
                        }
                      }
                    }
                  }
                  L14: {
                    fa.field_c = param1;
                    vd.field_y = -1;
                    h.field_b = -1;
                    if (!il.field_n) {
                      break L14;
                    } else {
                      if (oh.field_E == pe.field_pb) {
                        il.field_n = false;
                        pe.field_pb = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L15: {
            if (param1 != null) {
              if (!param1.equals((Object) (Object) fa.field_c)) {
                L16: {
                  if (!il.field_n) {
                    if (pe.field_pb >= ch.field_f) {
                      if (od.field_o + ch.field_f <= pe.field_pb) {
                        stackOut_223_0 = 0;
                        stackIn_224_0 = stackOut_223_0;
                        break L16;
                      } else {
                        stackOut_222_0 = 1;
                        stackIn_224_0 = stackOut_222_0;
                        break L16;
                      }
                    } else {
                      stackOut_220_0 = 0;
                      stackIn_224_0 = stackOut_220_0;
                      break L16;
                    }
                  } else {
                    stackOut_218_0 = 0;
                    stackIn_224_0 = stackOut_218_0;
                    break L16;
                  }
                }
                var2 = stackIn_224_0;
                if (param1 == null) {
                  L17: {
                    pe.field_pb = 0;
                    lj.field_q = vd.field_y;
                    ng.field_l = h.field_b;
                    if (param1 != null) {
                      il.field_n = false;
                      break L17;
                    } else {
                      il.field_n = true;
                      break L17;
                    }
                  }
                  L18: {
                    if (il.field_n) {
                      break L18;
                    } else {
                      if (ch.field_f <= pe.field_pb) {
                        break L18;
                      } else {
                        if (!k.field_i) {
                          break L18;
                        } else {
                          lj.field_q = vd.field_y;
                          pe.field_pb = 0;
                          ng.field_l = h.field_b;
                          fa.field_c = param1;
                          vd.field_y = -1;
                          h.field_b = -1;
                          if (!il.field_n) {
                            return;
                          } else {
                            L19: {
                              if (oh.field_E == pe.field_pb) {
                                il.field_n = false;
                                pe.field_pb = 0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                  fa.field_c = param1;
                  vd.field_y = -1;
                  h.field_b = -1;
                  if (!il.field_n) {
                    return;
                  } else {
                    L20: {
                      if (oh.field_E == pe.field_pb) {
                        il.field_n = false;
                        pe.field_pb = 0;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    return;
                  }
                } else {
                  if (il.field_n) {
                    pe.field_pb = ch.field_f;
                    lj.field_q = vd.field_y;
                    ng.field_l = h.field_b;
                    if (param1 != null) {
                      L21: {
                        il.field_n = false;
                        if (il.field_n) {
                          break L21;
                        } else {
                          if (ch.field_f <= pe.field_pb) {
                            break L21;
                          } else {
                            if (!k.field_i) {
                              break L21;
                            } else {
                              lj.field_q = vd.field_y;
                              pe.field_pb = 0;
                              ng.field_l = h.field_b;
                              fa.field_c = param1;
                              vd.field_y = -1;
                              h.field_b = -1;
                              if (il.field_n) {
                                L22: {
                                  if (oh.field_E == pe.field_pb) {
                                    il.field_n = false;
                                    pe.field_pb = 0;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                      fa.field_c = param1;
                      vd.field_y = -1;
                      h.field_b = -1;
                      if (il.field_n) {
                        L23: {
                          if (oh.field_E == pe.field_pb) {
                            il.field_n = false;
                            pe.field_pb = 0;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var2 == 0) {
                        break L15;
                      } else {
                        L24: {
                          il.field_n = true;
                          if (il.field_n) {
                            break L24;
                          } else {
                            if (ch.field_f <= pe.field_pb) {
                              break L24;
                            } else {
                              if (!k.field_i) {
                                break L24;
                              } else {
                                lj.field_q = vd.field_y;
                                pe.field_pb = 0;
                                ng.field_l = h.field_b;
                                fa.field_c = param1;
                                vd.field_y = -1;
                                h.field_b = -1;
                                if (il.field_n) {
                                  L25: {
                                    if (oh.field_E == pe.field_pb) {
                                      il.field_n = false;
                                      pe.field_pb = 0;
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  return;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                        fa.field_c = param1;
                        vd.field_y = -1;
                        h.field_b = -1;
                        if (il.field_n) {
                          L26: {
                            if (oh.field_E == pe.field_pb) {
                              il.field_n = false;
                              pe.field_pb = 0;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var2 == 0) {
                      pe.field_pb = 0;
                      lj.field_q = vd.field_y;
                      ng.field_l = h.field_b;
                      if (param1 != null) {
                        L27: {
                          il.field_n = false;
                          if (il.field_n) {
                            break L27;
                          } else {
                            if (ch.field_f <= pe.field_pb) {
                              break L27;
                            } else {
                              if (!k.field_i) {
                                break L27;
                              } else {
                                lj.field_q = vd.field_y;
                                pe.field_pb = 0;
                                ng.field_l = h.field_b;
                                break L27;
                              }
                            }
                          }
                        }
                        fa.field_c = param1;
                        vd.field_y = -1;
                        h.field_b = -1;
                        if (!il.field_n) {
                          return;
                        } else {
                          L28: {
                            if (oh.field_E == pe.field_pb) {
                              il.field_n = false;
                              pe.field_pb = 0;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          return;
                        }
                      } else {
                        if (var2 == 0) {
                          L29: {
                            if (il.field_n) {
                              break L29;
                            } else {
                              if (ch.field_f <= pe.field_pb) {
                                break L29;
                              } else {
                                if (!k.field_i) {
                                  break L29;
                                } else {
                                  lj.field_q = vd.field_y;
                                  pe.field_pb = 0;
                                  ng.field_l = h.field_b;
                                  fa.field_c = param1;
                                  vd.field_y = -1;
                                  h.field_b = -1;
                                  if (il.field_n) {
                                    L30: {
                                      if (oh.field_E == pe.field_pb) {
                                        il.field_n = false;
                                        pe.field_pb = 0;
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          fa.field_c = param1;
                          vd.field_y = -1;
                          h.field_b = -1;
                          if (il.field_n) {
                            L31: {
                              if (oh.field_E == pe.field_pb) {
                                il.field_n = false;
                                pe.field_pb = 0;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L32: {
                            il.field_n = true;
                            if (il.field_n) {
                              break L32;
                            } else {
                              if (ch.field_f <= pe.field_pb) {
                                break L32;
                              } else {
                                if (!k.field_i) {
                                  break L32;
                                } else {
                                  lj.field_q = vd.field_y;
                                  pe.field_pb = 0;
                                  ng.field_l = h.field_b;
                                  break L32;
                                }
                              }
                            }
                          }
                          fa.field_c = param1;
                          vd.field_y = -1;
                          h.field_b = -1;
                          if (!il.field_n) {
                            return;
                          } else {
                            L33: {
                              if (oh.field_E == pe.field_pb) {
                                il.field_n = false;
                                pe.field_pb = 0;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            return;
                          }
                        }
                      }
                    } else {
                      L34: {
                        pe.field_pb = ch.field_f;
                        lj.field_q = vd.field_y;
                        ng.field_l = h.field_b;
                        if (param1 != null) {
                          il.field_n = false;
                          break L34;
                        } else {
                          il.field_n = true;
                          break L34;
                        }
                      }
                      L35: {
                        if (il.field_n) {
                          break L35;
                        } else {
                          if (ch.field_f <= pe.field_pb) {
                            break L35;
                          } else {
                            if (!k.field_i) {
                              break L35;
                            } else {
                              lj.field_q = vd.field_y;
                              pe.field_pb = 0;
                              ng.field_l = h.field_b;
                              break L35;
                            }
                          }
                        }
                      }
                      fa.field_c = param1;
                      vd.field_y = -1;
                      h.field_b = -1;
                      if (!il.field_n) {
                        return;
                      } else {
                        L36: {
                          if (oh.field_E == pe.field_pb) {
                            il.field_n = false;
                            pe.field_pb = 0;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              } else {
                break L15;
              }
            } else {
              if (null != fa.field_c) {
                break L15;
              } else {
                L37: {
                  if (!il.field_n) {
                    if (pe.field_pb >= ch.field_f) {
                      if (od.field_o + ch.field_f <= pe.field_pb) {
                        stackOut_193_0 = 0;
                        stackIn_194_0 = stackOut_193_0;
                        break L37;
                      } else {
                        stackOut_192_0 = 1;
                        stackIn_194_0 = stackOut_192_0;
                        break L37;
                      }
                    } else {
                      stackOut_190_0 = 0;
                      stackIn_194_0 = stackOut_190_0;
                      break L37;
                    }
                  } else {
                    stackOut_188_0 = 0;
                    stackIn_194_0 = stackOut_188_0;
                    break L37;
                  }
                }
                L38: {
                  L39: {
                    var2 = stackIn_194_0;
                    if (param1 == null) {
                      break L39;
                    } else {
                      if (il.field_n) {
                        pe.field_pb = ch.field_f;
                        break L38;
                      } else {
                        if (var2 == 0) {
                          break L39;
                        } else {
                          pe.field_pb = ch.field_f;
                          break L38;
                        }
                      }
                    }
                  }
                  pe.field_pb = 0;
                  break L38;
                }
                L40: {
                  lj.field_q = vd.field_y;
                  ng.field_l = h.field_b;
                  if (param1 != null) {
                    il.field_n = false;
                    break L40;
                  } else {
                    if (var2 == 0) {
                      break L40;
                    } else {
                      il.field_n = true;
                      break L40;
                    }
                  }
                }
                L41: {
                  if (il.field_n) {
                    break L41;
                  } else {
                    if (ch.field_f <= pe.field_pb) {
                      break L41;
                    } else {
                      if (!k.field_i) {
                        break L41;
                      } else {
                        lj.field_q = vd.field_y;
                        pe.field_pb = 0;
                        ng.field_l = h.field_b;
                        break L41;
                      }
                    }
                  }
                }
                L42: {
                  fa.field_c = param1;
                  vd.field_y = -1;
                  h.field_b = -1;
                  if (!il.field_n) {
                    break L42;
                  } else {
                    if (oh.field_E == pe.field_pb) {
                      il.field_n = false;
                      pe.field_pb = 0;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                }
                return;
              }
            }
          }
          L43: {
            if (il.field_n) {
              break L43;
            } else {
              if (ch.field_f <= pe.field_pb) {
                break L43;
              } else {
                if (!k.field_i) {
                  break L43;
                } else {
                  lj.field_q = vd.field_y;
                  pe.field_pb = 0;
                  ng.field_l = h.field_b;
                  fa.field_c = param1;
                  vd.field_y = -1;
                  h.field_b = -1;
                  if (il.field_n) {
                    L44: {
                      if (oh.field_E == pe.field_pb) {
                        il.field_n = false;
                        pe.field_pb = 0;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          fa.field_c = param1;
          vd.field_y = -1;
          h.field_b = -1;
          if (il.field_n) {
            L45: {
              if (oh.field_E == pe.field_pb) {
                il.field_n = false;
                pe.field_pb = 0;
                break L45;
              } else {
                break L45;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          field_d = -5;
          pe.field_pb = pe.field_pb + 1;
          if ((h.field_b ^ -1) == 0) {
            L46: {
              if (vd.field_y == -1) {
                h.field_b = nk.field_w;
                vd.field_y = gb.field_e;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (param1 != null) {
                if (!param1.equals((Object) (Object) fa.field_c)) {
                  L48: {
                    if (!il.field_n) {
                      if (pe.field_pb >= ch.field_f) {
                        if (od.field_o + ch.field_f > pe.field_pb) {
                          stackOut_77_0 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          break L48;
                        } else {
                          stackOut_76_0 = 0;
                          stackIn_79_0 = stackOut_76_0;
                          break L48;
                        }
                      } else {
                        stackOut_74_0 = 0;
                        stackIn_79_0 = stackOut_74_0;
                        break L48;
                      }
                    } else {
                      stackOut_72_0 = 0;
                      stackIn_79_0 = stackOut_72_0;
                      break L48;
                    }
                  }
                  L49: {
                    var2 = stackIn_79_0;
                    if (param1 != null) {
                      if (il.field_n) {
                        pe.field_pb = ch.field_f;
                        break L49;
                      } else {
                        if (var2 != 0) {
                          pe.field_pb = ch.field_f;
                          break L49;
                        } else {
                          pe.field_pb = 0;
                          break L49;
                        }
                      }
                    } else {
                      pe.field_pb = 0;
                      break L49;
                    }
                  }
                  L50: {
                    lj.field_q = vd.field_y;
                    ng.field_l = h.field_b;
                    if (param1 != null) {
                      il.field_n = false;
                      break L50;
                    } else {
                      if (var2 == 0) {
                        break L50;
                      } else {
                        il.field_n = true;
                        break L50;
                      }
                    }
                  }
                  L51: {
                    if (il.field_n) {
                      break L51;
                    } else {
                      if (ch.field_f <= pe.field_pb) {
                        break L51;
                      } else {
                        if (!k.field_i) {
                          break L51;
                        } else {
                          lj.field_q = vd.field_y;
                          pe.field_pb = 0;
                          ng.field_l = h.field_b;
                          break L51;
                        }
                      }
                    }
                  }
                  L52: {
                    fa.field_c = param1;
                    vd.field_y = -1;
                    h.field_b = -1;
                    if (!il.field_n) {
                      break L52;
                    } else {
                      if (oh.field_E != pe.field_pb) {
                        break L52;
                      } else {
                        if (il.field_n) {
                          break L47;
                        } else {
                          if (ch.field_f <= pe.field_pb) {
                            break L47;
                          } else {
                            if (!k.field_i) {
                              break L47;
                            } else {
                              lj.field_q = vd.field_y;
                              pe.field_pb = 0;
                              ng.field_l = h.field_b;
                              break L47;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  if (il.field_n) {
                    break L47;
                  } else {
                    if (ch.field_f <= pe.field_pb) {
                      break L47;
                    } else {
                      if (!k.field_i) {
                        break L47;
                      } else {
                        lj.field_q = vd.field_y;
                        pe.field_pb = 0;
                        ng.field_l = h.field_b;
                        break L47;
                      }
                    }
                  }
                }
              } else {
                if (null != fa.field_c) {
                  if (il.field_n) {
                    break L47;
                  } else {
                    if (ch.field_f > pe.field_pb) {
                      if (!k.field_i) {
                        break L47;
                      } else {
                        lj.field_q = vd.field_y;
                        pe.field_pb = 0;
                        ng.field_l = h.field_b;
                        break L47;
                      }
                    } else {
                      if (il.field_n) {
                        break L47;
                      } else {
                        if (ch.field_f <= pe.field_pb) {
                          break L47;
                        } else {
                          if (!k.field_i) {
                            break L47;
                          } else {
                            lj.field_q = vd.field_y;
                            pe.field_pb = 0;
                            ng.field_l = h.field_b;
                            break L47;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (il.field_n) {
                    break L47;
                  } else {
                    if (ch.field_f > pe.field_pb) {
                      if (!k.field_i) {
                        break L47;
                      } else {
                        lj.field_q = vd.field_y;
                        pe.field_pb = 0;
                        ng.field_l = h.field_b;
                        break L47;
                      }
                    } else {
                      if (il.field_n) {
                        break L47;
                      } else {
                        if (ch.field_f <= pe.field_pb) {
                          break L47;
                        } else {
                          if (!k.field_i) {
                            break L47;
                          } else {
                            lj.field_q = vd.field_y;
                            pe.field_pb = 0;
                            ng.field_l = h.field_b;
                            break L47;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            fa.field_c = param1;
            vd.field_y = -1;
            h.field_b = -1;
            if (!il.field_n) {
              return;
            } else {
              L53: {
                if (oh.field_E == pe.field_pb) {
                  il.field_n = false;
                  pe.field_pb = 0;
                  break L53;
                } else {
                  break L53;
                }
              }
              return;
            }
          } else {
            L54: {
              L55: {
                L56: {
                  if (param1 != null) {
                    if (!param1.equals((Object) (Object) fa.field_c)) {
                      break L56;
                    } else {
                      break L55;
                    }
                  } else {
                    if (null == fa.field_c) {
                      break L56;
                    } else {
                      if (il.field_n) {
                        break L54;
                      } else {
                        if (ch.field_f <= pe.field_pb) {
                          break L54;
                        } else {
                          if (!k.field_i) {
                            break L54;
                          } else {
                            lj.field_q = vd.field_y;
                            pe.field_pb = 0;
                            ng.field_l = h.field_b;
                            break L54;
                          }
                        }
                      }
                    }
                  }
                }
                L57: {
                  if (!il.field_n) {
                    if (pe.field_pb >= ch.field_f) {
                      if (od.field_o + ch.field_f > pe.field_pb) {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L57;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_19_0 = stackOut_16_0;
                        break L57;
                      }
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_19_0 = stackOut_14_0;
                      break L57;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_19_0 = stackOut_12_0;
                    break L57;
                  }
                }
                L58: {
                  var2 = stackIn_19_0;
                  if (param1 != null) {
                    L59: {
                      if (il.field_n) {
                        break L59;
                      } else {
                        if (var2 != 0) {
                          break L59;
                        } else {
                          pe.field_pb = 0;
                          break L58;
                        }
                      }
                    }
                    pe.field_pb = ch.field_f;
                    break L58;
                  } else {
                    pe.field_pb = 0;
                    break L58;
                  }
                }
                lj.field_q = vd.field_y;
                ng.field_l = h.field_b;
                if (param1 != null) {
                  il.field_n = false;
                  break L55;
                } else {
                  if (var2 != 0) {
                    il.field_n = true;
                    break L55;
                  } else {
                    if (il.field_n) {
                      break L54;
                    } else {
                      if (ch.field_f <= pe.field_pb) {
                        break L54;
                      } else {
                        if (!k.field_i) {
                          break L54;
                        } else {
                          lj.field_q = vd.field_y;
                          pe.field_pb = 0;
                          ng.field_l = h.field_b;
                          break L54;
                        }
                      }
                    }
                  }
                }
              }
              if (il.field_n) {
                break L54;
              } else {
                if (ch.field_f <= pe.field_pb) {
                  break L54;
                } else {
                  if (!k.field_i) {
                    break L54;
                  } else {
                    lj.field_q = vd.field_y;
                    pe.field_pb = 0;
                    ng.field_l = h.field_b;
                    break L54;
                  }
                }
              }
            }
            L60: {
              fa.field_c = param1;
              vd.field_y = -1;
              h.field_b = -1;
              if (!il.field_n) {
                break L60;
              } else {
                if (oh.field_E == pe.field_pb) {
                  il.field_n = false;
                  pe.field_pb = 0;
                  break L60;
                } else {
                  break L60;
                }
              }
            }
            return;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        tl.field_m = 0;
        mb.field_c = null;
        if (param1 < -44) {
          em.field_B = null;
          var2 = kb.field_a;
          kb.field_a = sc.field_c;
          sc.field_c = var2;
          if ((param0 ^ -1) == -52) {
            aj.field_c.field_j = 2;
            aj.field_c.field_o = aj.field_c.field_o + 1;
            if (2 > aj.field_c.field_o) {
              if (aj.field_c.field_o < 2) {
                if (-5 > aj.field_c.field_o) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (-5 < aj.field_c.field_o) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (51 == param0) {
                return 2;
              } else {
                if (aj.field_c.field_o < 2) {
                  if (-5 > aj.field_c.field_o) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (-5 < aj.field_c.field_o) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            if ((param0 ^ -1) == -51) {
              aj.field_c.field_j = 5;
              aj.field_c.field_o = aj.field_c.field_o + 1;
              if (2 > aj.field_c.field_o) {
                if (aj.field_c.field_o < 2) {
                  if (-5 > aj.field_c.field_o) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (-5 < aj.field_c.field_o) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (51 != param0) {
                  if (aj.field_c.field_o < 2) {
                    if (-5 <= aj.field_c.field_o) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (50 != param0) {
                      if (-5 >= aj.field_c.field_o) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              }
            } else {
              aj.field_c.field_j = 1;
              aj.field_c.field_o = aj.field_c.field_o + 1;
              if (2 > aj.field_c.field_o) {
                if (aj.field_c.field_o < 2) {
                  if (-5 >= (aj.field_c.field_o ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (-5 <= aj.field_c.field_o) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                if (51 != param0) {
                  L0: {
                    if (aj.field_c.field_o < 2) {
                      break L0;
                    } else {
                      if (50 == param0) {
                        return 5;
                      } else {
                        break L0;
                      }
                    }
                  }
                  if (-5 >= aj.field_c.field_o) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          }
        } else {
          L1: {
            field_f = 31;
            em.field_B = null;
            var2 = kb.field_a;
            kb.field_a = sc.field_c;
            sc.field_c = var2;
            if ((param0 ^ -1) == -52) {
              aj.field_c.field_j = 2;
              break L1;
            } else {
              if ((param0 ^ -1) == -51) {
                aj.field_c.field_j = 5;
                break L1;
              } else {
                aj.field_c.field_j = 1;
                break L1;
              }
            }
          }
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 <= aj.field_c.field_o) {
            if (51 == param0) {
              return 2;
            } else {
              if (aj.field_c.field_o >= 2) {
                if (50 == param0) {
                  return 5;
                } else {
                  if (-5 <= aj.field_c.field_o) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                if (-5 >= aj.field_c.field_o) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            L2: {
              if (aj.field_c.field_o < 2) {
                break L2;
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  break L2;
                }
              }
            }
            if (-5 >= (aj.field_c.field_o ^ -1)) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    tg(int param0) {
        int var2 = 0;
        pi var3 = null;
        ((tg) this).field_h = 0;
        ((tg) this).field_b = new pi[param0];
        ((tg) this).field_a = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            pi dupTemp$2 = new pi();
            var3 = dupTemp$2;
            ((tg) this).field_b[var2] = dupTemp$2;
            var3.field_f = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final pi a(boolean param0) {
        int var3 = 0;
        Object var4 = null;
        pi var5 = null;
        pi var6 = null;
        pi var18 = null;
        pi var19 = null;
        pi var23 = null;
        pi var32 = null;
        var3 = MinerDisturbance.field_ab;
        if (-1 > (((tg) this).field_h ^ -1)) {
          if (((tg) this).field_b[-1 + ((tg) this).field_h] == ((tg) this).field_e) {
            if (!param0) {
              var4 = null;
              ((tg) this).a(-99, -121L, (pi) null);
              L0: while (true) {
                if (((tg) this).field_a > ((tg) this).field_h) {
                  int fieldTemp$4 = ((tg) this).field_h;
                  ((tg) this).field_h = ((tg) this).field_h + 1;
                  var5 = ((tg) this).field_b[fieldTemp$4].field_f;
                  var23 = var5;
                  if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                    continue L0;
                  } else {
                    ((tg) this).field_e = var23.field_f;
                    return var23;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L1: while (true) {
                if (((tg) this).field_a > ((tg) this).field_h) {
                  int fieldTemp$5 = ((tg) this).field_h;
                  ((tg) this).field_h = ((tg) this).field_h + 1;
                  var5 = ((tg) this).field_b[fieldTemp$5].field_f;
                  var19 = var5;
                  if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                    continue L1;
                  } else {
                    ((tg) this).field_e = var19.field_f;
                    return var19;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var32 = ((tg) this).field_e;
            ((tg) this).field_e = var32.field_f;
            return var32;
          }
        } else {
          if (param0) {
            L2: while (true) {
              if (((tg) this).field_a > ((tg) this).field_h) {
                int fieldTemp$6 = ((tg) this).field_h;
                ((tg) this).field_h = ((tg) this).field_h + 1;
                var5 = ((tg) this).field_b[fieldTemp$6].field_f;
                var18 = var5;
                if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                  continue L2;
                } else {
                  ((tg) this).field_e = var18.field_f;
                  return var18;
                }
              } else {
                return null;
              }
            }
          } else {
            var4 = null;
            ((tg) this).a(-99, -121L, (pi) null);
            L3: while (true) {
              if (((tg) this).field_a > ((tg) this).field_h) {
                int fieldTemp$7 = ((tg) this).field_h;
                ((tg) this).field_h = ((tg) this).field_h + 1;
                var5 = ((tg) this).field_b[fieldTemp$7].field_f;
                var6 = var5;
                if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                  continue L3;
                } else {
                  ((tg) this).field_e = var6.field_f;
                  return var6;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(int param0, long param1, pi param2) {
        pi var5 = null;
        L0: {
          if (param2.field_c != null) {
            param2.b(34);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((tg) this).field_b[(int)(param1 & (long)(((tg) this).field_a - 1))];
        param2.field_c = var5.field_c;
        param2.field_f = var5;
        param2.field_c.field_f = param2;
        if (param0 != 0) {
          pi discarded$2 = ((tg) this).a(true);
          param2.field_f.field_c = param2;
          param2.field_d = param1;
          return;
        } else {
          param2.field_f.field_c = param2;
          param2.field_d = param1;
          return;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 > -108) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(nn.a(118, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        bc.a(50, -20451);
    }
}
