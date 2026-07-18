/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iw {
    static sna field_a;
    static ee[] field_b;

    final static void a(int param0, boolean param1, po param2, po param3) {
        wfa.field_s = param0;
        fp.field_f = param2;
        jk.field_o = param3;
        try {
            iea.a(dg.field_c / 2, dg.field_i / 2, (byte) -98);
            mja.a(param3.field_v, param2.field_v, 3, param3.field_B + param3.field_v, param2.field_v - -param2.field_B);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "iw.D(" + param0 + ',' + false + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (un.field_a == null) {
              break L1;
            } else {
              if (param2 > un.field_a.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          un.field_a = new int[2 * param2];
          break L0;
        }
        if (gk.field_a != null) {
          if (gk.field_a.length < param2) {
            L2: {
              L3: {
                gk.field_a = new int[2 * param2];
                if (mba.field_a == null) {
                  break L3;
                } else {
                  if (param2 <= mba.field_a.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              mba.field_a = new int[param2 * 2];
              break L2;
            }
            L4: {
              L5: {
                if (null == sc.field_o) {
                  break L5;
                } else {
                  if (sc.field_o.length < param2) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              sc.field_o = new int[2 * param2];
              break L4;
            }
            if (uda.field_X == null) {
              L6: {
                L7: {
                  uda.field_X = new int[2 * param2];
                  if (uc.field_k == null) {
                    break L7;
                  } else {
                    if (uc.field_k.length >= param2) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                uc.field_k = new int[param2 * 2];
                break L6;
              }
              if (fn.field_k != null) {
                if (param0 + param2 <= fn.field_k.length) {
                  L8: {
                    L9: {
                      if (null == sr.field_c) {
                        break L9;
                      } else {
                        if (sr.field_c.length < param2) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    sr.field_c = new boolean[param2 * 2];
                    break L8;
                  }
                  ut.field_l = 0;
                  wt.field_u = -2147483648;
                  af.field_c = -2147483648;
                  waa.field_a = 2147483647;
                  mt.field_r = 2147483647;
                  return;
                } else {
                  L10: {
                    L11: {
                      fn.field_k = new int[(param0 + param2) * 2];
                      if (null == sr.field_c) {
                        break L11;
                      } else {
                        if (sr.field_c.length < param2) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    sr.field_c = new boolean[param2 * 2];
                    break L10;
                  }
                  ut.field_l = 0;
                  wt.field_u = -2147483648;
                  af.field_c = -2147483648;
                  waa.field_a = 2147483647;
                  mt.field_r = 2147483647;
                  return;
                }
              } else {
                L12: {
                  L13: {
                    fn.field_k = new int[(param0 + param2) * 2];
                    if (null == sr.field_c) {
                      break L13;
                    } else {
                      if (sr.field_c.length < param2) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  sr.field_c = new boolean[param2 * 2];
                  break L12;
                }
                ut.field_l = 0;
                wt.field_u = -2147483648;
                af.field_c = -2147483648;
                waa.field_a = 2147483647;
                mt.field_r = 2147483647;
                return;
              }
            } else {
              if (param2 <= uda.field_X.length) {
                if (uc.field_k == null) {
                  uc.field_k = new int[param2 * 2];
                  if (fn.field_k != null) {
                    if (param0 + param2 <= fn.field_k.length) {
                      L14: {
                        L15: {
                          if (null == sr.field_c) {
                            break L15;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L14;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    } else {
                      L16: {
                        L17: {
                          fn.field_k = new int[(param0 + param2) * 2];
                          if (null == sr.field_c) {
                            break L17;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L16;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    }
                  } else {
                    L18: {
                      L19: {
                        fn.field_k = new int[(param0 + param2) * 2];
                        if (null == sr.field_c) {
                          break L19;
                        } else {
                          if (sr.field_c.length < param2) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      sr.field_c = new boolean[param2 * 2];
                      break L18;
                    }
                    ut.field_l = 0;
                    wt.field_u = -2147483648;
                    af.field_c = -2147483648;
                    waa.field_a = 2147483647;
                    mt.field_r = 2147483647;
                    return;
                  }
                } else {
                  if (uc.field_k.length >= param2) {
                    if (fn.field_k != null) {
                      if (param0 + param2 > fn.field_k.length) {
                        L20: {
                          L21: {
                            fn.field_k = new int[(param0 + param2) * 2];
                            if (null == sr.field_c) {
                              break L21;
                            } else {
                              if (sr.field_c.length < param2) {
                                break L21;
                              } else {
                                break L20;
                              }
                            }
                          }
                          sr.field_c = new boolean[param2 * 2];
                          break L20;
                        }
                        ut.field_l = 0;
                        wt.field_u = -2147483648;
                        af.field_c = -2147483648;
                        waa.field_a = 2147483647;
                        mt.field_r = 2147483647;
                        return;
                      } else {
                        L22: {
                          L23: {
                            if (null == sr.field_c) {
                              break L23;
                            } else {
                              if (sr.field_c.length < param2) {
                                break L23;
                              } else {
                                break L22;
                              }
                            }
                          }
                          sr.field_c = new boolean[param2 * 2];
                          break L22;
                        }
                        ut.field_l = 0;
                        wt.field_u = -2147483648;
                        af.field_c = -2147483648;
                        waa.field_a = 2147483647;
                        mt.field_r = 2147483647;
                        return;
                      }
                    } else {
                      L24: {
                        L25: {
                          fn.field_k = new int[(param0 + param2) * 2];
                          if (null == sr.field_c) {
                            break L25;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L24;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    }
                  } else {
                    uc.field_k = new int[param2 * 2];
                    if (fn.field_k != null) {
                      if (param0 + param2 <= fn.field_k.length) {
                        L26: {
                          L27: {
                            if (null == sr.field_c) {
                              break L27;
                            } else {
                              if (sr.field_c.length < param2) {
                                break L27;
                              } else {
                                break L26;
                              }
                            }
                          }
                          sr.field_c = new boolean[param2 * 2];
                          break L26;
                        }
                        ut.field_l = 0;
                        wt.field_u = -2147483648;
                        af.field_c = -2147483648;
                        waa.field_a = 2147483647;
                        mt.field_r = 2147483647;
                        return;
                      } else {
                        L28: {
                          L29: {
                            fn.field_k = new int[(param0 + param2) * 2];
                            if (null == sr.field_c) {
                              break L29;
                            } else {
                              if (sr.field_c.length < param2) {
                                break L29;
                              } else {
                                break L28;
                              }
                            }
                          }
                          sr.field_c = new boolean[param2 * 2];
                          break L28;
                        }
                        ut.field_l = 0;
                        wt.field_u = -2147483648;
                        af.field_c = -2147483648;
                        waa.field_a = 2147483647;
                        mt.field_r = 2147483647;
                        return;
                      }
                    } else {
                      L30: {
                        L31: {
                          fn.field_k = new int[(param0 + param2) * 2];
                          if (null == sr.field_c) {
                            break L31;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L31;
                            } else {
                              break L30;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L30;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    }
                  }
                }
              } else {
                L32: {
                  L33: {
                    uda.field_X = new int[2 * param2];
                    if (uc.field_k == null) {
                      break L33;
                    } else {
                      if (uc.field_k.length >= param2) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  uc.field_k = new int[param2 * 2];
                  break L32;
                }
                L34: {
                  L35: {
                    if (fn.field_k == null) {
                      break L35;
                    } else {
                      if (param0 + param2 <= fn.field_k.length) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  fn.field_k = new int[(param0 + param2) * 2];
                  break L34;
                }
                L36: {
                  L37: {
                    if (null == sr.field_c) {
                      break L37;
                    } else {
                      if (sr.field_c.length < param2) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                  sr.field_c = new boolean[param2 * 2];
                  break L36;
                }
                ut.field_l = 0;
                wt.field_u = -2147483648;
                af.field_c = -2147483648;
                waa.field_a = 2147483647;
                mt.field_r = 2147483647;
                return;
              }
            }
          } else {
            L38: {
              L39: {
                if (mba.field_a == null) {
                  break L39;
                } else {
                  if (param2 <= mba.field_a.length) {
                    break L38;
                  } else {
                    break L39;
                  }
                }
              }
              mba.field_a = new int[param2 * 2];
              break L38;
            }
            L40: {
              L41: {
                if (null == sc.field_o) {
                  break L41;
                } else {
                  if (sc.field_o.length < param2) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              sc.field_o = new int[2 * param2];
              break L40;
            }
            if (uda.field_X != null) {
              if (param2 <= uda.field_X.length) {
                if (uc.field_k != null) {
                  if (uc.field_k.length >= param2) {
                    if (fn.field_k != null) {
                      if (param0 + param2 > fn.field_k.length) {
                        L42: {
                          L43: {
                            fn.field_k = new int[(param0 + param2) * 2];
                            if (null == sr.field_c) {
                              break L43;
                            } else {
                              if (sr.field_c.length < param2) {
                                break L43;
                              } else {
                                break L42;
                              }
                            }
                          }
                          sr.field_c = new boolean[param2 * 2];
                          break L42;
                        }
                        ut.field_l = 0;
                        wt.field_u = -2147483648;
                        af.field_c = -2147483648;
                        waa.field_a = 2147483647;
                        mt.field_r = 2147483647;
                        return;
                      } else {
                        L44: {
                          L45: {
                            if (null == sr.field_c) {
                              break L45;
                            } else {
                              if (sr.field_c.length < param2) {
                                break L45;
                              } else {
                                break L44;
                              }
                            }
                          }
                          sr.field_c = new boolean[param2 * 2];
                          break L44;
                        }
                        ut.field_l = 0;
                        wt.field_u = -2147483648;
                        af.field_c = -2147483648;
                        waa.field_a = 2147483647;
                        mt.field_r = 2147483647;
                        return;
                      }
                    } else {
                      L46: {
                        L47: {
                          fn.field_k = new int[(param0 + param2) * 2];
                          if (null == sr.field_c) {
                            break L47;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L47;
                            } else {
                              break L46;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L46;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    }
                  } else {
                    L48: {
                      L49: {
                        uc.field_k = new int[param2 * 2];
                        if (fn.field_k == null) {
                          break L49;
                        } else {
                          if (param0 + param2 <= fn.field_k.length) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      fn.field_k = new int[(param0 + param2) * 2];
                      break L48;
                    }
                    L50: {
                      L51: {
                        if (null == sr.field_c) {
                          break L51;
                        } else {
                          if (sr.field_c.length < param2) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      sr.field_c = new boolean[param2 * 2];
                      break L50;
                    }
                    ut.field_l = 0;
                    wt.field_u = -2147483648;
                    af.field_c = -2147483648;
                    waa.field_a = 2147483647;
                    mt.field_r = 2147483647;
                    return;
                  }
                } else {
                  L52: {
                    L53: {
                      uc.field_k = new int[param2 * 2];
                      if (fn.field_k == null) {
                        break L53;
                      } else {
                        if (param0 + param2 <= fn.field_k.length) {
                          break L52;
                        } else {
                          break L53;
                        }
                      }
                    }
                    fn.field_k = new int[(param0 + param2) * 2];
                    break L52;
                  }
                  L54: {
                    L55: {
                      if (null == sr.field_c) {
                        break L55;
                      } else {
                        if (sr.field_c.length < param2) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    sr.field_c = new boolean[param2 * 2];
                    break L54;
                  }
                  ut.field_l = 0;
                  wt.field_u = -2147483648;
                  af.field_c = -2147483648;
                  waa.field_a = 2147483647;
                  mt.field_r = 2147483647;
                  return;
                }
              } else {
                L56: {
                  L57: {
                    uda.field_X = new int[2 * param2];
                    if (uc.field_k == null) {
                      break L57;
                    } else {
                      if (uc.field_k.length >= param2) {
                        break L56;
                      } else {
                        break L57;
                      }
                    }
                  }
                  uc.field_k = new int[param2 * 2];
                  break L56;
                }
                L58: {
                  L59: {
                    if (fn.field_k == null) {
                      break L59;
                    } else {
                      if (param0 + param2 <= fn.field_k.length) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  fn.field_k = new int[(param0 + param2) * 2];
                  break L58;
                }
                L60: {
                  L61: {
                    if (null == sr.field_c) {
                      break L61;
                    } else {
                      if (sr.field_c.length < param2) {
                        break L61;
                      } else {
                        break L60;
                      }
                    }
                  }
                  sr.field_c = new boolean[param2 * 2];
                  break L60;
                }
                ut.field_l = 0;
                wt.field_u = -2147483648;
                af.field_c = -2147483648;
                waa.field_a = 2147483647;
                mt.field_r = 2147483647;
                return;
              }
            } else {
              L62: {
                L63: {
                  uda.field_X = new int[2 * param2];
                  if (uc.field_k == null) {
                    break L63;
                  } else {
                    if (uc.field_k.length >= param2) {
                      break L62;
                    } else {
                      break L63;
                    }
                  }
                }
                uc.field_k = new int[param2 * 2];
                break L62;
              }
              L64: {
                L65: {
                  if (fn.field_k == null) {
                    break L65;
                  } else {
                    if (param0 + param2 <= fn.field_k.length) {
                      break L64;
                    } else {
                      break L65;
                    }
                  }
                }
                fn.field_k = new int[(param0 + param2) * 2];
                break L64;
              }
              L66: {
                L67: {
                  if (null == sr.field_c) {
                    break L67;
                  } else {
                    if (sr.field_c.length < param2) {
                      break L67;
                    } else {
                      break L66;
                    }
                  }
                }
                sr.field_c = new boolean[param2 * 2];
                break L66;
              }
              ut.field_l = 0;
              wt.field_u = -2147483648;
              af.field_c = -2147483648;
              waa.field_a = 2147483647;
              mt.field_r = 2147483647;
              return;
            }
          }
        } else {
          L68: {
            L69: {
              gk.field_a = new int[2 * param2];
              if (mba.field_a == null) {
                break L69;
              } else {
                if (param2 <= mba.field_a.length) {
                  break L68;
                } else {
                  break L69;
                }
              }
            }
            mba.field_a = new int[param2 * 2];
            break L68;
          }
          L70: {
            L71: {
              if (null == sc.field_o) {
                break L71;
              } else {
                if (sc.field_o.length < param2) {
                  break L71;
                } else {
                  break L70;
                }
              }
            }
            sc.field_o = new int[2 * param2];
            break L70;
          }
          if (uda.field_X != null) {
            if (param2 <= uda.field_X.length) {
              if (uc.field_k != null) {
                if (uc.field_k.length >= param2) {
                  if (fn.field_k != null) {
                    if (param0 + param2 > fn.field_k.length) {
                      L72: {
                        L73: {
                          fn.field_k = new int[(param0 + param2) * 2];
                          if (null == sr.field_c) {
                            break L73;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L73;
                            } else {
                              break L72;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L72;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    } else {
                      L74: {
                        L75: {
                          if (null == sr.field_c) {
                            break L75;
                          } else {
                            if (sr.field_c.length < param2) {
                              break L75;
                            } else {
                              break L74;
                            }
                          }
                        }
                        sr.field_c = new boolean[param2 * 2];
                        break L74;
                      }
                      ut.field_l = 0;
                      wt.field_u = -2147483648;
                      af.field_c = -2147483648;
                      waa.field_a = 2147483647;
                      mt.field_r = 2147483647;
                      return;
                    }
                  } else {
                    L76: {
                      L77: {
                        fn.field_k = new int[(param0 + param2) * 2];
                        if (null == sr.field_c) {
                          break L77;
                        } else {
                          if (sr.field_c.length < param2) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      sr.field_c = new boolean[param2 * 2];
                      break L76;
                    }
                    ut.field_l = 0;
                    wt.field_u = -2147483648;
                    af.field_c = -2147483648;
                    waa.field_a = 2147483647;
                    mt.field_r = 2147483647;
                    return;
                  }
                } else {
                  L78: {
                    L79: {
                      uc.field_k = new int[param2 * 2];
                      if (fn.field_k == null) {
                        break L79;
                      } else {
                        if (param0 + param2 <= fn.field_k.length) {
                          break L78;
                        } else {
                          break L79;
                        }
                      }
                    }
                    fn.field_k = new int[(param0 + param2) * 2];
                    break L78;
                  }
                  L80: {
                    L81: {
                      if (null == sr.field_c) {
                        break L81;
                      } else {
                        if (sr.field_c.length < param2) {
                          break L81;
                        } else {
                          break L80;
                        }
                      }
                    }
                    sr.field_c = new boolean[param2 * 2];
                    break L80;
                  }
                  ut.field_l = 0;
                  wt.field_u = -2147483648;
                  af.field_c = -2147483648;
                  waa.field_a = 2147483647;
                  mt.field_r = 2147483647;
                  return;
                }
              } else {
                L82: {
                  L83: {
                    uc.field_k = new int[param2 * 2];
                    if (fn.field_k == null) {
                      break L83;
                    } else {
                      if (param0 + param2 <= fn.field_k.length) {
                        break L82;
                      } else {
                        break L83;
                      }
                    }
                  }
                  fn.field_k = new int[(param0 + param2) * 2];
                  break L82;
                }
                L84: {
                  L85: {
                    if (null == sr.field_c) {
                      break L85;
                    } else {
                      if (sr.field_c.length < param2) {
                        break L85;
                      } else {
                        break L84;
                      }
                    }
                  }
                  sr.field_c = new boolean[param2 * 2];
                  break L84;
                }
                ut.field_l = 0;
                wt.field_u = -2147483648;
                af.field_c = -2147483648;
                waa.field_a = 2147483647;
                mt.field_r = 2147483647;
                return;
              }
            } else {
              L86: {
                L87: {
                  uda.field_X = new int[2 * param2];
                  if (uc.field_k == null) {
                    break L87;
                  } else {
                    if (uc.field_k.length >= param2) {
                      break L86;
                    } else {
                      break L87;
                    }
                  }
                }
                uc.field_k = new int[param2 * 2];
                break L86;
              }
              L88: {
                L89: {
                  if (fn.field_k == null) {
                    break L89;
                  } else {
                    if (param0 + param2 <= fn.field_k.length) {
                      break L88;
                    } else {
                      break L89;
                    }
                  }
                }
                fn.field_k = new int[(param0 + param2) * 2];
                break L88;
              }
              L90: {
                L91: {
                  if (null == sr.field_c) {
                    break L91;
                  } else {
                    if (sr.field_c.length < param2) {
                      break L91;
                    } else {
                      break L90;
                    }
                  }
                }
                sr.field_c = new boolean[param2 * 2];
                break L90;
              }
              ut.field_l = 0;
              wt.field_u = -2147483648;
              af.field_c = -2147483648;
              waa.field_a = 2147483647;
              mt.field_r = 2147483647;
              return;
            }
          } else {
            L92: {
              L93: {
                uda.field_X = new int[2 * param2];
                if (uc.field_k == null) {
                  break L93;
                } else {
                  if (uc.field_k.length >= param2) {
                    break L92;
                  } else {
                    break L93;
                  }
                }
              }
              uc.field_k = new int[param2 * 2];
              break L92;
            }
            L94: {
              L95: {
                if (fn.field_k == null) {
                  break L95;
                } else {
                  if (param0 + param2 <= fn.field_k.length) {
                    break L94;
                  } else {
                    break L95;
                  }
                }
              }
              fn.field_k = new int[(param0 + param2) * 2];
              break L94;
            }
            L96: {
              L97: {
                if (null == sr.field_c) {
                  break L97;
                } else {
                  if (sr.field_c.length < param2) {
                    break L97;
                  } else {
                    break L96;
                  }
                }
              }
              sr.field_c = new boolean[param2 * 2];
              break L96;
            }
            ut.field_l = 0;
            wt.field_u = -2147483648;
            af.field_c = -2147483648;
            waa.field_a = 2147483647;
            mt.field_r = 2147483647;
            return;
          }
        }
    }

    final static void a(int param0, byte param1) {
        on.field_t = 200;
        kw.field_k = new gs[3000];
        oma.field_a = new int[3];
        qs.field_n = 0;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        return jb.field_p[2047 & param0];
    }

    static {
    }
}
