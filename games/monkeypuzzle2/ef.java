/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_b;
    static String field_a;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_177_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_170_0 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (gk.field_e != -1) {
            break L0;
          } else {
            if ((oi.field_f ^ -1) == 0) {
              gk.field_e = ei.field_a;
              oi.field_f = p.field_a;
              break L0;
            } else {
              ka.field_a = ka.field_a + 1;
              if (param1 != null) {
                if (param1.equals((Object) (Object) pf.field_b)) {
                  L1: {
                    if (ac.field_b) {
                      break L1;
                    } else {
                      if (cj.field_e <= ka.field_a) {
                        break L1;
                      } else {
                        if (oe.field_d) {
                          ka.field_a = 0;
                          nj.field_a = oi.field_f;
                          oa.field_G = gk.field_e;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    pf.field_b = param1;
                    if (param0 > 8) {
                      break L2;
                    } else {
                      ef.a(false);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      gk.field_e = -1;
                      if (!ac.field_b) {
                        break L4;
                      } else {
                        if (ik.field_l != ka.field_a) {
                          break L4;
                        } else {
                          ka.field_a = 0;
                          ac.field_b = false;
                          oi.field_f = -1;
                          break L3;
                        }
                      }
                    }
                    oi.field_f = -1;
                    break L3;
                  }
                  return;
                } else {
                  L5: {
                    if (!ac.field_b) {
                      if (cj.field_e <= ka.field_a) {
                        if (ka.field_a < cj.field_e - -id.field_a) {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L5;
                        } else {
                          stackOut_63_0 = 0;
                          stackIn_66_0 = stackOut_63_0;
                          break L5;
                        }
                      } else {
                        stackOut_61_0 = 0;
                        stackIn_66_0 = stackOut_61_0;
                        break L5;
                      }
                    } else {
                      stackOut_59_0 = 0;
                      stackIn_66_0 = stackOut_59_0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      var2 = stackIn_66_0;
                      if (param1 == null) {
                        break L7;
                      } else {
                        if (ac.field_b) {
                          ka.field_a = cj.field_e;
                          break L6;
                        } else {
                          if (var2 == 0) {
                            break L7;
                          } else {
                            ka.field_a = cj.field_e;
                            break L6;
                          }
                        }
                      }
                    }
                    ka.field_a = 0;
                    break L6;
                  }
                  L8: {
                    if (param1 != null) {
                      ac.field_b = false;
                      oa.field_G = gk.field_e;
                      nj.field_a = oi.field_f;
                      break L8;
                    } else {
                      if (var2 == 0) {
                        oa.field_G = gk.field_e;
                        nj.field_a = oi.field_f;
                        break L8;
                      } else {
                        ac.field_b = true;
                        oa.field_G = gk.field_e;
                        nj.field_a = oi.field_f;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (ac.field_b) {
                      break L9;
                    } else {
                      if (cj.field_e <= ka.field_a) {
                        break L9;
                      } else {
                        if (oe.field_d) {
                          ka.field_a = 0;
                          nj.field_a = oi.field_f;
                          oa.field_G = gk.field_e;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    pf.field_b = param1;
                    if (param0 > 8) {
                      break L10;
                    } else {
                      ef.a(false);
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      gk.field_e = -1;
                      if (!ac.field_b) {
                        break L12;
                      } else {
                        if (ik.field_l != ka.field_a) {
                          break L12;
                        } else {
                          ka.field_a = 0;
                          ac.field_b = false;
                          oi.field_f = -1;
                          break L11;
                        }
                      }
                    }
                    oi.field_f = -1;
                    break L11;
                  }
                  return;
                }
              } else {
                if (null != pf.field_b) {
                  L13: {
                    if (ac.field_b) {
                      break L13;
                    } else {
                      if (cj.field_e <= ka.field_a) {
                        break L13;
                      } else {
                        if (oe.field_d) {
                          ka.field_a = 0;
                          nj.field_a = oi.field_f;
                          oa.field_G = gk.field_e;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  L14: {
                    pf.field_b = param1;
                    if (param0 > 8) {
                      break L14;
                    } else {
                      ef.a(false);
                      break L14;
                    }
                  }
                  L15: {
                    gk.field_e = -1;
                    if (ac.field_b) {
                      if (ik.field_l == ka.field_a) {
                        ka.field_a = 0;
                        ac.field_b = false;
                        oi.field_f = -1;
                        break L15;
                      } else {
                        oi.field_f = -1;
                        break L15;
                      }
                    } else {
                      oi.field_f = -1;
                      break L15;
                    }
                  }
                  return;
                } else {
                  L16: {
                    if (!ac.field_b) {
                      if (cj.field_e <= ka.field_a) {
                        if (ka.field_a < cj.field_e - -id.field_a) {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L16;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_12_0 = stackOut_9_0;
                          break L16;
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_12_0 = stackOut_7_0;
                        break L16;
                      }
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_12_0 = stackOut_5_0;
                      break L16;
                    }
                  }
                  L17: {
                    var2 = stackIn_12_0;
                    if (param1 != null) {
                      L18: {
                        if (ac.field_b) {
                          break L18;
                        } else {
                          if (var2 != 0) {
                            break L18;
                          } else {
                            ka.field_a = 0;
                            break L17;
                          }
                        }
                      }
                      ka.field_a = cj.field_e;
                      break L17;
                    } else {
                      ka.field_a = 0;
                      break L17;
                    }
                  }
                  L19: {
                    if (param1 != null) {
                      ac.field_b = false;
                      oa.field_G = gk.field_e;
                      nj.field_a = oi.field_f;
                      break L19;
                    } else {
                      if (var2 == 0) {
                        oa.field_G = gk.field_e;
                        nj.field_a = oi.field_f;
                        break L19;
                      } else {
                        ac.field_b = true;
                        oa.field_G = gk.field_e;
                        nj.field_a = oi.field_f;
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (ac.field_b) {
                      break L20;
                    } else {
                      if (cj.field_e <= ka.field_a) {
                        break L20;
                      } else {
                        if (oe.field_d) {
                          ka.field_a = 0;
                          nj.field_a = oi.field_f;
                          oa.field_G = gk.field_e;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                  L21: {
                    pf.field_b = param1;
                    if (param0 > 8) {
                      break L21;
                    } else {
                      ef.a(false);
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      gk.field_e = -1;
                      if (!ac.field_b) {
                        break L23;
                      } else {
                        if (ik.field_l != ka.field_a) {
                          break L23;
                        } else {
                          ka.field_a = 0;
                          ac.field_b = false;
                          oi.field_f = -1;
                          break L22;
                        }
                      }
                    }
                    oi.field_f = -1;
                    break L22;
                  }
                  return;
                }
              }
            }
          }
        }
        L24: {
          ka.field_a = ka.field_a + 1;
          if (param1 != null) {
            if (!param1.equals((Object) (Object) pf.field_b)) {
              break L24;
            } else {
              L25: {
                if (ac.field_b) {
                  break L25;
                } else {
                  if (cj.field_e <= ka.field_a) {
                    break L25;
                  } else {
                    if (oe.field_d) {
                      ka.field_a = 0;
                      nj.field_a = oi.field_f;
                      oa.field_G = gk.field_e;
                      break L25;
                    } else {
                      pf.field_b = param1;
                      if (param0 > 8) {
                        gk.field_e = -1;
                        if (ac.field_b) {
                          if (ik.field_l != ka.field_a) {
                            oi.field_f = -1;
                            return;
                          } else {
                            ka.field_a = 0;
                            ac.field_b = false;
                            oi.field_f = -1;
                            return;
                          }
                        } else {
                          oi.field_f = -1;
                          return;
                        }
                      } else {
                        L26: {
                          ef.a(false);
                          gk.field_e = -1;
                          if (!ac.field_b) {
                            break L26;
                          } else {
                            if (ik.field_l != ka.field_a) {
                              break L26;
                            } else {
                              ka.field_a = 0;
                              ac.field_b = false;
                              break L26;
                            }
                          }
                        }
                        oi.field_f = -1;
                        return;
                      }
                    }
                  }
                }
              }
              pf.field_b = param1;
              if (param0 > 8) {
                gk.field_e = -1;
                if (ac.field_b) {
                  if (ik.field_l != ka.field_a) {
                    oi.field_f = -1;
                    return;
                  } else {
                    ka.field_a = 0;
                    ac.field_b = false;
                    oi.field_f = -1;
                    return;
                  }
                } else {
                  oi.field_f = -1;
                  return;
                }
              } else {
                ef.a(false);
                gk.field_e = -1;
                if (ac.field_b) {
                  if (ik.field_l == ka.field_a) {
                    ka.field_a = 0;
                    ac.field_b = false;
                    oi.field_f = -1;
                    return;
                  } else {
                    oi.field_f = -1;
                    return;
                  }
                } else {
                  oi.field_f = -1;
                  return;
                }
              }
            }
          } else {
            if (null == pf.field_b) {
              break L24;
            } else {
              L27: {
                if (ac.field_b) {
                  break L27;
                } else {
                  if (cj.field_e <= ka.field_a) {
                    break L27;
                  } else {
                    if (oe.field_d) {
                      ka.field_a = 0;
                      nj.field_a = oi.field_f;
                      oa.field_G = gk.field_e;
                      break L27;
                    } else {
                      pf.field_b = param1;
                      if (param0 > 8) {
                        gk.field_e = -1;
                        if (ac.field_b) {
                          if (ik.field_l == ka.field_a) {
                            ka.field_a = 0;
                            ac.field_b = false;
                            oi.field_f = -1;
                            return;
                          } else {
                            oi.field_f = -1;
                            return;
                          }
                        } else {
                          oi.field_f = -1;
                          return;
                        }
                      } else {
                        L28: {
                          ef.a(false);
                          gk.field_e = -1;
                          if (!ac.field_b) {
                            break L28;
                          } else {
                            if (ik.field_l != ka.field_a) {
                              break L28;
                            } else {
                              ka.field_a = 0;
                              ac.field_b = false;
                              break L28;
                            }
                          }
                        }
                        oi.field_f = -1;
                        return;
                      }
                    }
                  }
                }
              }
              pf.field_b = param1;
              if (param0 > 8) {
                gk.field_e = -1;
                if (ac.field_b) {
                  if (ik.field_l == ka.field_a) {
                    ka.field_a = 0;
                    ac.field_b = false;
                    oi.field_f = -1;
                    return;
                  } else {
                    oi.field_f = -1;
                    return;
                  }
                } else {
                  oi.field_f = -1;
                  return;
                }
              } else {
                ef.a(false);
                gk.field_e = -1;
                if (ac.field_b) {
                  if (ik.field_l == ka.field_a) {
                    ka.field_a = 0;
                    ac.field_b = false;
                    oi.field_f = -1;
                    return;
                  } else {
                    oi.field_f = -1;
                    return;
                  }
                } else {
                  oi.field_f = -1;
                  return;
                }
              }
            }
          }
        }
        L29: {
          if (!ac.field_b) {
            if (cj.field_e <= ka.field_a) {
              if (ka.field_a < cj.field_e - -id.field_a) {
                stackOut_175_0 = 1;
                stackIn_177_0 = stackOut_175_0;
                break L29;
              } else {
                stackOut_174_0 = 0;
                stackIn_177_0 = stackOut_174_0;
                break L29;
              }
            } else {
              stackOut_172_0 = 0;
              stackIn_177_0 = stackOut_172_0;
              break L29;
            }
          } else {
            stackOut_170_0 = 0;
            stackIn_177_0 = stackOut_170_0;
            break L29;
          }
        }
        L30: {
          L31: {
            var2 = stackIn_177_0;
            if (param1 == null) {
              break L31;
            } else {
              if (ac.field_b) {
                ka.field_a = cj.field_e;
                break L30;
              } else {
                if (var2 == 0) {
                  break L31;
                } else {
                  ka.field_a = cj.field_e;
                  break L30;
                }
              }
            }
          }
          ka.field_a = 0;
          break L30;
        }
        if (param1 != null) {
          ac.field_b = false;
          L32: {
            oa.field_G = gk.field_e;
            nj.field_a = oi.field_f;
            if (ac.field_b) {
              break L32;
            } else {
              if (cj.field_e <= ka.field_a) {
                break L32;
              } else {
                if (oe.field_d) {
                  ka.field_a = 0;
                  nj.field_a = oi.field_f;
                  oa.field_G = gk.field_e;
                  break L32;
                } else {
                  L33: {
                    pf.field_b = param1;
                    if (param0 > 8) {
                      break L33;
                    } else {
                      ef.a(false);
                      break L33;
                    }
                  }
                  L34: {
                    gk.field_e = -1;
                    if (!ac.field_b) {
                      break L34;
                    } else {
                      if (ik.field_l != ka.field_a) {
                        break L34;
                      } else {
                        ka.field_a = 0;
                        ac.field_b = false;
                        break L34;
                      }
                    }
                  }
                  oi.field_f = -1;
                  return;
                }
              }
            }
          }
          pf.field_b = param1;
          if (param0 > 8) {
            L35: {
              gk.field_e = -1;
              if (!ac.field_b) {
                break L35;
              } else {
                if (ik.field_l != ka.field_a) {
                  break L35;
                } else {
                  ka.field_a = 0;
                  ac.field_b = false;
                  oi.field_f = -1;
                  return;
                }
              }
            }
            oi.field_f = -1;
            return;
          } else {
            L36: {
              ef.a(false);
              gk.field_e = -1;
              if (!ac.field_b) {
                break L36;
              } else {
                if (ik.field_l != ka.field_a) {
                  break L36;
                } else {
                  ka.field_a = 0;
                  ac.field_b = false;
                  break L36;
                }
              }
            }
            oi.field_f = -1;
            return;
          }
        } else {
          if (var2 == 0) {
            L37: {
              oa.field_G = gk.field_e;
              nj.field_a = oi.field_f;
              if (ac.field_b) {
                break L37;
              } else {
                if (cj.field_e <= ka.field_a) {
                  break L37;
                } else {
                  if (oe.field_d) {
                    ka.field_a = 0;
                    nj.field_a = oi.field_f;
                    oa.field_G = gk.field_e;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
            }
            L38: {
              pf.field_b = param1;
              if (param0 > 8) {
                break L38;
              } else {
                ef.a(false);
                break L38;
              }
            }
            L39: {
              gk.field_e = -1;
              if (!ac.field_b) {
                break L39;
              } else {
                if (ik.field_l != ka.field_a) {
                  break L39;
                } else {
                  ka.field_a = 0;
                  ac.field_b = false;
                  break L39;
                }
              }
            }
            oi.field_f = -1;
            return;
          } else {
            ac.field_b = true;
            L40: {
              oa.field_G = gk.field_e;
              nj.field_a = oi.field_f;
              if (ac.field_b) {
                break L40;
              } else {
                if (cj.field_e <= ka.field_a) {
                  break L40;
                } else {
                  if (oe.field_d) {
                    ka.field_a = 0;
                    nj.field_a = oi.field_f;
                    oa.field_G = gk.field_e;
                    break L40;
                  } else {
                    break L40;
                  }
                }
              }
            }
            L41: {
              pf.field_b = param1;
              if (param0 > 8) {
                break L41;
              } else {
                ef.a(false);
                break L41;
              }
            }
            L42: {
              gk.field_e = -1;
              if (!ac.field_b) {
                break L42;
              } else {
                if (ik.field_l != ka.field_a) {
                  break L42;
                } else {
                  ka.field_a = 0;
                  ac.field_b = false;
                  break L42;
                }
              }
            }
            oi.field_f = -1;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_b = -19;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Email:";
    }
}
