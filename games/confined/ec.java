/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends RuntimeException {
    static String field_a;
    String field_c;
    static String field_d;
    static long field_e;
    Throwable field_b;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        Object var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (param1 == 3) {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var5 = (CharSequence) (Object) var2;
            if (ra.a(var5, 119) == 0L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = null;
          java.net.URL discarded$2 = ec.a(89, (String) null, (java.net.URL) null, (String) null, 112);
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if (ra.a(var4, 119) == 0L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(jb param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 1;
          if (da.field_e == param0) {
            break L0;
          } else {
            if ((da.field_e.field_e ^ -1) >= -1) {
              break L0;
            } else {
              var2 = var2 != 0 & da.field_e.a(false) ? 1 : 0;
              break L0;
            }
          }
        }
        if (null != hh.field_d) {
          if (hh.field_d != param0) {
            L1: {
              if (0 < hh.field_d.field_e) {
                var2 = var2 != 0 & hh.field_d.a(false) ? 1 : 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == bg.field_a) {
                break L2;
              } else {
                if (param0 == bg.field_a) {
                  break L2;
                } else {
                  if (-1 > (bg.field_a.field_e ^ -1)) {
                    var2 = var2 != 0 & bg.field_a.a(false) ? 1 : 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param1 == 0) {
              L3: {
                if (ji.field_e == null) {
                  break L3;
                } else {
                  if (param0 == ji.field_e) {
                    break L3;
                  } else {
                    if (ji.field_e.field_e > 0) {
                      var2 = var2 != 0 & ji.field_e.a(false) ? 1 : 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (null == va.field_b) {
                  break L4;
                } else {
                  if (va.field_b == param0) {
                    break L4;
                  } else {
                    if (-1 <= (va.field_b.field_e ^ -1)) {
                      break L4;
                    } else {
                      var2 = var2 != 0 & va.field_b.a(false) ? 1 : 0;
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (var2 != 0) {
                  L6: {
                    if (param0 == null) {
                      break L6;
                    } else {
                      if (param0.field_e >= 14) {
                        break L6;
                      } else {
                        L7: {
                          param0.field_e = param0.field_e + 1;
                          if (param0 == null) {
                            break L7;
                          } else {
                            if ((param0.field_e ^ -1) >= -15) {
                              break L7;
                            } else {
                              param0.field_e = param0.field_e - 1;
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (null == bg.field_a) {
                            break L8;
                          } else {
                            if (kc.field_o) {
                              break L8;
                            } else {
                              if (bg.field_a.field_e != 0) {
                                break L8;
                              } else {
                                bg.field_a = null;
                                break L8;
                              }
                            }
                          }
                        }
                        L9: {
                          if (null == ji.field_e) {
                            break L9;
                          } else {
                            if (bj.field_m) {
                              break L9;
                            } else {
                              if (ji.field_e.field_e != 0) {
                                break L9;
                              } else {
                                ji.field_e = null;
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          if (va.field_b == null) {
                            break L10;
                          } else {
                            if (gh.field_k) {
                              break L10;
                            } else {
                              if (va.field_b.field_e != 0) {
                                break L10;
                              } else {
                                va.field_b = null;
                                break L10;
                              }
                            }
                          }
                        }
                        L11: {
                          if (null == hh.field_d) {
                            break L11;
                          } else {
                            if (qf.field_e) {
                              break L11;
                            } else {
                              if (hh.field_d.field_e == 0) {
                                hh.field_d = null;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param0 == null) {
                    break L5;
                  } else {
                    if ((param0.field_e ^ -1) >= -15) {
                      break L5;
                    } else {
                      L12: {
                        param0.field_e = param0.field_e - 1;
                        if (null == bg.field_a) {
                          break L12;
                        } else {
                          if (kc.field_o) {
                            break L12;
                          } else {
                            if (bg.field_a.field_e != 0) {
                              break L12;
                            } else {
                              bg.field_a = null;
                              break L12;
                            }
                          }
                        }
                      }
                      L13: {
                        if (null == ji.field_e) {
                          break L13;
                        } else {
                          if (bj.field_m) {
                            break L13;
                          } else {
                            if (ji.field_e.field_e != 0) {
                              break L13;
                            } else {
                              ji.field_e = null;
                              break L13;
                            }
                          }
                        }
                      }
                      L14: {
                        if (va.field_b == null) {
                          break L14;
                        } else {
                          if (gh.field_k) {
                            break L14;
                          } else {
                            if (va.field_b.field_e != 0) {
                              break L14;
                            } else {
                              va.field_b = null;
                              break L14;
                            }
                          }
                        }
                      }
                      L15: {
                        if (null == hh.field_d) {
                          break L15;
                        } else {
                          if (qf.field_e) {
                            break L15;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  break L5;
                }
              }
              if (null != bg.field_a) {
                if (!kc.field_o) {
                  if (bg.field_a.field_e != 0) {
                    L16: {
                      if (null == ji.field_e) {
                        break L16;
                      } else {
                        if (bj.field_m) {
                          break L16;
                        } else {
                          if (ji.field_e.field_e != 0) {
                            break L16;
                          } else {
                            L17: {
                              ji.field_e = null;
                              if (va.field_b == null) {
                                break L17;
                              } else {
                                if (gh.field_k) {
                                  break L17;
                                } else {
                                  if (va.field_b.field_e != 0) {
                                    break L17;
                                  } else {
                                    L18: {
                                      va.field_b = null;
                                      if (null == hh.field_d) {
                                        break L18;
                                      } else {
                                        if (qf.field_e) {
                                          break L18;
                                        } else {
                                          if (hh.field_d.field_e == 0) {
                                            hh.field_d = null;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                            }
                            L19: {
                              if (null == hh.field_d) {
                                break L19;
                              } else {
                                if (qf.field_e) {
                                  break L19;
                                } else {
                                  if (hh.field_d.field_e == 0) {
                                    hh.field_d = null;
                                    break L19;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    L20: {
                      if (va.field_b == null) {
                        break L20;
                      } else {
                        if (gh.field_k) {
                          break L20;
                        } else {
                          if (va.field_b.field_e != 0) {
                            break L20;
                          } else {
                            L21: {
                              va.field_b = null;
                              if (null == hh.field_d) {
                                break L21;
                              } else {
                                if (qf.field_e) {
                                  break L21;
                                } else {
                                  if (hh.field_d.field_e == 0) {
                                    hh.field_d = null;
                                    break L21;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    L22: {
                      if (null == hh.field_d) {
                        break L22;
                      } else {
                        if (qf.field_e) {
                          break L22;
                        } else {
                          if (hh.field_d.field_e == 0) {
                            hh.field_d = null;
                            break L22;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L23: {
                      bg.field_a = null;
                      if (null == ji.field_e) {
                        break L23;
                      } else {
                        if (bj.field_m) {
                          break L23;
                        } else {
                          if (ji.field_e.field_e != 0) {
                            break L23;
                          } else {
                            L24: {
                              ji.field_e = null;
                              if (va.field_b == null) {
                                break L24;
                              } else {
                                if (gh.field_k) {
                                  break L24;
                                } else {
                                  if (va.field_b.field_e != 0) {
                                    break L24;
                                  } else {
                                    va.field_b = null;
                                    break L24;
                                  }
                                }
                              }
                            }
                            L25: {
                              if (null == hh.field_d) {
                                break L25;
                              } else {
                                if (qf.field_e) {
                                  break L25;
                                } else {
                                  if (hh.field_d.field_e == 0) {
                                    hh.field_d = null;
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    L26: {
                      if (va.field_b == null) {
                        break L26;
                      } else {
                        if (gh.field_k) {
                          break L26;
                        } else {
                          if (va.field_b.field_e != 0) {
                            break L26;
                          } else {
                            L27: {
                              va.field_b = null;
                              if (null == hh.field_d) {
                                break L27;
                              } else {
                                if (qf.field_e) {
                                  break L27;
                                } else {
                                  if (hh.field_d.field_e == 0) {
                                    hh.field_d = null;
                                    break L27;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    L28: {
                      if (null == hh.field_d) {
                        break L28;
                      } else {
                        if (qf.field_e) {
                          break L28;
                        } else {
                          if (hh.field_d.field_e == 0) {
                            hh.field_d = null;
                            break L28;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L29: {
                    if (null == ji.field_e) {
                      break L29;
                    } else {
                      if (bj.field_m) {
                        break L29;
                      } else {
                        if (ji.field_e.field_e != 0) {
                          break L29;
                        } else {
                          L30: {
                            ji.field_e = null;
                            if (va.field_b == null) {
                              break L30;
                            } else {
                              if (gh.field_k) {
                                break L30;
                              } else {
                                if (va.field_b.field_e != 0) {
                                  break L30;
                                } else {
                                  L31: {
                                    va.field_b = null;
                                    if (null == hh.field_d) {
                                      break L31;
                                    } else {
                                      if (qf.field_e) {
                                        break L31;
                                      } else {
                                        if (hh.field_d.field_e == 0) {
                                          hh.field_d = null;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          }
                          L32: {
                            if (null == hh.field_d) {
                              break L32;
                            } else {
                              if (qf.field_e) {
                                break L32;
                              } else {
                                if (hh.field_d.field_e == 0) {
                                  hh.field_d = null;
                                  break L32;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  L33: {
                    if (va.field_b == null) {
                      break L33;
                    } else {
                      if (gh.field_k) {
                        break L33;
                      } else {
                        if (va.field_b.field_e != 0) {
                          break L33;
                        } else {
                          L34: {
                            va.field_b = null;
                            if (null == hh.field_d) {
                              break L34;
                            } else {
                              if (qf.field_e) {
                                break L34;
                              } else {
                                if (hh.field_d.field_e == 0) {
                                  hh.field_d = null;
                                  break L34;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  L35: {
                    if (null == hh.field_d) {
                      break L35;
                    } else {
                      if (qf.field_e) {
                        break L35;
                      } else {
                        if (hh.field_d.field_e == 0) {
                          hh.field_d = null;
                          break L35;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L36: {
                  if (null == ji.field_e) {
                    break L36;
                  } else {
                    if (bj.field_m) {
                      break L36;
                    } else {
                      if (ji.field_e.field_e != 0) {
                        break L36;
                      } else {
                        L37: {
                          ji.field_e = null;
                          if (va.field_b == null) {
                            break L37;
                          } else {
                            if (gh.field_k) {
                              break L37;
                            } else {
                              if (va.field_b.field_e != 0) {
                                break L37;
                              } else {
                                L38: {
                                  va.field_b = null;
                                  if (null == hh.field_d) {
                                    break L38;
                                  } else {
                                    if (qf.field_e) {
                                      break L38;
                                    } else {
                                      if (hh.field_d.field_e == 0) {
                                        hh.field_d = null;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        if (null != hh.field_d) {
                          L39: {
                            if (qf.field_e) {
                              break L39;
                            } else {
                              if (hh.field_d.field_e == 0) {
                                hh.field_d = null;
                                break L39;
                              } else {
                                return;
                              }
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
                L40: {
                  if (va.field_b == null) {
                    break L40;
                  } else {
                    if (gh.field_k) {
                      break L40;
                    } else {
                      if (va.field_b.field_e != 0) {
                        break L40;
                      } else {
                        L41: {
                          va.field_b = null;
                          if (null == hh.field_d) {
                            break L41;
                          } else {
                            if (qf.field_e) {
                              break L41;
                            } else {
                              if (hh.field_d.field_e == 0) {
                                hh.field_d = null;
                                break L41;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L42: {
                  if (null == hh.field_d) {
                    break L42;
                  } else {
                    if (qf.field_e) {
                      break L42;
                    } else {
                      if (hh.field_d.field_e == 0) {
                        hh.field_d = null;
                        break L42;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            L43: {
              if (null == bg.field_a) {
                break L43;
              } else {
                if (param0 == bg.field_a) {
                  break L43;
                } else {
                  if (-1 > (bg.field_a.field_e ^ -1)) {
                    var2 = var2 != 0 & bg.field_a.a(false) ? 1 : 0;
                    break L43;
                  } else {
                    break L43;
                  }
                }
              }
            }
            if (param1 == 0) {
              L44: {
                if (ji.field_e == null) {
                  break L44;
                } else {
                  if (param0 == ji.field_e) {
                    break L44;
                  } else {
                    if (ji.field_e.field_e > 0) {
                      var2 = var2 != 0 & ji.field_e.a(false) ? 1 : 0;
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                }
              }
              L45: {
                if (null == va.field_b) {
                  break L45;
                } else {
                  if (va.field_b == param0) {
                    break L45;
                  } else {
                    if (-1 <= (va.field_b.field_e ^ -1)) {
                      break L45;
                    } else {
                      var2 = var2 != 0 & va.field_b.a(false) ? 1 : 0;
                      break L45;
                    }
                  }
                }
              }
              L46: {
                if (var2 != 0) {
                  L47: {
                    if (param0 == null) {
                      break L47;
                    } else {
                      if (param0.field_e >= 14) {
                        break L47;
                      } else {
                        L48: {
                          param0.field_e = param0.field_e + 1;
                          if (param0 == null) {
                            break L48;
                          } else {
                            if ((param0.field_e ^ -1) >= -15) {
                              break L48;
                            } else {
                              param0.field_e = param0.field_e - 1;
                              break L48;
                            }
                          }
                        }
                        L49: {
                          if (null == bg.field_a) {
                            break L49;
                          } else {
                            if (kc.field_o) {
                              break L49;
                            } else {
                              if (bg.field_a.field_e != 0) {
                                break L49;
                              } else {
                                bg.field_a = null;
                                break L49;
                              }
                            }
                          }
                        }
                        L50: {
                          if (null == ji.field_e) {
                            break L50;
                          } else {
                            if (bj.field_m) {
                              break L50;
                            } else {
                              if (ji.field_e.field_e != 0) {
                                break L50;
                              } else {
                                ji.field_e = null;
                                break L50;
                              }
                            }
                          }
                        }
                        L51: {
                          if (va.field_b == null) {
                            break L51;
                          } else {
                            if (gh.field_k) {
                              break L51;
                            } else {
                              if (va.field_b.field_e != 0) {
                                break L51;
                              } else {
                                va.field_b = null;
                                break L51;
                              }
                            }
                          }
                        }
                        L52: {
                          if (null == hh.field_d) {
                            break L52;
                          } else {
                            if (qf.field_e) {
                              break L52;
                            } else {
                              if (hh.field_d.field_e == 0) {
                                hh.field_d = null;
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param0 == null) {
                    break L46;
                  } else {
                    if ((param0.field_e ^ -1) >= -15) {
                      break L46;
                    } else {
                      L53: {
                        param0.field_e = param0.field_e - 1;
                        if (null == bg.field_a) {
                          break L53;
                        } else {
                          if (kc.field_o) {
                            break L53;
                          } else {
                            if (bg.field_a.field_e != 0) {
                              break L53;
                            } else {
                              bg.field_a = null;
                              break L53;
                            }
                          }
                        }
                      }
                      L54: {
                        if (null == ji.field_e) {
                          break L54;
                        } else {
                          if (bj.field_m) {
                            break L54;
                          } else {
                            if (ji.field_e.field_e != 0) {
                              break L54;
                            } else {
                              ji.field_e = null;
                              break L54;
                            }
                          }
                        }
                      }
                      L55: {
                        if (va.field_b == null) {
                          break L55;
                        } else {
                          if (gh.field_k) {
                            break L55;
                          } else {
                            if (va.field_b.field_e != 0) {
                              break L55;
                            } else {
                              va.field_b = null;
                              break L55;
                            }
                          }
                        }
                      }
                      L56: {
                        if (null == hh.field_d) {
                          break L56;
                        } else {
                          if (qf.field_e) {
                            break L56;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L56;
                            } else {
                              break L56;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  break L46;
                }
              }
              L57: {
                if (null == bg.field_a) {
                  break L57;
                } else {
                  if (kc.field_o) {
                    break L57;
                  } else {
                    if (bg.field_a.field_e != 0) {
                      break L57;
                    } else {
                      L58: {
                        bg.field_a = null;
                        if (null == ji.field_e) {
                          break L58;
                        } else {
                          if (bj.field_m) {
                            break L58;
                          } else {
                            if (ji.field_e.field_e != 0) {
                              break L58;
                            } else {
                              ji.field_e = null;
                              break L58;
                            }
                          }
                        }
                      }
                      L59: {
                        if (va.field_b == null) {
                          break L59;
                        } else {
                          if (gh.field_k) {
                            break L59;
                          } else {
                            if (va.field_b.field_e != 0) {
                              break L59;
                            } else {
                              va.field_b = null;
                              break L59;
                            }
                          }
                        }
                      }
                      L60: {
                        if (null == hh.field_d) {
                          break L60;
                        } else {
                          if (qf.field_e) {
                            break L60;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L61: {
                if (null == ji.field_e) {
                  break L61;
                } else {
                  if (bj.field_m) {
                    break L61;
                  } else {
                    if (ji.field_e.field_e != 0) {
                      break L61;
                    } else {
                      L62: {
                        ji.field_e = null;
                        if (va.field_b == null) {
                          break L62;
                        } else {
                          if (gh.field_k) {
                            break L62;
                          } else {
                            if (va.field_b.field_e != 0) {
                              break L62;
                            } else {
                              va.field_b = null;
                              break L62;
                            }
                          }
                        }
                      }
                      L63: {
                        if (null == hh.field_d) {
                          break L63;
                        } else {
                          if (qf.field_e) {
                            break L63;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L63;
                            } else {
                              break L63;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L64: {
                if (va.field_b == null) {
                  break L64;
                } else {
                  if (gh.field_k) {
                    break L64;
                  } else {
                    if (va.field_b.field_e != 0) {
                      break L64;
                    } else {
                      L65: {
                        va.field_b = null;
                        if (null == hh.field_d) {
                          break L65;
                        } else {
                          if (qf.field_e) {
                            break L65;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (null != hh.field_d) {
                if (!qf.field_e) {
                  if (hh.field_d.field_e != 0) {
                    return;
                  } else {
                    hh.field_d = null;
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
        } else {
          L66: {
            if (null == bg.field_a) {
              break L66;
            } else {
              if (param0 == bg.field_a) {
                break L66;
              } else {
                if (-1 > (bg.field_a.field_e ^ -1)) {
                  var2 = var2 != 0 & bg.field_a.a(false) ? 1 : 0;
                  break L66;
                } else {
                  break L66;
                }
              }
            }
          }
          if (param1 == 0) {
            L67: {
              if (ji.field_e == null) {
                break L67;
              } else {
                if (param0 == ji.field_e) {
                  break L67;
                } else {
                  if (ji.field_e.field_e > 0) {
                    var2 = var2 != 0 & ji.field_e.a(false) ? 1 : 0;
                    break L67;
                  } else {
                    break L67;
                  }
                }
              }
            }
            L68: {
              if (null == va.field_b) {
                break L68;
              } else {
                if (va.field_b == param0) {
                  break L68;
                } else {
                  if (-1 <= (va.field_b.field_e ^ -1)) {
                    break L68;
                  } else {
                    var2 = var2 != 0 & va.field_b.a(false) ? 1 : 0;
                    break L68;
                  }
                }
              }
            }
            L69: {
              L70: {
                if (var2 != 0) {
                  L71: {
                    if (param0 == null) {
                      break L71;
                    } else {
                      if (param0.field_e >= 14) {
                        break L71;
                      } else {
                        L72: {
                          param0.field_e = param0.field_e + 1;
                          if (param0 != null) {
                            if ((param0.field_e ^ -1) < -15) {
                              param0.field_e = param0.field_e - 1;
                              if (null == bg.field_a) {
                                break L72;
                              } else {
                                if (kc.field_o) {
                                  break L72;
                                } else {
                                  if (bg.field_a.field_e != 0) {
                                    break L72;
                                  } else {
                                    bg.field_a = null;
                                    break L72;
                                  }
                                }
                              }
                            } else {
                              if (null == bg.field_a) {
                                break L72;
                              } else {
                                if (kc.field_o) {
                                  break L72;
                                } else {
                                  if (bg.field_a.field_e != 0) {
                                    break L72;
                                  } else {
                                    bg.field_a = null;
                                    break L72;
                                  }
                                }
                              }
                            }
                          } else {
                            if (null == bg.field_a) {
                              break L72;
                            } else {
                              if (kc.field_o) {
                                break L72;
                              } else {
                                if (bg.field_a.field_e != 0) {
                                  break L72;
                                } else {
                                  bg.field_a = null;
                                  break L72;
                                }
                              }
                            }
                          }
                        }
                        L73: {
                          if (null != ji.field_e) {
                            L74: {
                              if (va.field_b != null) {
                                break L74;
                              } else {
                                if (va.field_b == null) {
                                  break L73;
                                } else {
                                  break L74;
                                }
                              }
                            }
                            if (gh.field_k) {
                              break L73;
                            } else {
                              if (va.field_b.field_e != 0) {
                                break L73;
                              } else {
                                va.field_b = null;
                                break L73;
                              }
                            }
                          } else {
                            L75: {
                              if (va.field_b != null) {
                                break L75;
                              } else {
                                break L75;
                              }
                            }
                            if (gh.field_k) {
                              break L73;
                            } else {
                              if (va.field_b.field_e != 0) {
                                break L73;
                              } else {
                                va.field_b = null;
                                break L73;
                              }
                            }
                          }
                        }
                        L76: {
                          if (null == hh.field_d) {
                            break L76;
                          } else {
                            if (qf.field_e) {
                              break L76;
                            } else {
                              if (hh.field_d.field_e == 0) {
                                hh.field_d = null;
                                break L76;
                              } else {
                                break L76;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param0 == null) {
                    break L70;
                  } else {
                    if ((param0.field_e ^ -1) >= -15) {
                      break L70;
                    } else {
                      L77: {
                        param0.field_e = param0.field_e - 1;
                        if (null == bg.field_a) {
                          break L77;
                        } else {
                          if (kc.field_o) {
                            break L77;
                          } else {
                            if (bg.field_a.field_e != 0) {
                              break L77;
                            } else {
                              bg.field_a = null;
                              break L77;
                            }
                          }
                        }
                      }
                      L78: {
                        if (null == ji.field_e) {
                          break L78;
                        } else {
                          if (bj.field_m) {
                            break L78;
                          } else {
                            if (ji.field_e.field_e != 0) {
                              break L78;
                            } else {
                              ji.field_e = null;
                              break L78;
                            }
                          }
                        }
                      }
                      L79: {
                        if (va.field_b == null) {
                          break L79;
                        } else {
                          if (gh.field_k) {
                            break L79;
                          } else {
                            if (va.field_b.field_e != 0) {
                              break L79;
                            } else {
                              va.field_b = null;
                              break L79;
                            }
                          }
                        }
                      }
                      if (null == hh.field_d) {
                        L80: {
                          if (va.field_b != null) {
                            break L80;
                          } else {
                            if (va.field_b != null) {
                              break L80;
                            } else {
                              L81: {
                                if (null == hh.field_d) {
                                  break L81;
                                } else {
                                  if (qf.field_e) {
                                    break L81;
                                  } else {
                                    if (hh.field_d.field_e == 0) {
                                      hh.field_d = null;
                                      break L81;
                                    } else {
                                      break L81;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (!gh.field_k) {
                          if (va.field_b.field_e == 0) {
                            va.field_b = null;
                            break L69;
                          } else {
                            L82: {
                              if (null == hh.field_d) {
                                break L82;
                              } else {
                                if (qf.field_e) {
                                  break L82;
                                } else {
                                  if (hh.field_d.field_e == 0) {
                                    hh.field_d = null;
                                    break L82;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          L83: {
                            if (null == hh.field_d) {
                              break L83;
                            } else {
                              if (qf.field_e) {
                                break L83;
                              } else {
                                if (hh.field_d.field_e == 0) {
                                  hh.field_d = null;
                                  break L83;
                                } else {
                                  break L83;
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L84: {
                          if (va.field_b != null) {
                            break L84;
                          } else {
                            if (va.field_b != null) {
                              break L84;
                            } else {
                              L85: {
                                if (null == hh.field_d) {
                                  break L85;
                                } else {
                                  if (qf.field_e) {
                                    break L85;
                                  } else {
                                    if (hh.field_d.field_e == 0) {
                                      hh.field_d = null;
                                      break L85;
                                    } else {
                                      break L85;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (!gh.field_k) {
                          if (va.field_b.field_e == 0) {
                            va.field_b = null;
                            break L69;
                          } else {
                            L86: {
                              if (null == hh.field_d) {
                                break L86;
                              } else {
                                if (qf.field_e) {
                                  break L86;
                                } else {
                                  if (hh.field_d.field_e == 0) {
                                    hh.field_d = null;
                                    break L86;
                                  } else {
                                    break L86;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          L87: {
                            if (null == hh.field_d) {
                              break L87;
                            } else {
                              if (qf.field_e) {
                                break L87;
                              } else {
                                if (hh.field_d.field_e == 0) {
                                  hh.field_d = null;
                                  break L87;
                                } else {
                                  break L87;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L70;
                }
              }
              L88: {
                if (null == bg.field_a) {
                  break L88;
                } else {
                  if (kc.field_o) {
                    break L88;
                  } else {
                    if (bg.field_a.field_e != 0) {
                      break L88;
                    } else {
                      L89: {
                        bg.field_a = null;
                        if (null == ji.field_e) {
                          break L89;
                        } else {
                          if (bj.field_m) {
                            break L89;
                          } else {
                            if (ji.field_e.field_e != 0) {
                              break L89;
                            } else {
                              ji.field_e = null;
                              break L89;
                            }
                          }
                        }
                      }
                      if (va.field_b == null) {
                        break L69;
                      } else {
                        if (gh.field_k) {
                          break L69;
                        } else {
                          if (va.field_b.field_e != 0) {
                            break L69;
                          } else {
                            va.field_b = null;
                            break L69;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L90: {
                if (null == ji.field_e) {
                  break L90;
                } else {
                  if (bj.field_m) {
                    break L90;
                  } else {
                    if (ji.field_e.field_e != 0) {
                      break L90;
                    } else {
                      L91: {
                        ji.field_e = null;
                        if (va.field_b == null) {
                          break L91;
                        } else {
                          if (gh.field_k) {
                            break L91;
                          } else {
                            if (va.field_b.field_e != 0) {
                              break L91;
                            } else {
                              va.field_b = null;
                              break L91;
                            }
                          }
                        }
                      }
                      L92: {
                        if (null == hh.field_d) {
                          break L92;
                        } else {
                          if (qf.field_e) {
                            break L92;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L92;
                            } else {
                              break L92;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L93: {
                if (va.field_b == null) {
                  break L93;
                } else {
                  if (gh.field_k) {
                    break L93;
                  } else {
                    if (va.field_b.field_e != 0) {
                      break L93;
                    } else {
                      L94: {
                        va.field_b = null;
                        if (null == hh.field_d) {
                          break L94;
                        } else {
                          if (qf.field_e) {
                            break L94;
                          } else {
                            if (hh.field_d.field_e == 0) {
                              hh.field_d = null;
                              break L94;
                            } else {
                              break L94;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (null != hh.field_d) {
                if (!qf.field_e) {
                  if (hh.field_d.field_e != 0) {
                    return;
                  } else {
                    hh.field_d = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
            L95: {
              if (null == hh.field_d) {
                break L95;
              } else {
                if (qf.field_e) {
                  break L95;
                } else {
                  if (hh.field_d.field_e == 0) {
                    hh.field_d = null;
                    break L95;
                  } else {
                    break L95;
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 3) {
            ec.a((byte) -71);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        Object var2 = null;
        im.a((byte) -77);
        if (param0 != 126) {
          var2 = null;
          java.net.URL discarded$2 = ec.a(19, (String) null, (java.net.URL) null, (String) null, -53);
          jd.field_c = true;
          rk.field_f = true;
          vg.field_Z.g((byte) 109);
          r.a((byte) 97, false, wc.field_jc);
          return;
        } else {
          jd.field_c = true;
          rk.field_f = true;
          vg.field_Z.g((byte) 109);
          r.a((byte) 97, false, wc.field_jc);
          return;
        }
    }

    final static java.net.URL a(int param0, String param1, java.net.URL param2, String param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            var9 = Confined.field_J ? 1 : 0;
            var5 = param2.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (-1 < (param0 ^ -1)) {
                        break L1;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((var7_int ^ -1) <= -1) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if ((var7_int ^ -1) > -1) {
                      break L4;
                    } else {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L5;
                  } else {
                    if (param1 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if ((param0 ^ -1) < -1) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param3 == null) {
                    if (param1 == null) {
                      break L8;
                    } else {
                      if (0 >= param1.length()) {
                        break L8;
                      } else {
                        StringBuilder discarded$12 = var7.append("/s=");
                        StringBuilder discarded$13 = var7.append(param1);
                        break L8;
                      }
                    }
                  } else {
                    if (param1 == null) {
                      break L8;
                    } else {
                      if (0 >= param1.length()) {
                        break L8;
                      } else {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param1);
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  if (var5.length() <= var6) {
                    StringBuilder discarded$16 = var7.append(47);
                    break L9;
                  } else {
                    StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                    break L9;
                  }
                }
                L10: {
                  if (param4 == -1) {
                    break L10;
                  } else {
                    ec.a((byte) -10);
                    break L10;
                  }
                }
                try {
                  stackOut_43_0 = new java.net.URL(param2, var7.toString());
                  stackIn_44_0 = stackOut_43_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_44_0;
                }
              }
              var6 = var7_int;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ec(Throwable param0, String param1) {
        ((ec) this).field_b = param0;
        ((ec) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading...";
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
