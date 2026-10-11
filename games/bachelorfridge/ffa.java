/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ffa extends kj {
    static String field_i;
    private int field_g;
    static String[][] field_j;
    private rb field_f;
    static String field_h;

    final boolean b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (this.field_g == 60) {
          jja.a(192, -1, 25);
          if (param0 > 21) {
            fieldTemp$0 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (fieldTemp$0 >= 0) {
              return false;
            }
            jja.a(256, -1, 19);
            dha.a(-120, this.field_f, this.field_e);
            return true;
          }
          field_j = (String[][]) null;
          fieldTemp$1 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          if (fieldTemp$1 >= 0) {
            return false;
          }
          jja.a(256, -1, 19);
          dha.a(-120, this.field_f, this.field_e);
          return true;
        }
        if (param0 <= 21) {
          field_j = (String[][]) null;
          fieldTemp$2 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          if (fieldTemp$2 >= 0) {
            return false;
          }
          jja.a(256, -1, 19);
          dha.a(-120, this.field_f, this.field_e);
          return true;
        }
        int fieldTemp$3 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if (fieldTemp$3 >= 0) {
          return false;
        }
        jja.a(256, -1, 19);
        dha.a(-120, this.field_f, this.field_e);
        return true;
    }

    ffa(gj param0, rb param1, int param2, int param3) {
        super(param0, param2, param3);
        try {
          this.field_f = param1;
          this.field_g = 80;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ffa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static k a(int param0, int param1) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        var2 = param1;
        if (var2 == 0) {
          return (k) ((Object) new kfa());
        }
        if (var2 == 1) {
          return (k) ((Object) new pma());
        }
        if (var2 == 2) {
          return (k) ((Object) new uv());
        }
        if (3 == var2) {
          return (k) ((Object) new pe());
        }
        if (var2 == 4) {
          return (k) ((Object) new ig());
        }
        if (5 == var2) {
          return (k) ((Object) new jia());
        }
        if (var2 == 6) {
          return (k) ((Object) new cd());
        }
        if (var2 == 7) {
          return (k) ((Object) new ska());
        }
        if (var2 == 8) {
          return (k) ((Object) new afa());
        }
        if (var2 == 9) {
          return (k) ((Object) new oba());
        }
        if (var2 == 10) {
          return (k) ((Object) new ada());
        }
        if (11 == var2) {
          return (k) ((Object) new wq());
        }
        if (var2 == 12) {
          return (k) ((Object) new et());
        }
        if (var2 == 13) {
          return (k) ((Object) new qa());
        }
        if (var2 == 14) {
          return (k) ((Object) new jh());
        }
        if (var2 == 15) {
          return (k) ((Object) new bh());
        }
        if (var2 == 16) {
          return (k) ((Object) new sk());
        }
        if (var2 == 17) {
          return (k) ((Object) new wt());
        }
        if (18 == var2) {
          return (k) ((Object) new an());
        }
        if (var2 == 19) {
          return (k) ((Object) new kba());
        }
        if (20 == var2) {
          return (k) ((Object) new ag());
        }
        if (21 == var2) {
          return (k) ((Object) new jq());
        }
        if (var2 == 22) {
          return (k) ((Object) new rc());
        }
        if (var2 == 23) {
          return (k) ((Object) new aea());
        }
        if (24 == var2) {
          return (k) ((Object) new sj());
        }
        if (var2 == 25) {
          return (k) ((Object) new wla());
        }
        if (var2 == 26) {
          return (k) ((Object) new wr());
        }
        if (var2 == 27) {
          return (k) ((Object) new hda());
        }
        if (var2 == 28) {
          return (k) ((Object) new gt());
        }
        if (var2 == 29) {
          return (k) ((Object) new ama());
        }
        if (30 == var2) {
          return (k) ((Object) new ef());
        }
        if (var2 == 31) {
          return (k) ((Object) new oj());
        }
        if (32 == var2) {
          return (k) ((Object) new fn());
        }
        if (var2 == 33) {
          return (k) ((Object) new qna());
        }
        if (var2 == 34) {
          return (k) ((Object) new dc());
        }
        if (35 == var2) {
          return (k) ((Object) new qk());
        }
        if (var2 == 36) {
          return (k) ((Object) new kma());
        }
        if (var2 == 37) {
          return (k) ((Object) new lfa());
        }
        if (38 == var2) {
          return (k) ((Object) new qca());
        }
        if (var2 == 39) {
          return (k) ((Object) new qb());
        }
        if (param0 == -16) {
          return null;
        }
        field_i = (String) null;
        return null;
    }

    final static void a(String param0, int param1) {
        try {
          re.field_D = param0;
          ep.a(param1, 8192);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ffa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = (400 + (-(this.field_g * 655360) + 52428800 >> 16)) * this.field_g / 80;
        if (param1) {
          hr.field_c.a(param2, param0 + (-var4 - 64), 192);
          return;
        }
    }

    public static void c(int param0) {
        field_j = (String[][]) null;
        field_h = null;
        field_i = null;
        if (param0 != 22533) {
          String var2 = (String) null;
          ffa.a((String) null, -3);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.a(-61, 93, 65);
        }
    }

    static {
        field_i = "Only show game chat from my friends";
        field_h = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
