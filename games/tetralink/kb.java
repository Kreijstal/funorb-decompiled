/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends mc {
    int field_s;
    int field_o;
    int field_r;
    static String field_p;
    boolean field_n;
    static bc field_q;
    static int field_t;

    final static void a(boolean param0, le param1) {
        if (param1 == null) {
          return;
        }
        try {
          gl.field_o = param1;
          ck.field_bb.field_fb.b(1);
          if (param0) {
            field_t = -13;
          }
          ck.field_bb.a((byte) 112, gl.field_o);
          hi.field_a = true;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "kb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        bm.field_n = param0;
        uj.field_w = param2;
        wa.field_d = param1;
        if (param3 != -118) {
          kb.a(13);
        }
    }

    public static void a(int param0) {
        if (param0 != 111) {
          field_p = (String) null;
          field_q = null;
          field_p = null;
          return;
        }
        field_q = null;
        field_p = null;
    }

    kb(int param0, boolean param1, int param2) {
        this.field_n = param1 ? true : false;
        this.field_r = 0;
        this.field_s = param2;
        this.field_o = param0;
    }

    final static char a(char param0, int param1) {
        int var2;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        var2 = 88 % ((65 - param1) / 58);
        var3 = param0;
        if (var3 == 32) {
          return '_';
        }
        if (var3 == 160) {
          return '_';
        }
        if (var3 == 95) {
          return '_';
        }
        if (var3 == 45) {
          return '_';
        }
        if (var3 == 91) {
          return param0;
        }
        if (93 == var3) {
          return param0;
        }
        if (var3 == 35) {
          return param0;
        }
        if (var3 == 224) {
          return 'a';
        }
        if (225 == var3) {
          return 'a';
        }
        if (var3 == 226) {
          return 'a';
        }
        if (var3 == 228) {
          return 'a';
        }
        if (227 == var3) {
          return 'a';
        }
        if (192 == var3) {
          return 'a';
        }
        if (193 == var3) {
          return 'a';
        }
        if (var3 == 194) {
          return 'a';
        }
        if (var3 == 196) {
          return 'a';
        }
        if (var3 == 195) {
          return 'a';
        }
        if (232 == var3) {
          return 'e';
        }
        if (var3 == 233) {
          return 'e';
        }
        if (var3 == 234) {
          return 'e';
        }
        if (var3 == 235) {
          return 'e';
        }
        if (200 == var3) {
          return 'e';
        }
        if (201 == var3) {
          return 'e';
        }
        if (var3 == 202) {
          return 'e';
        }
        if (203 == var3) {
          return 'e';
        }
        if (var3 == 237) {
          return 'i';
        }
        if (var3 == 238) {
          return 'i';
        }
        if (239 == var3) {
          return 'i';
        }
        if (205 == var3) {
          return 'i';
        }
        if (var3 == 206) {
          return 'i';
        }
        if (207 == var3) {
          return 'i';
        }
        if (var3 == 242) {
          return 'o';
        }
        if (var3 == 243) {
          return 'o';
        }
        if (var3 == 244) {
          return 'o';
        }
        if (var3 == 246) {
          return 'o';
        }
        if (245 == var3) {
          return 'o';
        }
        if (210 == var3) {
          return 'o';
        }
        if (var3 == 211) {
          return 'o';
        }
        if (var3 == 212) {
          return 'o';
        }
        if (var3 == 214) {
          return 'o';
        }
        if (213 == var3) {
          return 'o';
        }
        if (249 == var3) {
          return 'u';
        }
        if (var3 == 250) {
          return 'u';
        }
        if (var3 == 251) {
          return 'u';
        }
        if (var3 == 252) {
          return 'u';
        }
        if (var3 == 217) {
          return 'u';
        }
        if (var3 == 218) {
          return 'u';
        }
        if (var3 == 219) {
          return 'u';
        }
        if (var3 == 220) {
          return 'u';
        }
        if (var3 == 231) {
          return 'c';
        }
        if (199 == var3) {
          return 'c';
        }
        if (255 == var3) {
          return 'y';
        }
        if (var3 == 376) {
          return 'y';
        }
        if (var3 == 241) {
          return 'n';
        }
        if (var3 == 209) {
          return 'n';
        }
        if (var3 != 223) {
          return Character.toLowerCase(param0);
        }
        return 'b';
    }

    static {
        field_p = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
