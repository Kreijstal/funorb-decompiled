/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static int[] field_a;
    static int field_c;
    static String field_b;

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_312_0 = 0;
        int stackIn_356_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_354_0 = 0;
        int stackOut_352_0 = 0;
        int stackOut_350_0 = 0;
        int stackOut_311_0 = 0;
        int stackOut_310_0 = 0;
        int stackOut_308_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_83_0 = 0;
        if (param0 >= -103) {
          L0: {
            field_c = 3;
            if (0 != (a.field_e ^ -1)) {
              break L0;
            } else {
              if ((dg.field_n ^ -1) == 0) {
                a.field_e = pe.field_d;
                dg.field_n = la.field_c;
                break L0;
              } else {
                di.field_m = di.field_m + 1;
                if (param1 == null) {
                  if (sc.field_c == null) {
                    L1: {
                      if (!eg.field_h) {
                        if (di.field_m >= le.field_a) {
                          if (le.field_a - -hf.field_l <= di.field_m) {
                            stackOut_267_0 = 0;
                            stackIn_268_0 = stackOut_267_0;
                            break L1;
                          } else {
                            stackOut_266_0 = 1;
                            stackIn_268_0 = stackOut_266_0;
                            break L1;
                          }
                        } else {
                          stackOut_264_0 = 0;
                          stackIn_268_0 = stackOut_264_0;
                          break L1;
                        }
                      } else {
                        stackOut_262_0 = 0;
                        stackIn_268_0 = stackOut_262_0;
                        break L1;
                      }
                    }
                    L2: {
                      L3: {
                        var2 = stackIn_268_0;
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (eg.field_h) {
                            di.field_m = le.field_a;
                            break L2;
                          } else {
                            if (var2 == 0) {
                              break L3;
                            } else {
                              di.field_m = le.field_a;
                              break L2;
                            }
                          }
                        }
                      }
                      di.field_m = 0;
                      break L2;
                    }
                    L4: {
                      ti.field_c = a.field_e;
                      ua.field_a = dg.field_n;
                      if (param1 == null) {
                        if (var2 == 0) {
                          break L4;
                        } else {
                          eg.field_h = true;
                          break L4;
                        }
                      } else {
                        eg.field_h = false;
                        break L4;
                      }
                    }
                    L5: {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L5;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L5;
                        } else {
                          if (!uf.field_d) {
                            break L5;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      L7: {
                        a.field_e = -1;
                        if (!eg.field_h) {
                          break L7;
                        } else {
                          if (sb.field_c != di.field_m) {
                            break L7;
                          } else {
                            eg.field_h = false;
                            di.field_m = 0;
                            dg.field_n = -1;
                            break L6;
                          }
                        }
                      }
                      dg.field_n = -1;
                      break L6;
                    }
                    return;
                  } else {
                    L8: {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L8;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L8;
                        } else {
                          if (!uf.field_d) {
                            break L8;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L8;
                          }
                        }
                      }
                    }
                    L9: {
                      L10: {
                        a.field_e = -1;
                        if (!eg.field_h) {
                          break L10;
                        } else {
                          if (sb.field_c != di.field_m) {
                            break L10;
                          } else {
                            eg.field_h = false;
                            di.field_m = 0;
                            dg.field_n = -1;
                            break L9;
                          }
                        }
                      }
                      dg.field_n = -1;
                      break L9;
                    }
                    return;
                  }
                } else {
                  if (!param1.equals((Object) (Object) sc.field_c)) {
                    L11: {
                      if (!eg.field_h) {
                        if (di.field_m >= le.field_a) {
                          if (le.field_a - -hf.field_l <= di.field_m) {
                            stackOut_208_0 = 0;
                            stackIn_209_0 = stackOut_208_0;
                            break L11;
                          } else {
                            stackOut_207_0 = 1;
                            stackIn_209_0 = stackOut_207_0;
                            break L11;
                          }
                        } else {
                          stackOut_205_0 = 0;
                          stackIn_209_0 = stackOut_205_0;
                          break L11;
                        }
                      } else {
                        stackOut_203_0 = 0;
                        stackIn_209_0 = stackOut_203_0;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        var2 = stackIn_209_0;
                        if (param1 == null) {
                          break L13;
                        } else {
                          if (eg.field_h) {
                            di.field_m = le.field_a;
                            break L12;
                          } else {
                            if (var2 == 0) {
                              break L13;
                            } else {
                              di.field_m = le.field_a;
                              break L12;
                            }
                          }
                        }
                      }
                      di.field_m = 0;
                      break L12;
                    }
                    L14: {
                      ti.field_c = a.field_e;
                      ua.field_a = dg.field_n;
                      if (param1 == null) {
                        if (var2 == 0) {
                          sc.field_c = param1;
                          if (eg.field_h) {
                            break L14;
                          } else {
                            if (le.field_a <= di.field_m) {
                              break L14;
                            } else {
                              if (!uf.field_d) {
                                break L14;
                              } else {
                                ua.field_a = dg.field_n;
                                ti.field_c = a.field_e;
                                di.field_m = 0;
                                break L14;
                              }
                            }
                          }
                        } else {
                          eg.field_h = true;
                          sc.field_c = param1;
                          if (eg.field_h) {
                            break L14;
                          } else {
                            if (le.field_a <= di.field_m) {
                              break L14;
                            } else {
                              if (!uf.field_d) {
                                break L14;
                              } else {
                                ua.field_a = dg.field_n;
                                ti.field_c = a.field_e;
                                di.field_m = 0;
                                break L14;
                              }
                            }
                          }
                        }
                      } else {
                        eg.field_h = false;
                        sc.field_c = param1;
                        if (eg.field_h) {
                          break L14;
                        } else {
                          if (le.field_a <= di.field_m) {
                            break L14;
                          } else {
                            if (!uf.field_d) {
                              break L14;
                            } else {
                              ua.field_a = dg.field_n;
                              ti.field_c = a.field_e;
                              di.field_m = 0;
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        a.field_e = -1;
                        if (!eg.field_h) {
                          break L16;
                        } else {
                          if (sb.field_c != di.field_m) {
                            break L16;
                          } else {
                            eg.field_h = false;
                            di.field_m = 0;
                            dg.field_n = -1;
                            break L15;
                          }
                        }
                      }
                      dg.field_n = -1;
                      break L15;
                    }
                    return;
                  } else {
                    L17: {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L17;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L17;
                        } else {
                          if (!uf.field_d) {
                            break L17;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L17;
                          }
                        }
                      }
                    }
                    L18: {
                      L19: {
                        a.field_e = -1;
                        if (!eg.field_h) {
                          break L19;
                        } else {
                          if (sb.field_c != di.field_m) {
                            break L19;
                          } else {
                            eg.field_h = false;
                            di.field_m = 0;
                            dg.field_n = -1;
                            break L18;
                          }
                        }
                      }
                      dg.field_n = -1;
                      break L18;
                    }
                    return;
                  }
                }
              }
            }
          }
          L20: {
            di.field_m = di.field_m + 1;
            if (param1 == null) {
              if (sc.field_c == null) {
                L21: {
                  if (!eg.field_h) {
                    if (di.field_m >= le.field_a) {
                      if (le.field_a - -hf.field_l <= di.field_m) {
                        stackOut_355_0 = 0;
                        stackIn_356_0 = stackOut_355_0;
                        break L21;
                      } else {
                        stackOut_354_0 = 1;
                        stackIn_356_0 = stackOut_354_0;
                        break L21;
                      }
                    } else {
                      stackOut_352_0 = 0;
                      stackIn_356_0 = stackOut_352_0;
                      break L21;
                    }
                  } else {
                    stackOut_350_0 = 0;
                    stackIn_356_0 = stackOut_350_0;
                    break L21;
                  }
                }
                L22: {
                  var2 = stackIn_356_0;
                  if (param1 == null) {
                    break L22;
                  } else {
                    if (eg.field_h) {
                      L23: {
                        di.field_m = le.field_a;
                        ti.field_c = a.field_e;
                        ua.field_a = dg.field_n;
                        if (param1 == null) {
                          if (var2 == 0) {
                            break L23;
                          } else {
                            eg.field_h = true;
                            break L23;
                          }
                        } else {
                          eg.field_h = false;
                          break L23;
                        }
                      }
                      L24: {
                        sc.field_c = param1;
                        if (eg.field_h) {
                          break L24;
                        } else {
                          if (le.field_a <= di.field_m) {
                            break L24;
                          } else {
                            if (!uf.field_d) {
                              break L24;
                            } else {
                              ua.field_a = dg.field_n;
                              ti.field_c = a.field_e;
                              di.field_m = 0;
                              a.field_e = -1;
                              if (eg.field_h) {
                                if (sb.field_c != di.field_m) {
                                  dg.field_n = -1;
                                  return;
                                } else {
                                  eg.field_h = false;
                                  di.field_m = 0;
                                  dg.field_n = -1;
                                  return;
                                }
                              } else {
                                dg.field_n = -1;
                                return;
                              }
                            }
                          }
                        }
                      }
                      a.field_e = -1;
                      if (eg.field_h) {
                        if (sb.field_c != di.field_m) {
                          dg.field_n = -1;
                          return;
                        } else {
                          eg.field_h = false;
                          di.field_m = 0;
                          dg.field_n = -1;
                          return;
                        }
                      } else {
                        dg.field_n = -1;
                        return;
                      }
                    } else {
                      if (var2 == 0) {
                        break L22;
                      } else {
                        di.field_m = le.field_a;
                        ti.field_c = a.field_e;
                        ua.field_a = dg.field_n;
                        if (param1 == null) {
                          if (var2 == 0) {
                            L25: {
                              sc.field_c = param1;
                              if (eg.field_h) {
                                break L25;
                              } else {
                                if (le.field_a <= di.field_m) {
                                  break L25;
                                } else {
                                  if (!uf.field_d) {
                                    break L25;
                                  } else {
                                    ua.field_a = dg.field_n;
                                    ti.field_c = a.field_e;
                                    di.field_m = 0;
                                    a.field_e = -1;
                                    if (eg.field_h) {
                                      if (sb.field_c == di.field_m) {
                                        eg.field_h = false;
                                        di.field_m = 0;
                                        dg.field_n = -1;
                                        return;
                                      } else {
                                        dg.field_n = -1;
                                        return;
                                      }
                                    } else {
                                      dg.field_n = -1;
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                            a.field_e = -1;
                            if (eg.field_h) {
                              if (sb.field_c == di.field_m) {
                                eg.field_h = false;
                                di.field_m = 0;
                                dg.field_n = -1;
                                return;
                              } else {
                                dg.field_n = -1;
                                return;
                              }
                            } else {
                              dg.field_n = -1;
                              return;
                            }
                          } else {
                            L26: {
                              eg.field_h = true;
                              sc.field_c = param1;
                              if (eg.field_h) {
                                break L26;
                              } else {
                                if (le.field_a <= di.field_m) {
                                  break L26;
                                } else {
                                  if (!uf.field_d) {
                                    break L26;
                                  } else {
                                    ua.field_a = dg.field_n;
                                    ti.field_c = a.field_e;
                                    di.field_m = 0;
                                    break L26;
                                  }
                                }
                              }
                            }
                            a.field_e = -1;
                            if (eg.field_h) {
                              if (sb.field_c != di.field_m) {
                                dg.field_n = -1;
                                return;
                              } else {
                                eg.field_h = false;
                                di.field_m = 0;
                                dg.field_n = -1;
                                return;
                              }
                            } else {
                              dg.field_n = -1;
                              return;
                            }
                          }
                        } else {
                          L27: {
                            eg.field_h = false;
                            sc.field_c = param1;
                            if (eg.field_h) {
                              break L27;
                            } else {
                              if (le.field_a <= di.field_m) {
                                break L27;
                              } else {
                                if (!uf.field_d) {
                                  break L27;
                                } else {
                                  ua.field_a = dg.field_n;
                                  ti.field_c = a.field_e;
                                  di.field_m = 0;
                                  break L27;
                                }
                              }
                            }
                          }
                          a.field_e = -1;
                          if (eg.field_h) {
                            if (sb.field_c != di.field_m) {
                              dg.field_n = -1;
                              return;
                            } else {
                              eg.field_h = false;
                              di.field_m = 0;
                              dg.field_n = -1;
                              return;
                            }
                          } else {
                            dg.field_n = -1;
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                di.field_m = 0;
                ti.field_c = a.field_e;
                ua.field_a = dg.field_n;
                if (param1 == null) {
                  if (var2 == 0) {
                    break L20;
                  } else {
                    L28: {
                      eg.field_h = true;
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L28;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L28;
                        } else {
                          if (!uf.field_d) {
                            break L28;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            a.field_e = -1;
                            if (eg.field_h) {
                              if (sb.field_c == di.field_m) {
                                eg.field_h = false;
                                di.field_m = 0;
                                dg.field_n = -1;
                                return;
                              } else {
                                dg.field_n = -1;
                                return;
                              }
                            } else {
                              dg.field_n = -1;
                              return;
                            }
                          }
                        }
                      }
                    }
                    a.field_e = -1;
                    if (eg.field_h) {
                      if (sb.field_c == di.field_m) {
                        eg.field_h = false;
                        di.field_m = 0;
                        dg.field_n = -1;
                        return;
                      } else {
                        dg.field_n = -1;
                        return;
                      }
                    } else {
                      dg.field_n = -1;
                      return;
                    }
                  }
                } else {
                  L29: {
                    eg.field_h = false;
                    sc.field_c = param1;
                    if (eg.field_h) {
                      break L29;
                    } else {
                      if (le.field_a <= di.field_m) {
                        break L29;
                      } else {
                        if (!uf.field_d) {
                          break L29;
                        } else {
                          ua.field_a = dg.field_n;
                          ti.field_c = a.field_e;
                          di.field_m = 0;
                          a.field_e = -1;
                          if (eg.field_h) {
                            if (sb.field_c == di.field_m) {
                              eg.field_h = false;
                              di.field_m = 0;
                              dg.field_n = -1;
                              return;
                            } else {
                              dg.field_n = -1;
                              return;
                            }
                          } else {
                            dg.field_n = -1;
                            return;
                          }
                        }
                      }
                    }
                  }
                  a.field_e = -1;
                  if (eg.field_h) {
                    if (sb.field_c == di.field_m) {
                      eg.field_h = false;
                      di.field_m = 0;
                      dg.field_n = -1;
                      return;
                    } else {
                      dg.field_n = -1;
                      return;
                    }
                  } else {
                    dg.field_n = -1;
                    return;
                  }
                }
              } else {
                L30: {
                  sc.field_c = param1;
                  if (eg.field_h) {
                    break L30;
                  } else {
                    if (le.field_a <= di.field_m) {
                      break L30;
                    } else {
                      if (!uf.field_d) {
                        break L30;
                      } else {
                        ua.field_a = dg.field_n;
                        ti.field_c = a.field_e;
                        di.field_m = 0;
                        break L30;
                      }
                    }
                  }
                }
                a.field_e = -1;
                if (eg.field_h) {
                  if (sb.field_c != di.field_m) {
                    dg.field_n = -1;
                    return;
                  } else {
                    eg.field_h = false;
                    di.field_m = 0;
                    dg.field_n = -1;
                    return;
                  }
                } else {
                  dg.field_n = -1;
                  return;
                }
              }
            } else {
              if (param1.equals((Object) (Object) sc.field_c)) {
                break L20;
              } else {
                L31: {
                  if (!eg.field_h) {
                    if (di.field_m >= le.field_a) {
                      if (le.field_a - -hf.field_l <= di.field_m) {
                        stackOut_311_0 = 0;
                        stackIn_312_0 = stackOut_311_0;
                        break L31;
                      } else {
                        stackOut_310_0 = 1;
                        stackIn_312_0 = stackOut_310_0;
                        break L31;
                      }
                    } else {
                      stackOut_308_0 = 0;
                      stackIn_312_0 = stackOut_308_0;
                      break L31;
                    }
                  } else {
                    stackOut_306_0 = 0;
                    stackIn_312_0 = stackOut_306_0;
                    break L31;
                  }
                }
                L32: {
                  L33: {
                    var2 = stackIn_312_0;
                    if (param1 == null) {
                      break L33;
                    } else {
                      if (eg.field_h) {
                        di.field_m = le.field_a;
                        break L32;
                      } else {
                        if (var2 == 0) {
                          break L33;
                        } else {
                          di.field_m = le.field_a;
                          break L32;
                        }
                      }
                    }
                  }
                  di.field_m = 0;
                  break L32;
                }
                L34: {
                  ti.field_c = a.field_e;
                  ua.field_a = dg.field_n;
                  if (param1 == null) {
                    if (var2 == 0) {
                      break L34;
                    } else {
                      eg.field_h = true;
                      break L34;
                    }
                  } else {
                    eg.field_h = false;
                    break L34;
                  }
                }
                L35: {
                  sc.field_c = param1;
                  if (eg.field_h) {
                    break L35;
                  } else {
                    if (le.field_a <= di.field_m) {
                      break L35;
                    } else {
                      if (!uf.field_d) {
                        break L35;
                      } else {
                        ua.field_a = dg.field_n;
                        ti.field_c = a.field_e;
                        di.field_m = 0;
                        break L35;
                      }
                    }
                  }
                }
                L36: {
                  L37: {
                    a.field_e = -1;
                    if (!eg.field_h) {
                      break L37;
                    } else {
                      if (sb.field_c != di.field_m) {
                        break L37;
                      } else {
                        eg.field_h = false;
                        di.field_m = 0;
                        dg.field_n = -1;
                        break L36;
                      }
                    }
                  }
                  dg.field_n = -1;
                  break L36;
                }
                return;
              }
            }
          }
          L38: {
            sc.field_c = param1;
            if (eg.field_h) {
              break L38;
            } else {
              if (le.field_a <= di.field_m) {
                break L38;
              } else {
                if (!uf.field_d) {
                  break L38;
                } else {
                  ua.field_a = dg.field_n;
                  ti.field_c = a.field_e;
                  di.field_m = 0;
                  a.field_e = -1;
                  if (!eg.field_h) {
                    dg.field_n = -1;
                    return;
                  } else {
                    if (sb.field_c == di.field_m) {
                      eg.field_h = false;
                      di.field_m = 0;
                      dg.field_n = -1;
                      return;
                    } else {
                      dg.field_n = -1;
                      return;
                    }
                  }
                }
              }
            }
          }
          a.field_e = -1;
          if (!eg.field_h) {
            dg.field_n = -1;
            return;
          } else {
            if (sb.field_c == di.field_m) {
              eg.field_h = false;
              di.field_m = 0;
              dg.field_n = -1;
              return;
            } else {
              dg.field_n = -1;
              return;
            }
          }
        } else {
          L39: {
            if (0 != (a.field_e ^ -1)) {
              break L39;
            } else {
              if ((dg.field_n ^ -1) == 0) {
                a.field_e = pe.field_d;
                dg.field_n = la.field_c;
                break L39;
              } else {
                L40: {
                  di.field_m = di.field_m + 1;
                  if (param1 == null) {
                    if (sc.field_c == null) {
                      L41: {
                        if (!eg.field_h) {
                          if (di.field_m >= le.field_a) {
                            if (le.field_a - -hf.field_l > di.field_m) {
                              stackOut_32_0 = 1;
                              stackIn_34_0 = stackOut_32_0;
                              break L41;
                            } else {
                              stackOut_31_0 = 0;
                              stackIn_34_0 = stackOut_31_0;
                              break L41;
                            }
                          } else {
                            stackOut_29_0 = 0;
                            stackIn_34_0 = stackOut_29_0;
                            break L41;
                          }
                        } else {
                          stackOut_27_0 = 0;
                          stackIn_34_0 = stackOut_27_0;
                          break L41;
                        }
                      }
                      L42: {
                        var2 = stackIn_34_0;
                        if (param1 != null) {
                          L43: {
                            if (!eg.field_h) {
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          di.field_m = le.field_a;
                          break L42;
                        } else {
                          di.field_m = 0;
                          break L42;
                        }
                      }
                      ti.field_c = a.field_e;
                      ua.field_a = dg.field_n;
                      if (param1 == null) {
                        if (var2 != 0) {
                          eg.field_h = true;
                          sc.field_c = param1;
                          if (eg.field_h) {
                            break L40;
                          } else {
                            if (le.field_a <= di.field_m) {
                              break L40;
                            } else {
                              if (!uf.field_d) {
                                break L40;
                              } else {
                                ua.field_a = dg.field_n;
                                ti.field_c = a.field_e;
                                di.field_m = 0;
                                break L40;
                              }
                            }
                          }
                        } else {
                          sc.field_c = param1;
                          if (eg.field_h) {
                            break L40;
                          } else {
                            if (le.field_a <= di.field_m) {
                              break L40;
                            } else {
                              if (!uf.field_d) {
                                break L40;
                              } else {
                                ua.field_a = dg.field_n;
                                ti.field_c = a.field_e;
                                di.field_m = 0;
                                break L40;
                              }
                            }
                          }
                        }
                      } else {
                        eg.field_h = false;
                        sc.field_c = param1;
                        if (eg.field_h) {
                          break L40;
                        } else {
                          if (le.field_a <= di.field_m) {
                            break L40;
                          } else {
                            if (!uf.field_d) {
                              break L40;
                            } else {
                              ua.field_a = dg.field_n;
                              ti.field_c = a.field_e;
                              di.field_m = 0;
                              break L40;
                            }
                          }
                        }
                      }
                    } else {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L40;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L40;
                        } else {
                          if (!uf.field_d) {
                            break L40;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L40;
                          }
                        }
                      }
                    }
                  } else {
                    if (!param1.equals((Object) (Object) sc.field_c)) {
                      sc.field_c = param1;
                      if (!eg.field_h) {
                        if (le.field_a <= di.field_m) {
                          break L40;
                        } else {
                          L44: {
                            if (uf.field_d) {
                              break L44;
                            } else {
                              sc.field_c = param1;
                              if (eg.field_h) {
                                break L40;
                              } else {
                                if (le.field_a <= di.field_m) {
                                  break L40;
                                } else {
                                  if (!uf.field_d) {
                                    break L40;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                          ua.field_a = dg.field_n;
                          ti.field_c = a.field_e;
                          di.field_m = 0;
                          break L40;
                        }
                      } else {
                        sc.field_c = param1;
                        if (eg.field_h) {
                          break L40;
                        } else {
                          if (le.field_a <= di.field_m) {
                            break L40;
                          } else {
                            if (!uf.field_d) {
                              break L40;
                            } else {
                              ua.field_a = dg.field_n;
                              ti.field_c = a.field_e;
                              di.field_m = 0;
                              break L40;
                            }
                          }
                        }
                      }
                    } else {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L40;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L40;
                        } else {
                          if (!uf.field_d) {
                            break L40;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L40;
                          }
                        }
                      }
                    }
                  }
                }
                L45: {
                  a.field_e = -1;
                  if (eg.field_h) {
                    if (sb.field_c == di.field_m) {
                      eg.field_h = false;
                      di.field_m = 0;
                      dg.field_n = -1;
                      break L45;
                    } else {
                      dg.field_n = -1;
                      break L45;
                    }
                  } else {
                    dg.field_n = -1;
                    break L45;
                  }
                }
                return;
              }
            }
          }
          L46: {
            di.field_m = di.field_m + 1;
            if (param1 == null) {
              L47: {
                if (sc.field_c == null) {
                  L48: {
                    if (!eg.field_h) {
                      if (di.field_m >= le.field_a) {
                        if (le.field_a - -hf.field_l <= di.field_m) {
                          stackOut_131_0 = 0;
                          stackIn_133_0 = stackOut_131_0;
                          break L48;
                        } else {
                          stackOut_130_0 = 1;
                          stackIn_133_0 = stackOut_130_0;
                          break L48;
                        }
                      } else {
                        stackOut_128_0 = 0;
                        stackIn_133_0 = stackOut_128_0;
                        break L48;
                      }
                    } else {
                      stackOut_126_0 = 0;
                      stackIn_133_0 = stackOut_126_0;
                      break L48;
                    }
                  }
                  L49: {
                    L50: {
                      var2 = stackIn_133_0;
                      if (param1 == null) {
                        break L50;
                      } else {
                        if (eg.field_h) {
                          di.field_m = le.field_a;
                          break L49;
                        } else {
                          if (var2 == 0) {
                            break L50;
                          } else {
                            di.field_m = le.field_a;
                            break L49;
                          }
                        }
                      }
                    }
                    di.field_m = 0;
                    break L49;
                  }
                  ti.field_c = a.field_e;
                  ua.field_a = dg.field_n;
                  if (param1 == null) {
                    if (var2 != 0) {
                      eg.field_h = true;
                      break L47;
                    } else {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L46;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L46;
                        } else {
                          if (!uf.field_d) {
                            break L46;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L46;
                          }
                        }
                      }
                    }
                  } else {
                    eg.field_h = false;
                    break L47;
                  }
                } else {
                  break L47;
                }
              }
              sc.field_c = param1;
              if (eg.field_h) {
                break L46;
              } else {
                if (le.field_a <= di.field_m) {
                  break L46;
                } else {
                  if (!uf.field_d) {
                    break L46;
                  } else {
                    ua.field_a = dg.field_n;
                    ti.field_c = a.field_e;
                    di.field_m = 0;
                    sc.field_c = param1;
                    if (!eg.field_h) {
                      if (le.field_a > di.field_m) {
                        if (uf.field_d) {
                          ua.field_a = dg.field_n;
                          ti.field_c = a.field_e;
                          di.field_m = 0;
                          L51: {
                            L52: {
                              a.field_e = -1;
                              if (!eg.field_h) {
                                break L52;
                              } else {
                                if (sb.field_c != di.field_m) {
                                  break L52;
                                } else {
                                  eg.field_h = false;
                                  di.field_m = 0;
                                  dg.field_n = -1;
                                  break L51;
                                }
                              }
                            }
                            dg.field_n = -1;
                            break L51;
                          }
                          return;
                        } else {
                          L53: {
                            L54: {
                              a.field_e = -1;
                              if (!eg.field_h) {
                                break L54;
                              } else {
                                if (sb.field_c != di.field_m) {
                                  break L54;
                                } else {
                                  eg.field_h = false;
                                  di.field_m = 0;
                                  dg.field_n = -1;
                                  break L53;
                                }
                              }
                            }
                            dg.field_n = -1;
                            break L53;
                          }
                          return;
                        }
                      } else {
                        L55: {
                          L56: {
                            a.field_e = -1;
                            if (!eg.field_h) {
                              break L56;
                            } else {
                              if (sb.field_c != di.field_m) {
                                break L56;
                              } else {
                                eg.field_h = false;
                                di.field_m = 0;
                                dg.field_n = -1;
                                break L55;
                              }
                            }
                          }
                          dg.field_n = -1;
                          break L55;
                        }
                        return;
                      }
                    } else {
                      L57: {
                        L58: {
                          a.field_e = -1;
                          if (!eg.field_h) {
                            break L58;
                          } else {
                            if (sb.field_c != di.field_m) {
                              break L58;
                            } else {
                              eg.field_h = false;
                              di.field_m = 0;
                              dg.field_n = -1;
                              break L57;
                            }
                          }
                        }
                        dg.field_n = -1;
                        break L57;
                      }
                      return;
                    }
                  }
                }
              }
            } else {
              if (!param1.equals((Object) (Object) sc.field_c)) {
                L59: {
                  if (!eg.field_h) {
                    if (di.field_m >= le.field_a) {
                      if (le.field_a - -hf.field_l > di.field_m) {
                        stackOut_88_0 = 1;
                        stackIn_90_0 = stackOut_88_0;
                        break L59;
                      } else {
                        stackOut_87_0 = 0;
                        stackIn_90_0 = stackOut_87_0;
                        break L59;
                      }
                    } else {
                      stackOut_85_0 = 0;
                      stackIn_90_0 = stackOut_85_0;
                      break L59;
                    }
                  } else {
                    stackOut_83_0 = 0;
                    stackIn_90_0 = stackOut_83_0;
                    break L59;
                  }
                }
                L60: {
                  var2 = stackIn_90_0;
                  if (param1 != null) {
                    L61: {
                      if (eg.field_h) {
                        break L61;
                      } else {
                        if (var2 != 0) {
                          break L61;
                        } else {
                          di.field_m = 0;
                          break L60;
                        }
                      }
                    }
                    di.field_m = le.field_a;
                    break L60;
                  } else {
                    di.field_m = 0;
                    break L60;
                  }
                }
                L62: {
                  ti.field_c = a.field_e;
                  ua.field_a = dg.field_n;
                  if (param1 == null) {
                    if (var2 == 0) {
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L62;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L62;
                        } else {
                          if (!uf.field_d) {
                            break L62;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L62;
                          }
                        }
                      }
                    } else {
                      eg.field_h = true;
                      sc.field_c = param1;
                      if (eg.field_h) {
                        break L62;
                      } else {
                        if (le.field_a <= di.field_m) {
                          break L62;
                        } else {
                          if (!uf.field_d) {
                            break L62;
                          } else {
                            ua.field_a = dg.field_n;
                            ti.field_c = a.field_e;
                            di.field_m = 0;
                            break L62;
                          }
                        }
                      }
                    }
                  } else {
                    eg.field_h = false;
                    sc.field_c = param1;
                    if (eg.field_h) {
                      break L62;
                    } else {
                      if (le.field_a <= di.field_m) {
                        break L62;
                      } else {
                        if (!uf.field_d) {
                          break L62;
                        } else {
                          ua.field_a = dg.field_n;
                          ti.field_c = a.field_e;
                          di.field_m = 0;
                          break L62;
                        }
                      }
                    }
                  }
                }
                L63: {
                  a.field_e = -1;
                  if (eg.field_h) {
                    if (sb.field_c == di.field_m) {
                      eg.field_h = false;
                      di.field_m = 0;
                      dg.field_n = -1;
                      break L63;
                    } else {
                      dg.field_n = -1;
                      break L63;
                    }
                  } else {
                    dg.field_n = -1;
                    break L63;
                  }
                }
                return;
              } else {
                sc.field_c = param1;
                if (eg.field_h) {
                  break L46;
                } else {
                  if (le.field_a <= di.field_m) {
                    break L46;
                  } else {
                    if (!uf.field_d) {
                      break L46;
                    } else {
                      ua.field_a = dg.field_n;
                      ti.field_c = a.field_e;
                      di.field_m = 0;
                      break L46;
                    }
                  }
                }
              }
            }
          }
          a.field_e = -1;
          if (eg.field_h) {
            if (sb.field_c != di.field_m) {
              dg.field_n = -1;
              return;
            } else {
              eg.field_h = false;
              di.field_m = 0;
              dg.field_n = -1;
              return;
            }
          } else {
            dg.field_n = -1;
            return;
          }
        }
    }

    final static id a(int param0) {
        id var1 = null;
        var1 = new id(td.field_m, gb.field_w, fc.field_d[0], qd.field_H[0], gg.field_d[0], gh.field_C[0], og.field_c[0], of.field_g);
        rc.b((byte) 64);
        if (param0 == 14609) {
          return var1;
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8];
        field_c = 0;
    }
}
