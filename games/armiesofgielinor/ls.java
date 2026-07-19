/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    int field_e;
    int field_a;
    int field_b;
    static int[] field_c;
    static String field_d;
    int field_f;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = param3;
          var6 = param2;
          var7 = param0;
          if (param1 == 7) {
            L1: {
              if (-12 == (param3 ^ -1)) {
                var5 = 7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-12 == (param2 ^ -1)) {
                var6 = 7;
                break L2;
              } else {
                break L2;
              }
            }
            if (11 == param0) {
              var7 = 7;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (-5 == (param1 ^ -1)) {
          if (param3 != 2) {
            L3: {
              if ((param3 ^ -1) != -10) {
                break L3;
              } else {
                var5 = 4;
                break L3;
              }
            }
            L4: {
              L5: {
                if (-3 == (param0 ^ -1)) {
                  break L5;
                } else {
                  if (param0 != 9) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var7 = 4;
              break L4;
            }
            L6: {
              L7: {
                if ((param2 ^ -1) == -3) {
                  break L7;
                } else {
                  if ((param2 ^ -1) != -10) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var6 = 4;
              break L6;
            }
            L8: {
              if (param1 != 2) {
                break L8;
              } else {
                L9: {
                  L10: {
                    if (-5 == (param2 ^ -1)) {
                      break L10;
                    } else {
                      if (-10 == (param2 ^ -1)) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var6 = 2;
                  break L9;
                }
                L11: {
                  L12: {
                    if (param3 == 4) {
                      break L12;
                    } else {
                      if (9 == param3) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var5 = 2;
                  break L11;
                }
                L13: {
                  if (4 == param0) {
                    break L13;
                  } else {
                    if (param0 == 9) {
                      break L13;
                    } else {
                      break L8;
                    }
                  }
                }
                var7 = 2;
                break L8;
              }
            }
            L14: {
              if ((param1 ^ -1) == -2) {
                L15: {
                  if ((param2 ^ -1) != -10) {
                    break L15;
                  } else {
                    var6 = 1;
                    break L15;
                  }
                }
                L16: {
                  if (-10 != (param0 ^ -1)) {
                    break L16;
                  } else {
                    var7 = 1;
                    break L16;
                  }
                }
                if (9 == param3) {
                  var5 = 1;
                  break L14;
                } else {
                  break L14;
                }
              } else {
                break L14;
              }
            }
            if (param4 <= -3) {
              L17: {
                var8 = 0;
                if (var5 == param1) {
                  var8++;
                  break L17;
                } else {
                  break L17;
                }
              }
              if (param1 != var6) {
                L18: {
                  if (3 != var8) {
                    break L18;
                  } else {
                    if (var7 == param1) {
                      var8++;
                      break L18;
                    } else {
                      var8 = var8 * 4;
                      if (param1 == 4) {
                        L19: {
                          L20: {
                            if (-5 == (var8 ^ -1)) {
                              break L20;
                            } else {
                              if (8 != var8) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (param3 == 2) {
                              break L21;
                            } else {
                              if ((param2 ^ -1) == -3) {
                                break L21;
                              } else {
                                if (-10 == (param3 ^ -1)) {
                                  break L21;
                                } else {
                                  if ((param2 ^ -1) == -10) {
                                    break L21;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                          var8 += 48;
                          break L19;
                        }
                        if (12 == var8) {
                          L22: {
                            if (param3 == 2) {
                              break L22;
                            } else {
                              if (param2 == 2) {
                                break L22;
                              } else {
                                if (param3 == 9) {
                                  break L22;
                                } else {
                                  if (9 != param2) {
                                    return var8;
                                  } else {
                                    L23: {
                                      L24: {
                                        var8 += 24;
                                        if (-3 == (param3 ^ -1)) {
                                          break L24;
                                        } else {
                                          if ((param3 ^ -1) == -10) {
                                            break L24;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var8 += 8;
                                      break L23;
                                    }
                                    L25: {
                                      L26: {
                                        if (param2 == 2) {
                                          break L26;
                                        } else {
                                          if ((param2 ^ -1) == -10) {
                                            break L26;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      var8 += 4;
                                      break L25;
                                    }
                                    return var8;
                                  }
                                }
                              }
                            }
                          }
                          L27: {
                            L28: {
                              var8 += 24;
                              if (-3 == (param3 ^ -1)) {
                                break L28;
                              } else {
                                if ((param3 ^ -1) == -10) {
                                  break L28;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var8 += 8;
                            break L27;
                          }
                          if (param2 != 2) {
                            if ((param2 ^ -1) != -10) {
                              return var8;
                            } else {
                              var8 += 4;
                              return var8;
                            }
                          } else {
                            var8 += 4;
                            return var8;
                          }
                        } else {
                          return var8;
                        }
                      } else {
                        return var8;
                      }
                    }
                  }
                }
                var8 = var8 * 4;
                if (param1 == 4) {
                  L29: {
                    if (-5 == (var8 ^ -1)) {
                      L30: {
                        if (param3 == 2) {
                          break L30;
                        } else {
                          if ((param2 ^ -1) == -3) {
                            break L30;
                          } else {
                            if (-10 == (param3 ^ -1)) {
                              break L30;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L30;
                              } else {
                                L31: {
                                  if (12 != var8) {
                                    break L31;
                                  } else {
                                    L32: {
                                      if (param3 == 2) {
                                        break L32;
                                      } else {
                                        if (param2 == 2) {
                                          break L32;
                                        } else {
                                          if (param3 == 9) {
                                            break L32;
                                          } else {
                                            if (9 != param2) {
                                              break L31;
                                            } else {
                                              L33: {
                                                L34: {
                                                  var8 += 24;
                                                  if (-3 == (param3 ^ -1)) {
                                                    break L34;
                                                  } else {
                                                    if ((param3 ^ -1) == -10) {
                                                      break L34;
                                                    } else {
                                                      break L33;
                                                    }
                                                  }
                                                }
                                                var8 += 8;
                                                break L33;
                                              }
                                              L35: {
                                                L36: {
                                                  if (param2 == 2) {
                                                    break L36;
                                                  } else {
                                                    if ((param2 ^ -1) == -10) {
                                                      break L36;
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                                var8 += 4;
                                                break L35;
                                              }
                                              return var8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L37: {
                                      L38: {
                                        var8 += 24;
                                        if (-3 == (param3 ^ -1)) {
                                          break L38;
                                        } else {
                                          if ((param3 ^ -1) == -10) {
                                            break L38;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      var8 += 8;
                                      break L37;
                                    }
                                    L39: {
                                      if (param2 == 2) {
                                        break L39;
                                      } else {
                                        if ((param2 ^ -1) == -10) {
                                          break L39;
                                        } else {
                                          return var8;
                                        }
                                      }
                                    }
                                    var8 += 4;
                                    break L31;
                                  }
                                }
                                return var8;
                              }
                            }
                          }
                        }
                      }
                      var8 += 48;
                      break L29;
                    } else {
                      if (8 != var8) {
                        break L29;
                      } else {
                        L40: {
                          L41: {
                            if (param3 == 2) {
                              break L41;
                            } else {
                              if ((param2 ^ -1) == -3) {
                                break L41;
                              } else {
                                if (-10 == (param3 ^ -1)) {
                                  break L41;
                                } else {
                                  if ((param2 ^ -1) == -10) {
                                    break L41;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                          var8 += 48;
                          break L40;
                        }
                        if (12 == var8) {
                          L42: {
                            if (param3 == 2) {
                              break L42;
                            } else {
                              if (param2 == 2) {
                                break L42;
                              } else {
                                if (param3 == 9) {
                                  break L42;
                                } else {
                                  if (9 == param2) {
                                    L43: {
                                      L44: {
                                        var8 += 24;
                                        if (-3 == (param3 ^ -1)) {
                                          break L44;
                                        } else {
                                          if ((param3 ^ -1) == -10) {
                                            break L44;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      var8 += 8;
                                      break L43;
                                    }
                                    L45: {
                                      L46: {
                                        if (param2 == 2) {
                                          break L46;
                                        } else {
                                          if ((param2 ^ -1) == -10) {
                                            break L46;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      var8 += 4;
                                      break L45;
                                    }
                                    return var8;
                                  } else {
                                    return var8;
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            L48: {
                              var8 += 24;
                              if (-3 == (param3 ^ -1)) {
                                break L48;
                              } else {
                                if ((param3 ^ -1) == -10) {
                                  break L48;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            var8 += 8;
                            break L47;
                          }
                          L49: {
                            if (param2 == 2) {
                              break L49;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L49;
                              } else {
                                return var8;
                              }
                            }
                          }
                          var8 += 4;
                          return var8;
                        } else {
                          return var8;
                        }
                      }
                    }
                  }
                  L50: {
                    if (12 != var8) {
                      break L50;
                    } else {
                      L51: {
                        if (param3 == 2) {
                          break L51;
                        } else {
                          if (param2 == 2) {
                            break L51;
                          } else {
                            if (param3 == 9) {
                              break L51;
                            } else {
                              if (9 != param2) {
                                break L50;
                              } else {
                                L52: {
                                  L53: {
                                    var8 += 24;
                                    if (-3 == (param3 ^ -1)) {
                                      break L53;
                                    } else {
                                      if ((param3 ^ -1) == -10) {
                                        break L53;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  var8 += 8;
                                  break L52;
                                }
                                L54: {
                                  L55: {
                                    if (param2 == 2) {
                                      break L55;
                                    } else {
                                      if ((param2 ^ -1) == -10) {
                                        break L55;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  var8 += 4;
                                  break L54;
                                }
                                return var8;
                              }
                            }
                          }
                        }
                      }
                      L56: {
                        L57: {
                          var8 += 24;
                          if (-3 == (param3 ^ -1)) {
                            break L57;
                          } else {
                            if ((param3 ^ -1) == -10) {
                              break L57;
                            } else {
                              break L56;
                            }
                          }
                        }
                        var8 += 8;
                        break L56;
                      }
                      L58: {
                        if (param2 == 2) {
                          break L58;
                        } else {
                          if ((param2 ^ -1) == -10) {
                            break L58;
                          } else {
                            return var8;
                          }
                        }
                      }
                      var8 += 4;
                      break L50;
                    }
                  }
                  return var8;
                } else {
                  return var8;
                }
              } else {
                L59: {
                  var8 += 2;
                  if (3 != var8) {
                    break L59;
                  } else {
                    if (var7 == param1) {
                      var8++;
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                }
                L60: {
                  var8 = var8 * 4;
                  if (param1 != 4) {
                    break L60;
                  } else {
                    L61: {
                      L62: {
                        if (-5 == (var8 ^ -1)) {
                          break L62;
                        } else {
                          if (8 != var8) {
                            break L61;
                          } else {
                            break L62;
                          }
                        }
                      }
                      L63: {
                        if (param3 == 2) {
                          break L63;
                        } else {
                          if ((param2 ^ -1) == -3) {
                            break L63;
                          } else {
                            if (-10 == (param3 ^ -1)) {
                              break L63;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L63;
                              } else {
                                break L61;
                              }
                            }
                          }
                        }
                      }
                      var8 += 48;
                      break L61;
                    }
                    if (12 != var8) {
                      break L60;
                    } else {
                      L64: {
                        if (param3 == 2) {
                          break L64;
                        } else {
                          if (param2 == 2) {
                            break L64;
                          } else {
                            if (param3 == 9) {
                              break L64;
                            } else {
                              if (9 != param2) {
                                break L60;
                              } else {
                                break L64;
                              }
                            }
                          }
                        }
                      }
                      L65: {
                        L66: {
                          var8 += 24;
                          if (-3 == (param3 ^ -1)) {
                            break L66;
                          } else {
                            if ((param3 ^ -1) == -10) {
                              break L66;
                            } else {
                              break L65;
                            }
                          }
                        }
                        var8 += 8;
                        break L65;
                      }
                      L67: {
                        if (param2 == 2) {
                          break L67;
                        } else {
                          if ((param2 ^ -1) == -10) {
                            break L67;
                          } else {
                            break L60;
                          }
                        }
                      }
                      var8 += 4;
                      break L60;
                    }
                  }
                }
                return var8;
              }
            } else {
              return -51;
            }
          } else {
            L68: {
              L69: {
                var5 = 4;
                if (-3 == (param0 ^ -1)) {
                  break L69;
                } else {
                  if (param0 != 9) {
                    break L68;
                  } else {
                    break L69;
                  }
                }
              }
              var7 = 4;
              break L68;
            }
            L70: {
              L71: {
                if ((param2 ^ -1) == -3) {
                  break L71;
                } else {
                  if ((param2 ^ -1) != -10) {
                    break L70;
                  } else {
                    break L71;
                  }
                }
              }
              var6 = 4;
              break L70;
            }
            L72: {
              if (param1 != 2) {
                break L72;
              } else {
                L73: {
                  L74: {
                    if (-5 == (param2 ^ -1)) {
                      break L74;
                    } else {
                      if (-10 == (param2 ^ -1)) {
                        break L74;
                      } else {
                        break L73;
                      }
                    }
                  }
                  var6 = 2;
                  break L73;
                }
                L75: {
                  L76: {
                    if (param3 == 4) {
                      break L76;
                    } else {
                      if (9 == param3) {
                        break L76;
                      } else {
                        break L75;
                      }
                    }
                  }
                  var5 = 2;
                  break L75;
                }
                L77: {
                  if (4 == param0) {
                    break L77;
                  } else {
                    if (param0 == 9) {
                      break L77;
                    } else {
                      break L72;
                    }
                  }
                }
                var7 = 2;
                break L72;
              }
            }
            L78: {
              if ((param1 ^ -1) == -2) {
                L79: {
                  if ((param2 ^ -1) != -10) {
                    break L79;
                  } else {
                    var6 = 1;
                    break L79;
                  }
                }
                L80: {
                  if (-10 != (param0 ^ -1)) {
                    break L80;
                  } else {
                    var7 = 1;
                    break L80;
                  }
                }
                if (9 == param3) {
                  var5 = 1;
                  break L78;
                } else {
                  break L78;
                }
              } else {
                break L78;
              }
            }
            if (param4 <= -3) {
              L81: {
                var8 = 0;
                if (var5 == param1) {
                  var8++;
                  break L81;
                } else {
                  break L81;
                }
              }
              if (param1 != var6) {
                L82: {
                  if (3 != var8) {
                    break L82;
                  } else {
                    if (var7 == param1) {
                      var8++;
                      break L82;
                    } else {
                      L83: {
                        var8 = var8 * 4;
                        if (param1 != 4) {
                          break L83;
                        } else {
                          L84: {
                            L85: {
                              if (-5 == (var8 ^ -1)) {
                                break L85;
                              } else {
                                if (8 != var8) {
                                  break L84;
                                } else {
                                  break L85;
                                }
                              }
                            }
                            L86: {
                              if (param3 == 2) {
                                break L86;
                              } else {
                                if ((param2 ^ -1) == -3) {
                                  break L86;
                                } else {
                                  if (-10 == (param3 ^ -1)) {
                                    break L86;
                                  } else {
                                    if ((param2 ^ -1) == -10) {
                                      break L86;
                                    } else {
                                      break L84;
                                    }
                                  }
                                }
                              }
                            }
                            var8 += 48;
                            break L84;
                          }
                          if (12 != var8) {
                            break L83;
                          } else {
                            L87: {
                              if (param3 == 2) {
                                break L87;
                              } else {
                                if (param2 == 2) {
                                  break L87;
                                } else {
                                  if (param3 == 9) {
                                    break L87;
                                  } else {
                                    if (9 != param2) {
                                      break L83;
                                    } else {
                                      break L87;
                                    }
                                  }
                                }
                              }
                            }
                            L88: {
                              L89: {
                                var8 += 24;
                                if (-3 == (param3 ^ -1)) {
                                  break L89;
                                } else {
                                  if ((param3 ^ -1) == -10) {
                                    break L89;
                                  } else {
                                    break L88;
                                  }
                                }
                              }
                              var8 += 8;
                              break L88;
                            }
                            L90: {
                              if (param2 == 2) {
                                break L90;
                              } else {
                                if ((param2 ^ -1) == -10) {
                                  break L90;
                                } else {
                                  break L83;
                                }
                              }
                            }
                            var8 += 4;
                            break L83;
                          }
                        }
                      }
                      return var8;
                    }
                  }
                }
                var8 = var8 * 4;
                if (param1 == 4) {
                  L91: {
                    if (-5 == (var8 ^ -1)) {
                      L92: {
                        if (param3 == 2) {
                          break L92;
                        } else {
                          if ((param2 ^ -1) == -3) {
                            break L92;
                          } else {
                            if (-10 == (param3 ^ -1)) {
                              break L92;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L92;
                              } else {
                                L93: {
                                  if (12 != var8) {
                                    break L93;
                                  } else {
                                    L94: {
                                      if (param3 == 2) {
                                        break L94;
                                      } else {
                                        if (param2 == 2) {
                                          break L94;
                                        } else {
                                          if (param3 == 9) {
                                            break L94;
                                          } else {
                                            if (9 != param2) {
                                              break L93;
                                            } else {
                                              break L94;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L95: {
                                      L96: {
                                        var8 += 24;
                                        if (-3 == (param3 ^ -1)) {
                                          break L96;
                                        } else {
                                          if ((param3 ^ -1) == -10) {
                                            break L96;
                                          } else {
                                            break L95;
                                          }
                                        }
                                      }
                                      var8 += 8;
                                      break L95;
                                    }
                                    L97: {
                                      if (param2 == 2) {
                                        break L97;
                                      } else {
                                        if ((param2 ^ -1) == -10) {
                                          break L97;
                                        } else {
                                          break L93;
                                        }
                                      }
                                    }
                                    var8 += 4;
                                    break L93;
                                  }
                                }
                                return var8;
                              }
                            }
                          }
                        }
                      }
                      var8 += 48;
                      break L91;
                    } else {
                      if (8 != var8) {
                        break L91;
                      } else {
                        L98: {
                          L99: {
                            if (param3 == 2) {
                              break L99;
                            } else {
                              if ((param2 ^ -1) == -3) {
                                break L99;
                              } else {
                                if (-10 == (param3 ^ -1)) {
                                  break L99;
                                } else {
                                  if ((param2 ^ -1) == -10) {
                                    break L99;
                                  } else {
                                    break L98;
                                  }
                                }
                              }
                            }
                          }
                          var8 += 48;
                          break L98;
                        }
                        L100: {
                          if (12 != var8) {
                            break L100;
                          } else {
                            L101: {
                              if (param3 == 2) {
                                break L101;
                              } else {
                                if (param2 == 2) {
                                  break L101;
                                } else {
                                  if (param3 == 9) {
                                    break L101;
                                  } else {
                                    if (9 != param2) {
                                      break L100;
                                    } else {
                                      break L101;
                                    }
                                  }
                                }
                              }
                            }
                            L102: {
                              L103: {
                                var8 += 24;
                                if (-3 == (param3 ^ -1)) {
                                  break L103;
                                } else {
                                  if ((param3 ^ -1) == -10) {
                                    break L103;
                                  } else {
                                    break L102;
                                  }
                                }
                              }
                              var8 += 8;
                              break L102;
                            }
                            L104: {
                              if (param2 == 2) {
                                break L104;
                              } else {
                                if ((param2 ^ -1) == -10) {
                                  break L104;
                                } else {
                                  break L100;
                                }
                              }
                            }
                            var8 += 4;
                            break L100;
                          }
                        }
                        return var8;
                      }
                    }
                  }
                  if (12 == var8) {
                    L105: {
                      if (param3 == 2) {
                        break L105;
                      } else {
                        if (param2 == 2) {
                          break L105;
                        } else {
                          if (param3 == 9) {
                            break L105;
                          } else {
                            if (9 == param2) {
                              L106: {
                                L107: {
                                  var8 += 24;
                                  if (-3 == (param3 ^ -1)) {
                                    break L107;
                                  } else {
                                    if ((param3 ^ -1) == -10) {
                                      break L107;
                                    } else {
                                      break L106;
                                    }
                                  }
                                }
                                var8 += 8;
                                break L106;
                              }
                              L108: {
                                L109: {
                                  if (param2 == 2) {
                                    break L109;
                                  } else {
                                    if ((param2 ^ -1) == -10) {
                                      break L109;
                                    } else {
                                      break L108;
                                    }
                                  }
                                }
                                var8 += 4;
                                break L108;
                              }
                              return var8;
                            } else {
                              return var8;
                            }
                          }
                        }
                      }
                    }
                    L110: {
                      L111: {
                        var8 += 24;
                        if (-3 == (param3 ^ -1)) {
                          break L111;
                        } else {
                          if ((param3 ^ -1) == -10) {
                            break L111;
                          } else {
                            break L110;
                          }
                        }
                      }
                      var8 += 8;
                      break L110;
                    }
                    if (param2 != 2) {
                      if ((param2 ^ -1) == -10) {
                        var8 += 4;
                        return var8;
                      } else {
                        return var8;
                      }
                    } else {
                      var8 += 4;
                      return var8;
                    }
                  } else {
                    return var8;
                  }
                } else {
                  return var8;
                }
              } else {
                L112: {
                  var8 += 2;
                  if (3 != var8) {
                    break L112;
                  } else {
                    if (var7 == param1) {
                      var8++;
                      break L112;
                    } else {
                      break L112;
                    }
                  }
                }
                L113: {
                  var8 = var8 * 4;
                  if (param1 != 4) {
                    break L113;
                  } else {
                    L114: {
                      L115: {
                        if (-5 == (var8 ^ -1)) {
                          break L115;
                        } else {
                          if (8 != var8) {
                            break L114;
                          } else {
                            break L115;
                          }
                        }
                      }
                      L116: {
                        if (param3 == 2) {
                          break L116;
                        } else {
                          if ((param2 ^ -1) == -3) {
                            break L116;
                          } else {
                            if (-10 == (param3 ^ -1)) {
                              break L116;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L116;
                              } else {
                                break L114;
                              }
                            }
                          }
                        }
                      }
                      var8 += 48;
                      break L114;
                    }
                    if (12 != var8) {
                      break L113;
                    } else {
                      L117: {
                        if (param3 == 2) {
                          break L117;
                        } else {
                          if (param2 == 2) {
                            break L117;
                          } else {
                            if (param3 == 9) {
                              break L117;
                            } else {
                              if (9 != param2) {
                                break L113;
                              } else {
                                break L117;
                              }
                            }
                          }
                        }
                      }
                      L118: {
                        L119: {
                          var8 += 24;
                          if (-3 == (param3 ^ -1)) {
                            break L119;
                          } else {
                            if ((param3 ^ -1) == -10) {
                              break L119;
                            } else {
                              break L118;
                            }
                          }
                        }
                        var8 += 8;
                        break L118;
                      }
                      L120: {
                        if (param2 == 2) {
                          break L120;
                        } else {
                          if ((param2 ^ -1) == -10) {
                            break L120;
                          } else {
                            break L113;
                          }
                        }
                      }
                      var8 += 4;
                      break L113;
                    }
                  }
                }
                return var8;
              }
            } else {
              return -51;
            }
          }
        } else {
          L121: {
            if (param1 != 2) {
              break L121;
            } else {
              L122: {
                L123: {
                  if (-5 == (param2 ^ -1)) {
                    break L123;
                  } else {
                    if (-10 == (param2 ^ -1)) {
                      break L123;
                    } else {
                      break L122;
                    }
                  }
                }
                var6 = 2;
                break L122;
              }
              L124: {
                L125: {
                  if (param3 == 4) {
                    break L125;
                  } else {
                    if (9 == param3) {
                      break L125;
                    } else {
                      break L124;
                    }
                  }
                }
                var5 = 2;
                break L124;
              }
              L126: {
                if (4 == param0) {
                  break L126;
                } else {
                  if (param0 == 9) {
                    break L126;
                  } else {
                    break L121;
                  }
                }
              }
              var7 = 2;
              break L121;
            }
          }
          L127: {
            if ((param1 ^ -1) == -2) {
              L128: {
                if ((param2 ^ -1) != -10) {
                  break L128;
                } else {
                  var6 = 1;
                  break L128;
                }
              }
              L129: {
                if (-10 != (param0 ^ -1)) {
                  break L129;
                } else {
                  var7 = 1;
                  break L129;
                }
              }
              if (9 == param3) {
                var5 = 1;
                break L127;
              } else {
                break L127;
              }
            } else {
              break L127;
            }
          }
          if (param4 <= -3) {
            L130: {
              var8 = 0;
              if (var5 == param1) {
                var8++;
                break L130;
              } else {
                break L130;
              }
            }
            if (param1 != var6) {
              L131: {
                if (3 != var8) {
                  break L131;
                } else {
                  if (var7 == param1) {
                    var8++;
                    break L131;
                  } else {
                    L132: {
                      var8 = var8 * 4;
                      if (param1 != 4) {
                        break L132;
                      } else {
                        L133: {
                          L134: {
                            if (-5 == (var8 ^ -1)) {
                              break L134;
                            } else {
                              if (8 != var8) {
                                break L133;
                              } else {
                                break L134;
                              }
                            }
                          }
                          L135: {
                            if (param3 == 2) {
                              break L135;
                            } else {
                              if ((param2 ^ -1) == -3) {
                                break L135;
                              } else {
                                if (-10 == (param3 ^ -1)) {
                                  break L135;
                                } else {
                                  if ((param2 ^ -1) == -10) {
                                    break L135;
                                  } else {
                                    break L133;
                                  }
                                }
                              }
                            }
                          }
                          var8 += 48;
                          break L133;
                        }
                        if (12 != var8) {
                          break L132;
                        } else {
                          L136: {
                            if (param3 == 2) {
                              break L136;
                            } else {
                              if (param2 == 2) {
                                break L136;
                              } else {
                                if (param3 == 9) {
                                  break L136;
                                } else {
                                  if (9 != param2) {
                                    break L132;
                                  } else {
                                    break L136;
                                  }
                                }
                              }
                            }
                          }
                          L137: {
                            L138: {
                              var8 += 24;
                              if (-3 == (param3 ^ -1)) {
                                break L138;
                              } else {
                                if ((param3 ^ -1) == -10) {
                                  break L138;
                                } else {
                                  break L137;
                                }
                              }
                            }
                            var8 += 8;
                            break L137;
                          }
                          L139: {
                            if (param2 == 2) {
                              break L139;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L139;
                              } else {
                                break L132;
                              }
                            }
                          }
                          var8 += 4;
                          break L132;
                        }
                      }
                    }
                    return var8;
                  }
                }
              }
              var8 = var8 * 4;
              if (param1 == 4) {
                L140: {
                  if (-5 == (var8 ^ -1)) {
                    L141: {
                      if (param3 == 2) {
                        break L141;
                      } else {
                        if ((param2 ^ -1) == -3) {
                          break L141;
                        } else {
                          if (-10 == (param3 ^ -1)) {
                            break L141;
                          } else {
                            if ((param2 ^ -1) == -10) {
                              break L141;
                            } else {
                              L142: {
                                if (12 != var8) {
                                  break L142;
                                } else {
                                  L143: {
                                    if (param3 == 2) {
                                      break L143;
                                    } else {
                                      if (param2 == 2) {
                                        break L143;
                                      } else {
                                        if (param3 == 9) {
                                          break L143;
                                        } else {
                                          if (9 != param2) {
                                            break L142;
                                          } else {
                                            break L143;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L144: {
                                    L145: {
                                      var8 += 24;
                                      if (-3 == (param3 ^ -1)) {
                                        break L145;
                                      } else {
                                        if ((param3 ^ -1) == -10) {
                                          break L145;
                                        } else {
                                          break L144;
                                        }
                                      }
                                    }
                                    var8 += 8;
                                    break L144;
                                  }
                                  L146: {
                                    if (param2 == 2) {
                                      break L146;
                                    } else {
                                      if ((param2 ^ -1) == -10) {
                                        break L146;
                                      } else {
                                        break L142;
                                      }
                                    }
                                  }
                                  var8 += 4;
                                  break L142;
                                }
                              }
                              return var8;
                            }
                          }
                        }
                      }
                    }
                    var8 += 48;
                    break L140;
                  } else {
                    if (8 != var8) {
                      break L140;
                    } else {
                      L147: {
                        L148: {
                          if (param3 == 2) {
                            break L148;
                          } else {
                            if ((param2 ^ -1) == -3) {
                              break L148;
                            } else {
                              if (-10 == (param3 ^ -1)) {
                                break L148;
                              } else {
                                if ((param2 ^ -1) == -10) {
                                  break L148;
                                } else {
                                  break L147;
                                }
                              }
                            }
                          }
                        }
                        var8 += 48;
                        break L147;
                      }
                      L149: {
                        if (12 != var8) {
                          break L149;
                        } else {
                          L150: {
                            if (param3 == 2) {
                              break L150;
                            } else {
                              if (param2 == 2) {
                                break L150;
                              } else {
                                if (param3 == 9) {
                                  break L150;
                                } else {
                                  if (9 != param2) {
                                    break L149;
                                  } else {
                                    break L150;
                                  }
                                }
                              }
                            }
                          }
                          L151: {
                            L152: {
                              var8 += 24;
                              if (-3 == (param3 ^ -1)) {
                                break L152;
                              } else {
                                if ((param3 ^ -1) == -10) {
                                  break L152;
                                } else {
                                  break L151;
                                }
                              }
                            }
                            var8 += 8;
                            break L151;
                          }
                          L153: {
                            if (param2 == 2) {
                              break L153;
                            } else {
                              if ((param2 ^ -1) == -10) {
                                break L153;
                              } else {
                                break L149;
                              }
                            }
                          }
                          var8 += 4;
                          break L149;
                        }
                      }
                      return var8;
                    }
                  }
                }
                if (12 == var8) {
                  L154: {
                    if (param3 == 2) {
                      break L154;
                    } else {
                      if (param2 == 2) {
                        break L154;
                      } else {
                        if (param3 == 9) {
                          break L154;
                        } else {
                          if (9 == param2) {
                            L155: {
                              L156: {
                                var8 += 24;
                                if (-3 == (param3 ^ -1)) {
                                  break L156;
                                } else {
                                  if ((param3 ^ -1) == -10) {
                                    break L156;
                                  } else {
                                    break L155;
                                  }
                                }
                              }
                              var8 += 8;
                              break L155;
                            }
                            L157: {
                              L158: {
                                if (param2 == 2) {
                                  break L158;
                                } else {
                                  if ((param2 ^ -1) == -10) {
                                    break L158;
                                  } else {
                                    break L157;
                                  }
                                }
                              }
                              var8 += 4;
                              break L157;
                            }
                            return var8;
                          } else {
                            return var8;
                          }
                        }
                      }
                    }
                  }
                  L159: {
                    L160: {
                      var8 += 24;
                      if (-3 == (param3 ^ -1)) {
                        break L160;
                      } else {
                        if ((param3 ^ -1) == -10) {
                          break L160;
                        } else {
                          break L159;
                        }
                      }
                    }
                    var8 += 8;
                    break L159;
                  }
                  if (param2 != 2) {
                    if ((param2 ^ -1) != -10) {
                      return var8;
                    } else {
                      var8 += 4;
                      return var8;
                    }
                  } else {
                    var8 += 4;
                    return var8;
                  }
                } else {
                  return var8;
                }
              } else {
                return var8;
              }
            } else {
              L161: {
                var8 += 2;
                if (3 != var8) {
                  break L161;
                } else {
                  if (var7 == param1) {
                    var8++;
                    break L161;
                  } else {
                    break L161;
                  }
                }
              }
              L162: {
                var8 = var8 * 4;
                if (param1 != 4) {
                  break L162;
                } else {
                  L163: {
                    L164: {
                      if (-5 == (var8 ^ -1)) {
                        break L164;
                      } else {
                        if (8 != var8) {
                          break L163;
                        } else {
                          break L164;
                        }
                      }
                    }
                    L165: {
                      if (param3 == 2) {
                        break L165;
                      } else {
                        if ((param2 ^ -1) == -3) {
                          break L165;
                        } else {
                          if (-10 == (param3 ^ -1)) {
                            break L165;
                          } else {
                            if ((param2 ^ -1) == -10) {
                              break L165;
                            } else {
                              break L163;
                            }
                          }
                        }
                      }
                    }
                    var8 += 48;
                    break L163;
                  }
                  if (12 != var8) {
                    break L162;
                  } else {
                    L166: {
                      if (param3 == 2) {
                        break L166;
                      } else {
                        if (param2 == 2) {
                          break L166;
                        } else {
                          if (param3 == 9) {
                            break L166;
                          } else {
                            if (9 != param2) {
                              break L162;
                            } else {
                              break L166;
                            }
                          }
                        }
                      }
                    }
                    L167: {
                      L168: {
                        var8 += 24;
                        if (-3 == (param3 ^ -1)) {
                          break L168;
                        } else {
                          if ((param3 ^ -1) == -10) {
                            break L168;
                          } else {
                            break L167;
                          }
                        }
                      }
                      var8 += 8;
                      break L167;
                    }
                    L169: {
                      if (param2 == 2) {
                        break L169;
                      } else {
                        if ((param2 ^ -1) == -10) {
                          break L169;
                        } else {
                          break L162;
                        }
                      }
                    }
                    var8 += 4;
                    break L162;
                  }
                }
              }
              return var8;
            }
          } else {
            return -51;
          }
        }
    }

    final static ru a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        ru stackIn_5_0 = null;
        ru stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ru stackOut_6_0 = null;
        ru stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (kp.a(false, param2, param1, param0)) {
              if (param3 <= -2) {
                stackOut_6_0 = rr.b(0);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (ru) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ls.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(vh param0, int param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = jq.b(7, param4);
              if (dt.field_b != null) {
                break L1;
              } else {
                dt.field_b = new java.security.SecureRandom();
                break L1;
              }
            }
            var12 = new int[4];
            var11 = var12;
            var8 = var11;
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (-5 >= (var9 ^ -1)) {
                      break L5;
                    } else {
                      var8[var9] = dt.field_b.nextInt();
                      var9++;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (null == sb.field_h) {
                    break L4;
                  } else {
                    if (sb.field_h.field_o.length >= var7_int) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                sb.field_h = new vh(var7_int);
                break L3;
              }
              if (param3 == 6727) {
                L6: {
                  L7: {
                    sb.field_h.field_q = 0;
                    sb.field_h.a(param6, param1, param4, param3 + -6621);
                    sb.field_h.b(var7_int, (byte) 100);
                    sb.field_h.a((byte) 31, var12);
                    if (ArmiesOfGielinor.field_L == null) {
                      break L7;
                    } else {
                      if ((ArmiesOfGielinor.field_L.field_o.length ^ -1) > -101) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ArmiesOfGielinor.field_L = new vh(100);
                  break L6;
                }
                ArmiesOfGielinor.field_L.field_q = 0;
                ArmiesOfGielinor.field_L.b(1, 10);
                var9 = 0;
                L8: while (true) {
                  L9: {
                    if (var9 >= 4) {
                      ArmiesOfGielinor.field_L.b(true, param4);
                      ArmiesOfGielinor.field_L.a(-5247, param5, param2);
                      param0.a(ArmiesOfGielinor.field_L.field_o, 0, ArmiesOfGielinor.field_L.field_q, 99);
                      param0.a(sb.field_h.field_o, 0, sb.field_h.field_q, 109);
                      break L9;
                    } else {
                      ArmiesOfGielinor.field_L.a((byte) -111, var12[var9]);
                      var9++;
                      if (var10 != 0) {
                        break L9;
                      } else {
                        continue L8;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var7);
            stackOut_25_1 = new StringBuilder().append("ls.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param5 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          L13: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param6 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L13;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -114) {
            return;
        }
        field_c = null;
    }

    static {
        field_c = new int[8192];
        field_d = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
