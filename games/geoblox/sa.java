/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends RuntimeException {
    static int field_b;
    Throwable field_a;
    String field_d;
    static double field_c;

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_178_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var3 = Geoblox.field_C;
        if (-1 == k.field_g) {
          if (gb.field_e != -1) {
            L0: {
              oe.field_V = oe.field_V + 1;
              if (param0 != null) {
                if (!param0.equals((Object) (Object) tc.field_a)) {
                  L1: {
                    if (!vl.field_q) {
                      if (wg.field_e <= oe.field_V) {
                        if (oe.field_V >= ue.field_j + wg.field_e) {
                          stackOut_176_0 = 0;
                          stackIn_178_0 = stackOut_176_0;
                          break L1;
                        } else {
                          if (vl.field_q) {
                            break L0;
                          } else {
                            if (wg.field_e <= oe.field_V) {
                              break L0;
                            } else {
                              if (!wb.field_a) {
                                break L0;
                              } else {
                                oe.field_V = 0;
                                bc.field_a = k.field_g;
                                nj.field_g = gb.field_e;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        stackOut_170_0 = 0;
                        stackIn_178_0 = stackOut_170_0;
                        break L1;
                      }
                    } else {
                      stackOut_168_0 = 0;
                      stackIn_178_0 = stackOut_168_0;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var2 = stackIn_178_0;
                      if (param0 == null) {
                        break L3;
                      } else {
                        if (vl.field_q) {
                          oe.field_V = wg.field_e;
                          break L2;
                        } else {
                          if (var2 == 0) {
                            break L3;
                          } else {
                            oe.field_V = wg.field_e;
                            break L2;
                          }
                        }
                      }
                    }
                    oe.field_V = 0;
                    break L2;
                  }
                  L4: {
                    nj.field_g = gb.field_e;
                    bc.field_a = k.field_g;
                    if (param0 == null) {
                      if (var2 != 0) {
                        vl.field_q = true;
                        break L4;
                      } else {
                        if (vl.field_q) {
                          break L0;
                        } else {
                          if (wg.field_e <= oe.field_V) {
                            break L0;
                          } else {
                            if (!wb.field_a) {
                              break L0;
                            } else {
                              oe.field_V = 0;
                              bc.field_a = k.field_g;
                              nj.field_g = gb.field_e;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      vl.field_q = false;
                      break L4;
                    }
                  }
                  if (vl.field_q) {
                    break L0;
                  } else {
                    if (wg.field_e <= oe.field_V) {
                      break L0;
                    } else {
                      if (!wb.field_a) {
                        break L0;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (vl.field_q) {
                    break L0;
                  } else {
                    if (wg.field_e <= oe.field_V) {
                      break L0;
                    } else {
                      if (!wb.field_a) {
                        break L0;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                if (null != tc.field_a) {
                  if (vl.field_q) {
                    break L0;
                  } else {
                    if (wg.field_e <= oe.field_V) {
                      break L0;
                    } else {
                      if (!wb.field_a) {
                        break L0;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (vl.field_q) {
                    break L0;
                  } else {
                    if (wg.field_e <= oe.field_V) {
                      break L0;
                    } else {
                      if (!wb.field_a) {
                        break L0;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              tc.field_a = param0;
              if (vl.field_q) {
                if (cl.field_a == oe.field_V) {
                  if (!vl.field_q) {
                    if (wg.field_e > oe.field_V) {
                      if (wb.field_a) {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L5;
                      } else {
                        L6: {
                          tc.field_a = param0;
                          if (!vl.field_q) {
                            break L6;
                          } else {
                            if (cl.field_a == oe.field_V) {
                              vl.field_q = false;
                              oe.field_V = 0;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          gb.field_e = -1;
                          k.field_g = -1;
                          if (param1 >= 69) {
                            break L7;
                          } else {
                            String discarded$13 = sa.a(false);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        tc.field_a = param0;
                        if (!vl.field_q) {
                          break L8;
                        } else {
                          if (cl.field_a == oe.field_V) {
                            vl.field_q = false;
                            oe.field_V = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        gb.field_e = -1;
                        k.field_g = -1;
                        if (param1 >= 69) {
                          break L9;
                        } else {
                          String discarded$14 = sa.a(false);
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      tc.field_a = param0;
                      if (!vl.field_q) {
                        break L10;
                      } else {
                        if (cl.field_a == oe.field_V) {
                          vl.field_q = false;
                          oe.field_V = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      gb.field_e = -1;
                      k.field_g = -1;
                      if (param1 >= 69) {
                        break L11;
                      } else {
                        String discarded$15 = sa.a(false);
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    gb.field_e = -1;
                    k.field_g = -1;
                    if (param1 >= 69) {
                      break L12;
                    } else {
                      String discarded$16 = sa.a(false);
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                if (!vl.field_q) {
                  if (wg.field_e > oe.field_V) {
                    if (wb.field_a) {
                      oe.field_V = 0;
                      bc.field_a = k.field_g;
                      nj.field_g = gb.field_e;
                      break L5;
                    } else {
                      L13: {
                        tc.field_a = param0;
                        if (!vl.field_q) {
                          break L13;
                        } else {
                          if (cl.field_a == oe.field_V) {
                            vl.field_q = false;
                            oe.field_V = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        gb.field_e = -1;
                        k.field_g = -1;
                        if (param1 >= 69) {
                          break L14;
                        } else {
                          String discarded$17 = sa.a(false);
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L15: {
                      tc.field_a = param0;
                      if (!vl.field_q) {
                        break L15;
                      } else {
                        if (cl.field_a == oe.field_V) {
                          vl.field_q = false;
                          oe.field_V = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      gb.field_e = -1;
                      k.field_g = -1;
                      if (param1 >= 69) {
                        break L16;
                      } else {
                        String discarded$18 = sa.a(false);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    tc.field_a = param0;
                    if (!vl.field_q) {
                      break L17;
                    } else {
                      if (cl.field_a == oe.field_V) {
                        vl.field_q = false;
                        oe.field_V = 0;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    gb.field_e = -1;
                    k.field_g = -1;
                    if (param1 >= 69) {
                      break L18;
                    } else {
                      String discarded$19 = sa.a(false);
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
            L19: {
              tc.field_a = param0;
              if (!vl.field_q) {
                break L19;
              } else {
                if (cl.field_a == oe.field_V) {
                  vl.field_q = false;
                  oe.field_V = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
            }
            L20: {
              gb.field_e = -1;
              k.field_g = -1;
              if (param1 >= 69) {
                break L20;
              } else {
                String discarded$20 = sa.a(false);
                break L20;
              }
            }
            return;
          } else {
            L21: {
              k.field_g = qa.field_a;
              gb.field_e = ue.field_e;
              oe.field_V = oe.field_V + 1;
              if (param0 != null) {
                if (!param0.equals((Object) (Object) tc.field_a)) {
                  L22: {
                    if (!vl.field_q) {
                      if (wg.field_e <= oe.field_V) {
                        if (oe.field_V >= ue.field_j + wg.field_e) {
                          stackOut_118_0 = 0;
                          stackIn_120_0 = stackOut_118_0;
                          break L22;
                        } else {
                          stackOut_117_0 = 1;
                          stackIn_120_0 = stackOut_117_0;
                          break L22;
                        }
                      } else {
                        stackOut_115_0 = 0;
                        stackIn_120_0 = stackOut_115_0;
                        break L22;
                      }
                    } else {
                      stackOut_113_0 = 0;
                      stackIn_120_0 = stackOut_113_0;
                      break L22;
                    }
                  }
                  var2 = stackIn_120_0;
                  if (param0 != null) {
                    L23: {
                      if (vl.field_q) {
                        oe.field_V = wg.field_e;
                        break L23;
                      } else {
                        if (var2 == 0) {
                          oe.field_V = 0;
                          break L23;
                        } else {
                          oe.field_V = wg.field_e;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      nj.field_g = gb.field_e;
                      bc.field_a = k.field_g;
                      if (param0 == null) {
                        if (var2 != 0) {
                          vl.field_q = true;
                          break L24;
                        } else {
                          if (vl.field_q) {
                            break L21;
                          } else {
                            if (wg.field_e <= oe.field_V) {
                              break L21;
                            } else {
                              if (!wb.field_a) {
                                break L21;
                              } else {
                                oe.field_V = 0;
                                bc.field_a = k.field_g;
                                nj.field_g = gb.field_e;
                                break L21;
                              }
                            }
                          }
                        }
                      } else {
                        vl.field_q = false;
                        break L24;
                      }
                    }
                    if (vl.field_q) {
                      break L21;
                    } else {
                      if (wg.field_e <= oe.field_V) {
                        break L21;
                      } else {
                        if (!wb.field_a) {
                          break L21;
                        } else {
                          oe.field_V = 0;
                          bc.field_a = k.field_g;
                          nj.field_g = gb.field_e;
                          break L21;
                        }
                      }
                    }
                  } else {
                    if (vl.field_q) {
                      break L21;
                    } else {
                      if (wg.field_e <= oe.field_V) {
                        break L21;
                      } else {
                        if (!wb.field_a) {
                          break L21;
                        } else {
                          oe.field_V = 0;
                          bc.field_a = k.field_g;
                          nj.field_g = gb.field_e;
                          break L21;
                        }
                      }
                    }
                  }
                } else {
                  if (vl.field_q) {
                    break L21;
                  } else {
                    if (wg.field_e <= oe.field_V) {
                      break L21;
                    } else {
                      if (!wb.field_a) {
                        break L21;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L21;
                      }
                    }
                  }
                }
              } else {
                if (null == tc.field_a) {
                  if (vl.field_q) {
                    break L21;
                  } else {
                    if (wg.field_e > oe.field_V) {
                      if (!wb.field_a) {
                        break L21;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L21;
                      }
                    } else {
                      if (vl.field_q) {
                        break L21;
                      } else {
                        if (wg.field_e <= oe.field_V) {
                          break L21;
                        } else {
                          if (!wb.field_a) {
                            break L21;
                          } else {
                            oe.field_V = 0;
                            bc.field_a = k.field_g;
                            nj.field_g = gb.field_e;
                            break L21;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (vl.field_q) {
                    break L21;
                  } else {
                    if (wg.field_e <= oe.field_V) {
                      break L21;
                    } else {
                      if (!wb.field_a) {
                        break L21;
                      } else {
                        oe.field_V = 0;
                        bc.field_a = k.field_g;
                        nj.field_g = gb.field_e;
                        break L21;
                      }
                    }
                  }
                }
              }
            }
            L25: {
              tc.field_a = param0;
              if (!vl.field_q) {
                break L25;
              } else {
                if (cl.field_a == oe.field_V) {
                  vl.field_q = false;
                  oe.field_V = 0;
                  break L25;
                } else {
                  break L25;
                }
              }
            }
            L26: {
              gb.field_e = -1;
              k.field_g = -1;
              if (param1 >= 69) {
                break L26;
              } else {
                String discarded$21 = sa.a(false);
                break L26;
              }
            }
            return;
          }
        } else {
          oe.field_V = oe.field_V + 1;
          if (param0 != null) {
            if (param0.equals((Object) (Object) tc.field_a)) {
              L27: {
                if (vl.field_q) {
                  break L27;
                } else {
                  if (wg.field_e <= oe.field_V) {
                    break L27;
                  } else {
                    if (!wb.field_a) {
                      break L27;
                    } else {
                      oe.field_V = 0;
                      bc.field_a = k.field_g;
                      nj.field_g = gb.field_e;
                      break L27;
                    }
                  }
                }
              }
              L28: {
                tc.field_a = param0;
                if (!vl.field_q) {
                  break L28;
                } else {
                  if (cl.field_a == oe.field_V) {
                    vl.field_q = false;
                    oe.field_V = 0;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                gb.field_e = -1;
                k.field_g = -1;
                if (param1 >= 69) {
                  break L29;
                } else {
                  String discarded$22 = sa.a(false);
                  break L29;
                }
              }
              return;
            } else {
              L30: {
                if (!vl.field_q) {
                  if (wg.field_e <= oe.field_V) {
                    if (oe.field_V < ue.field_j + wg.field_e) {
                      stackOut_53_0 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      break L30;
                    } else {
                      stackOut_52_0 = 0;
                      stackIn_55_0 = stackOut_52_0;
                      break L30;
                    }
                  } else {
                    stackOut_50_0 = 0;
                    stackIn_55_0 = stackOut_50_0;
                    break L30;
                  }
                } else {
                  stackOut_48_0 = 0;
                  stackIn_55_0 = stackOut_48_0;
                  break L30;
                }
              }
              L31: {
                var2 = stackIn_55_0;
                if (param0 != null) {
                  if (vl.field_q) {
                    oe.field_V = wg.field_e;
                    break L31;
                  } else {
                    if (var2 != 0) {
                      oe.field_V = wg.field_e;
                      break L31;
                    } else {
                      oe.field_V = 0;
                      break L31;
                    }
                  }
                } else {
                  oe.field_V = 0;
                  break L31;
                }
              }
              L32: {
                nj.field_g = gb.field_e;
                bc.field_a = k.field_g;
                if (param0 == null) {
                  if (var2 == 0) {
                    break L32;
                  } else {
                    vl.field_q = true;
                    break L32;
                  }
                } else {
                  vl.field_q = false;
                  break L32;
                }
              }
              L33: {
                if (vl.field_q) {
                  break L33;
                } else {
                  if (wg.field_e <= oe.field_V) {
                    break L33;
                  } else {
                    if (!wb.field_a) {
                      break L33;
                    } else {
                      oe.field_V = 0;
                      bc.field_a = k.field_g;
                      nj.field_g = gb.field_e;
                      break L33;
                    }
                  }
                }
              }
              L34: {
                tc.field_a = param0;
                if (!vl.field_q) {
                  break L34;
                } else {
                  if (cl.field_a == oe.field_V) {
                    vl.field_q = false;
                    oe.field_V = 0;
                    break L34;
                  } else {
                    break L34;
                  }
                }
              }
              L35: {
                gb.field_e = -1;
                k.field_g = -1;
                if (param1 >= 69) {
                  break L35;
                } else {
                  String discarded$23 = sa.a(false);
                  break L35;
                }
              }
              return;
            }
          } else {
            if (null != tc.field_a) {
              L36: {
                if (vl.field_q) {
                  break L36;
                } else {
                  if (wg.field_e <= oe.field_V) {
                    break L36;
                  } else {
                    if (!wb.field_a) {
                      break L36;
                    } else {
                      oe.field_V = 0;
                      bc.field_a = k.field_g;
                      nj.field_g = gb.field_e;
                      break L36;
                    }
                  }
                }
              }
              L37: {
                tc.field_a = param0;
                if (!vl.field_q) {
                  break L37;
                } else {
                  if (cl.field_a == oe.field_V) {
                    vl.field_q = false;
                    oe.field_V = 0;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
              L38: {
                gb.field_e = -1;
                k.field_g = -1;
                if (param1 >= 69) {
                  break L38;
                } else {
                  String discarded$24 = sa.a(false);
                  break L38;
                }
              }
              return;
            } else {
              L39: {
                if (!vl.field_q) {
                  if (wg.field_e <= oe.field_V) {
                    if (oe.field_V < ue.field_j + wg.field_e) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L39;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L39;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    break L39;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_11_0 = stackOut_4_0;
                  break L39;
                }
              }
              L40: {
                var2 = stackIn_11_0;
                if (param0 != null) {
                  L41: {
                    if (vl.field_q) {
                      break L41;
                    } else {
                      if (var2 != 0) {
                        break L41;
                      } else {
                        oe.field_V = 0;
                        break L40;
                      }
                    }
                  }
                  oe.field_V = wg.field_e;
                  break L40;
                } else {
                  oe.field_V = 0;
                  break L40;
                }
              }
              L42: {
                nj.field_g = gb.field_e;
                bc.field_a = k.field_g;
                if (param0 == null) {
                  if (var2 == 0) {
                    break L42;
                  } else {
                    vl.field_q = true;
                    break L42;
                  }
                } else {
                  vl.field_q = false;
                  break L42;
                }
              }
              L43: {
                if (vl.field_q) {
                  break L43;
                } else {
                  if (wg.field_e <= oe.field_V) {
                    break L43;
                  } else {
                    if (!wb.field_a) {
                      break L43;
                    } else {
                      oe.field_V = 0;
                      bc.field_a = k.field_g;
                      nj.field_g = gb.field_e;
                      break L43;
                    }
                  }
                }
              }
              L44: {
                tc.field_a = param0;
                if (!vl.field_q) {
                  break L44;
                } else {
                  if (cl.field_a == oe.field_V) {
                    vl.field_q = false;
                    oe.field_V = 0;
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
              L45: {
                gb.field_e = -1;
                k.field_g = -1;
                if (param1 >= 69) {
                  break L45;
                } else {
                  String discarded$25 = sa.a(false);
                  break L45;
                }
              }
              return;
            }
          }
        }
    }

    final static void b(boolean param0) {
        int var1 = (int)(201.0f / og.field_r * ij.field_ab + 0.5f);
        kb.field_c = var1;
        if (!param0) {
            field_b = -10;
            return;
        }
    }

    final static String a(boolean param0) {
        if (!param0) {
            return null;
        }
        if (!(kd.field_b != tf.field_d)) {
            return oj.field_a;
        }
        return hg.field_d;
    }

    final static boolean a(d param0, byte param1) {
        if (param1 != 37) {
            field_c = -0.44199917757712387;
            return param0.b(param1 + -26135);
        }
        return param0.b(param1 + -26135);
    }

    sa(Throwable param0, String param1) {
        ((sa) this).field_d = param1;
        ((sa) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
    }
}
